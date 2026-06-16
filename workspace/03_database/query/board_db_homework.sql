show databases;

-- board_db라는 데이터베이스 생성
create database board_db;

-- 생성한 데이터베이스로 전환하여 이후 쿼리가 해당 데이터베이스를 대상으로 실행되도록 설정;
use board_db;

-- 테이블 삭제 (가능하면 사용하지 말것)
drop table member;
drop table post;
drop table comment;

-- 회원 테이블 생성
create table member(
	id int auto_increment primary key, -- 순차적으로 자동 번호 부여
	email varchar(100) not null unique, -- 최대 100자까지는 허용, 비어있지않음, 중복 없음
	password varchar(255) not null,
	name varchar(100) not null,
	created_at datetime default CURRENT_TIMESTAMP() -- 생략하면 현재 시간을 생성하여 자동을 채워라
);

-- 게시글 테이블 생성
create table post(
	id int auto_increment primary key,
	member_id int not null,
	subject varchar(100) not null,
	content varchar(1000) not null,
	created_at datetime default current_timestamp(),
	constraint foreign key(member_id) references member (id)
	);

-- 댓글 테이블 생성
create table comment(
	id int auto_increment primary key,
	post_id int not null,
	member_id int not null,
	content varchar(1000) not null,
	created_at datetime default CURRENT_TIMESTAMP(),
	constraint foreign key(post_id) references post(id),
	constraint foreign key(member_id) references member(id)
);

-- 회원 테이블에 데이터 추가
insert into member (email, password, name) values
	 ('park@gmail.com', '123', '박');
insert into member (email, password, name) values
	 ('nam@gmail.com', '234', '남'),
	 ('soo@gmail.com', '345', '수'),
	 ('academy@gmail.com', '456', '학원');

-- 회원 테이블 레코드 조회
select id, email, password, name, created_at from member;

-- 회원 테이블 레코드 수정
update member set password=123 where id=3;

-- 회원 테이블의 레코드 삭제
delete from member where id=1;


-- 게시글 테이블 CRUD
insert  into post(member_id, subject, content) values
	(1, '안녕하세요', '반가워요'),
	(2, '질문있어요', 'DB는 어렵나요'),
	(1, '두 번째 게시글', '오늘 날씨가 좋네요'),
	(2, 'MYSQL 설치가 오류가 났네요', '어떻게 할까요?'),
	(3, '자기소개', '안녕하세요 용쌤입니..');
-- 게시글 테이블 레코드 조회
select id, member_id, subject, content, created_at from post; 
-- 게시글 테이블 레코드 수정
update post set subject = '자고 일어나보니' where id = 3;
-- 게시글 테이블 레코드 삭제
delete from post where id=3;


-- 댓글 테이블 CRUD
insert into comment (post_id, member_id, content) values
	 (1, 2, '환영합니다'),
	 (1, 3, '반가워요'),
	 (3, 1, '오래간만에 보는 햇빛이네요'),
	 (4, 3, '다시 설치하세요'),
	 (5, 1, '다시 설치하는게 국룰입니다');

-- 답글 테이블 레코드 조회
select id, post_id, member_id, content, created_at from comment; 
-- 답글 테이블 레코드 수정
update comment set content = '비가 오는걸요?' where post_id = 3;
-- 답글 테이블 레코드 삭제
delete from post where id=3;

show tables;
