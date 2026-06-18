-- 2번 회원 탈퇴서 계시글 삭제 옵션을 선택한 경우
SELECT * FROM POST;

select * FROM member;

START transaction ;

-- 2번 회원의 게시글 먼저 삭제
DELETE FROM post WHERE member_id = 2; -- reply cascade로 자동 삭제됨

-- 2번 회원 삭제
delete from member where id = 2;


-- 정상 완료하여 DB에 반영
commit;

-- 오류가 발생하여 원래 상태로 복구
rollback;

-- 격리수준 확인
SELECT @@transaction_isolation;