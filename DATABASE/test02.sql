-- 1. 테이블 생성
CREATE TABLE `review` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `store` varchar(8) NOT NULL,
    `menu` varchar(8) NOT NULL,
    `point` decimal(2,1) DEFAULT 3.5,
    `review` varchar(256) NULL,
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DESC `review`;

-- 2. 컬럼 변경
ALTER TABLE `review` ADD COLUMN `userName` varchar(32) NOT NULL AFTER `menu`;

-- 3. 컬럼 타입 수정
ALTER TABLE `review` MODIFY COLUMN `menu` varchar(32) NOT NULL;
ALTER TABLE `review` CHANGE COLUMN `store` `storeName` varchar(32) NOT NULL;
