SELECT * FROM `user`;

SELECT * FROM `user` WHERE `hobby` LIKE '%독서%';

-- 1종속화
INSERT INTO `user`
(`name`, `yyyymmdd`, `hobby`, `introduce`, `createdAt`, `updatedAt`, `email`)
VALUES
('김민정', '19980730', '독서', '안녕하세요 저는 누구일까요?', now(), now(), 'a@gmail.com'),
('김민정', '19980730', '노래', '안녕하세요 저는 누구일까요?', now(), now(), 'a@gmail.com'),
('김민정', '19980730', '영화', '안녕하세요 저는 누구일까요?', now(), now(), 'a@gmail.com');

SELECT * FROM `user` WHERE `hobby` = '독서';


-- new_user, hobby table

CREATE TABLE `new_user` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `name` varchar(32) NOT NULL,
  `yyyymmdd` char(8) NOT NULL,
  `introduce` text,
  `email` varchar(32) NOT NULL,
  `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
  `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `hobby`(
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `userId` int NOT NULL ,
  `hobby` varchar(16) NOT NULL,
  `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
  `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `new_user`
(`name`, `yyyymmdd`, `introduce`, `email`, `createdAt`, `updatedAt`)
VALUES
('김민정', '19980730', '안녕하세요 저는 누구일까요?', 'a@gmail.com', now(), now()),
('김바다', '20011023', '야옹~~~', 'bada@naver.com', now(), now());

SELECT * FROM `new_user`;

INSERT INTO `hobby`
(`userId`, `hobby`, `createdAt`, `updatedAt`)
VALUES
(1, '독서', now(), now()),
(1, '노래', now(), now()),
(1, '영화감상', now(), now()),
(2, '사냥하기', now(), now()),
(2, '스크래치', now(), now());

SELECT * FROM `hobby`;

-- 영화감상이 취미인 사용자의 이름, 생년월일 조회
SELECT * FROM `hobby` WHERE `hobby` = '영화감상'; 
-- 결과 1

SELECT `name`, `yyyymmdd` FROM `new_user` WHERE `id` = 1;

