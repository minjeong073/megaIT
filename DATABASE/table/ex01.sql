--  테이블 생성하기
-- 행번호, 이름, 생년월일, 취미, 자기소개, 작성시간, 수정시간


CREATE TABLE `person` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` varchar(16) NOT NULL,
    `birth` int NOT NULL,
    `hobby` varchar(64) NOT NULL,
    `introduce` text,
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updateAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 테이블 상태 확인

DESC `person`;

-- 테이블 삭제
DROP TABLE `person`;

-- 테이블 수정하기
--  1. 테이블 이름 변경
ALTER TABLE `person` RENAME `user`;

DESC `user`;

-- 2. 항목 추가 (email)
ALTER TABLE `user` ADD COLUMN `email` varchar(16) NULL;
-- NULL 쓸 수도 쓰지 않을 수도 있음


-- 3. 컬럼 수정 (email 32자 까지) -> 전체 내용 수정
ALTER TABLE `user` MODIFY COLUMN `email` varchar(32) NULL;


-- 4. 컬럼 이름 수정 + 타입 수정 (birth (int) -> yyyymmdd (char))
ALTER TABLE `user` CHANGE COLUMN `birth` `yyyymmdd` char(8) NOT NULL;
