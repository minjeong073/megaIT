
CREATE TABLE `bookmark` (
	`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` varchar(16) NOT NULL,
    `url` varchar(64) NOT NULL,
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DESC `bookmark`;

INSERT INTO `bookmark`
(`name`, `url`, `createdAt`, `updatedAt`)
VALUES
('마론달', 'http://marondal.com', now(), now()),
('구글',	'https://google.com', now(), now()),
('네이버', 'https://naver.com', now(), now()),
('다음',	'https://daum.net', now(), now());

SELECT * FROM `bookmark` ORDER BY `id` DESC;

DELETE FROM `bookmark` WHERE `id` = 1;
