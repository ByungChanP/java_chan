-- 가장 오래된 회원의 가입일
select min(created_at) from member;

-- 회원 정보 조회
select * from member; 

-- 가장 오래전에 가입한 회원의 정보를 조회
select *
from member
where created_at = (select min(created_at) from member);

-- 게시글을 작성한 회원 조회
select distinct member_id
from post
where member_id is not null;

-- 게시글을 하나라도 작성한 회원의 정보를 조회
select *
from  member
where id in (1,2);

-- 게시글을 하나라도 작성한 회원의 정보를 조회
select *
from  member
where id in (select distinct member_id from post where member_id is not null);

-- 게시글 조회(id, title)
select id, title from post;

-- 1번 게시글의(post_id) 댓글수와 정보를 조회
select count(*) from reply where post_id  = 1;

-- 각 게시글과 함께 해당 게시글의 댓글 수를 조회 (서브쿼리)
select id, title, (select count(*) from reply where post_id  = post.id) as reply_count
from post;

-- 각 게시글과 함께 해당 게시글의 댓글 수를 조회 (join)
select p.id, p.title, count(r.content)
from post p
left join reply r on p.id = r.post_id
group by p.id, p.title;

-- 게시글을 하나라도 작성한 회원 id 추출
select distinct member_id
from post
where member_id is not null;

-- 게시글은 한 건이라도 작성한 회원의 게시글 수를 조회
select member_id, count(*) as cnt
from post
where member_id is not null
group by member_id;

-- 게시글은 한 건이라도 작성한 회원의 평균 게시글 수를 조회
select AVG(cnt)
from (
	select member_id, count(*) as cnt
	from post
	where member_id is not null
	group by member_id
) as sub;

-- 게시글은 한 건이라도 작성한 회원의 평균 게시글 수보다 많은 글을 작성한 회원을 조회
select member_id, count(*) as post_count
from post
where member_id is not null
group by member_id
having count(*) > (select AVG(cnt)
from (
	select member_id, count(*) as cnt
	from post
	where member_id is not null
	group by member_id
	) as sub
);

select 1 from post where member_id = 5; -- true

-- 게시글을 한 건이라도 작성한 회원만 조회 (EXISTS 사용)
SELECT m.id, m.name, m.email
FROM member m
WHERE EXISTS (SELECT 1 FROM post p WHERE p.member_id = m.id);

-- 댓글이 달린 게시글만 조회 (NOT EXISTS로 반대 조건도 가능)
SELECT p.id, p.title
FROM post p
WHERE EXISTS (SELECT 1 FROM reply r WHERE r.post_id = p.id);