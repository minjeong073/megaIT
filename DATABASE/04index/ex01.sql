CREATE TABLE `student` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` varchar(16) NOT NULL,
    `major` varchar(16) NOT NULL,
    `number` varchar(32) NOT NULL,
    INDEX `idx_name` (`name`),
    INDEX `idx_name_major` (`name`, `major`), -- name, major 세트로 묶어서 index 생성
    UNIQUE INDEX `idx_number` (`number`)	-- 중복값을 허용하지 않는 유일한 값을 갖는 키
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE `student`;

-- 따로 추가하기
CREATE TABLE `student` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` varchar(16) NOT NULL,
    `major` varchar(16) NOT NULL,
    `number` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE `student` ADD INDEX `idx_name` (`name`);

ALTER TABLE `student` ADD INDEX `idx_name_major` (`name`, `major`);

ALTER TABLE `student` ADD INDEX `idx_number` (`number`);