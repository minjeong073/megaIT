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
