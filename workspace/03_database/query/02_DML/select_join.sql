-- 모든 게시글의 모든 컬럼 조회
SELECT *
FROM POST;

-- 모든 게시글의 id, member_id, title, view_count 컬럼 조회
SELECT id, member_id, title, view_count
FROM POST;

-- 모든 게시글의 id, member_id , title, view_count, 작성자 이름, 작성자 이메일 컬럼 조회
SELECT post.id, member_id, title, view_count, member.id, member.name, member.email
FROM POST
inner join member on post.member_id = member.id;

-- 모든 게시글의 id, member_id , title, view_count, 작성자 이름, 작성자 이메일 컬럼 조회(alias 사용)
SELECT p.id, member_id, title, view_count, m.id, m.name, m.email
FROM POST p
inner join member AS m on p.member_id = m.id;

-- 모든 댓글의 작성자, 원본 게시글 제목을 조회
select * from reply;

-- 모든 댓글의 id, content, member_id, post_id 조회
select id, content, member_id, post_id
from reply;

-- 모든 댓글의 id, content, member_id, post_id 조회
select reply.id, reply.content, reply.member_id, reply.post_id, member.name, post.title
from reply 
inner join member  on reply.member_id = member.id
inner join post on reply.post_id = post_id;

-- 게시글 기준으로 정렬
select post.title 게시글, reply.content 댓글, member.name 댓글작성자
from reply 
inner join member  on reply.member_id = member.id
inner join post on reply.post_id = post_id
order by post.id desc, reply.id ASC;

-- ------------------- ------------------------------------------------LEFT OUTER JOIN

SELECT p.id, p.member_id, p.title, p.view_count, m.name, m.email
FROM POST p
LEFT OUTER join member AS m on p.member_id = m.id;

-- 전체 회원 목록과 각 회원이 작성한 게시글 수를 조회하세요 (게시글을 작성하지 않은 회원도 포함되어야 함)
select * from member m ;
select m.id, m.name, count(p.id) as post_count
from member m
left join post as p on m.id = p.member_id
group by m.id, m.name;


-- ------------------- ------------------------------------------------RIGHT OUTER JOIN

SELECT p.id, p.member_id, p.title, p.view_count, m.name, m.email
FROM POST p
RIGHT OUTER join member AS m on p.member_id = m.id;

SELECT p.id, p.member_id, p.title, p.view_count, m.name, m.email
FROM member m
left OUTER join post AS p on p.member_id = m.id;

-- ------------------------------------------------------------------- FULL OUTER JOIN (MYSQL은 지원하지 않으므로 UNION으로 대체)
select m.id as member_id, m.name, p.title
from member m
left join post p on m.id = p.member_id
UNION
select m.id as member_id, m.name, p.title
from member m
right join post p on m.id = p.member_id;

-- ------------------------------------------------------------------- SELF JOIN 
-- 회원명과 추천인 명을 조회
select * from member;
select m1.name 회원명, m1.recommender_id 추천인, IFNULL(m2.name, '없음') 추천인명
from member m1
left join member as m2 on m1.recommender_id  = m2.id; -- 모든 회원명과 추천인명을 조회
-- inner join member as m2 on m1.recommender_id  = m2.id; -- 추천인이 있는 회원명과 추천인명을 조회
