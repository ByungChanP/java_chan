-- 회원 이름 조회
SELECT name, email, concat(name, '(', email, ')') as member_info
FROM MEMBER;

--  각 회원의 이메일 바이트 크기를 조회
select email, LENGTH('hello'), length('안녕하세요'), length(email) as email_length
from member;

-- 게시글 본문 중 '안녕하세요'가 있는 내용을 찾아서 Hi로 수정
select content, replace(content, '안녕하세요', 'Hi!!') as replaced_contetn
from post
where content like '%안녕하세요%';

-- 게시글 본문의 첫 10글자만 미리보기로 가져오기
-- 잘린 뒷부분은 ... 으로 표시
select title, concat(SUBSTRING(title, 1, 10), ' ...') as preview
from post;

-- 이메일을, 소문자, 대문자로 조회
select email, LOWER(email) as email_Lower, UPPER(email) as email_Upper
from member;

-- 이메일 앞뒤 공백 제거 <기능 구현에 중요>
select email, TRIM(email) as trimmed_email
from member;

-- 현재 날짜와 시간을 조회
select NOW() as current_datetime;


-- 게시글 작성일을 연-월-일 형태로 조회
select id, title, DATE_FORMAT(created_at, '%Y년 %m월 %d일 %a %H시 %i분 %s초') as write_date
from  post;

-- 현재 날짜만 조회
select curdate() as curr_date;

-- 오늘 작성된 게시글만 조회
select id, title, created_at
from post
where created_at >= CURDATE();

-- 최근 7일 이내에 가입한 회원을 조회
select id, name, created_at, curdate(), DATE_SUB(curdate(), interval 7 day) as before_7days
from member
where created_at >= DATE_SUB(curdate(), interval 7 day);

-- 가입한지 몇일 몇시간이 지난 회원 조회
select *,DATE_FORMAT(created_at, '%Y-%m-%d' ) as created_date ,  DATE_SUB(curdate(), interval '35 4' DAY_HOUR) as before_1month
from member
where created_at <= DATE_SUB(curdate(), interval '30 12' DAY_HOUR);

-- 각 회원의 가입 경과일수를 조회 (로그인 경우 휴면 계정 조건)
select name, created_at, DATEDIFF(CURDATE(), created_at) as days_since_join 
from member;

-- 모든 회원수를 조회
select count(*)
from member;

-- 모든 게시글 수를 조회
select count(*)
from post;

-- id =3인 회원의 총 게시글 수 조회
select member_id, count(*) as total_count
from post
where member_id = 3;

-- id =3인 회원의 모든 게시물의 조회수 조회
select member_id, view_count
from post
where member_id = 3;

-- id =3인 회원의 모든 게시물의 집계함수
select member_id, count(*) as total_count, Sum(view_count) as total_views, AVG(view_count) as avg_views,
MIN(view_count) as min_views, Max(view_count) as max_views 
-- , title
from post
where member_id = 3;

select title
from post where member_id  = 3;

-- 전화번호가 NULL인 회원은 '미등록'으로 표시하여 조회
SELECT name, IFNULL(phone, '미등록') AS phone
    FROM member;

-- 전화번호가 NULL이면 이메일을, 이메일도 NULL이라면 '연락처 없음' 으로 조회
SELECT name, IFNULL(phone, IFNULL(email,'연락처 없음')) AS phone
    FROM member;
-- 
SELECT name, COALESCE(phone, email, '연락처 없음') AS phone
    FROM member;
-- 
select name, if(phone is null, if(email is null, '연락처 없음', email), phone) as phone_status 
from member;

-- 전화번호 목록 여부에 따라 상태를 다르게 표시
select name, if(phone is null, '연락처 없음', '연락처 있음') as phone_status 
from member;

-- 회원 가입 연도에 따른 회원 등급 부여 조회
SELECT name, created_at,
    CASE
        WHEN created_at < DATE_SUB(NOW(), INTERVAL 1 YEAR) THEN '우수 회원'
        WHEN created_at < DATE_SUB(NOW(), INTERVAL 1 MONTH) THEN '일반 회원'
        ELSE '신규 회원'
    END AS member_grade
    FROM member;
