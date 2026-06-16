-- 각 회원별로 작성한 게시글 수를 조회
select member_id, count(*)
from post
group by member_id;

-- 각 게시글 별로 댓글 수 조회
select post_id, count(content) as reply_count
from reply
group by post_id
order by reply_count desc;

-- 회원별로 작성한 게시글의 수, 총 조회수 조회 (게시글 오름차순, 조회수 내림차순 정렬)
select  member_id, count(*) as post_count, Sum(view_count) as total_views
from post
group by member_id
order by post_count asc, total_views desc;

-- 가입 연도별 회원수 조회하기
select DATE_FORMAT(created_at, '%Y') as join_year , count(*) join_count
from member
group by date_format(created_at, '%Y');

-- 게시글이 5개 이상인 경우에만 조회
select  member_id, count(*) as post_count, Sum(view_count) as total_views
from post
group by member_id
having count(*) >=5 -- select는 마지막에 실행되기 때문에 post_count는 안되는 엔진이 존재함
order by post_count, total_views desc;

-- 에러 발생: title이 GROUP BY 기준에 존재하지 않음
SELECT member_id, max(title), COUNT(*) AS post_count
    FROM post
    GROUP BY member_id;

-- 해결 방법 2: group_concat을 사용해 여러 개의 title을 하나의 텍스트로 합침
SELECT member_id, GROUP_CONCAT(title separator ',  '), COUNT(*) AS post_count
    FROM post
    GROUP BY member_id;

SELECT member_id, title, COUNT(*) AS post_count
    FROM post
    GROUP BY member_id, title;

-- 게시글을 2개 이상 작성한 회원의 id와 게시글 수 조회
-- 에러 발생: 아직 그룹화되지 않은 상태인 WHERE 절에서 집계 함수 COUNT(*)를 사용하려 함
-- SELECT member_id, COUNT(*)
--    FROM post
--    WHERE COUNT(*) >= 2 -- 집계함수는 WHERE절에서 사용을 못함
--    GROUP BY member_id;
-- FROM, WHERE, GROUP BY,HAVING, SELECT, ORDER BY 순서대로 실행됨

-- 2026년 6월에 작성된 게시글을 대상으로, 작성한 글 개수가 2개 이상인 회원 그룹만 조회
SELECT member_id, COUNT(*) AS post_count
    FROM post
    WHERE DATE_FORMAT(created_at, '%Y-%m') = '2026-06' -- 먼저 필터링
    GROUP BY member_id
    HAVING COUNT(*) >= 2;