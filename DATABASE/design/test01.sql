-- 1. 성적 테이블 나누기
-- 중복 : id, name, phoneNumber, email, dreamJob
-- 		- 성적 : year, semester, term, subject, score

CREATE TABLE `new_students` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` varchar(16) NOT NULL,
    `phoneNumber` varchar(16) NOT NULL,
    `email` varchar(32) NOT NULL,
    `dreamJob` varchar(16) NOT NULL,
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `new_score` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `studentId` int NOT NULL,
    `year` int NOT NULL,
    `semester` tinyint NOT NULL,
    `term` char(4) NOT NULL,
    `subject` varchar(16) NOT NULL,
    `score` tinyint NOT NULL,
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DESC `new_students`;
DESC `new_score`;

-- 2. insert

INSERT INTO `new_students`
(`name`, `phoneNumber`, `email`, `dreamJob`, `createdAt`, `updatedAt`)
VALUES
('유재석', '01000001111', 'mc_u@naver.com', '프로그래머', now(), now()),
('조세호', '01011110000', 'mrjo@gmail.com', '모델', now(), now());

SELECT * FROM `new_students`;

INSERT INTO `new_score`
(`studentId`, `year`, `semester`, `term`, `subject`, `score`, `createdAt`, `updatedAt`)
VALUES
(1, 2020, 1, '중간고사', '국어', 80, now(), now()),
(1, 2020, 1, '중간고사', '영어', 95, now(), now()),
(1, 2020, 1, '중간고사', '수학', 90, now(), now()),
(2, 2020, 1, '중간고사', '국어', 85, now(), now()),
(2, 2020, 1, '중간고사', '영어', 90, now(), now()),
(2, 2020, 1, '중간고사', '수학', 70, now(), now());

SELECT * FROM `new_score`;

-- 3. 성적 출력
-- year, semeseter, term, subject, score

SELECT `id` FROM `new_students` WHERE `name` = '조세호';		-- 2

SELECT `year`, `semester`, `term`, `subject`, `score` FROM `new_score`
WHERE `studentId` = 2;


