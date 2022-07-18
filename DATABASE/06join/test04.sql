-- singer - name, debut, agency
-- album - title, releaseDate, tracks, 
-- music - title, playTime, lyricist, composer


-- 1. 테이블 생성

CREATE TABLE `singer` (
    `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` varchar(8) NOT NULL,
    `debut` int NOT NULL,
    `agency` varchar(16) NOT NULL,
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `album` (
    `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `singerId` int NOT NULL,
    `title` varchar(32) NOT NULL,
    `releaseDate` date NOT NULL,
    `tracks` tinyint NOT NULL,
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `music` (
    `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `albumId` int NOT NULL,
    `title` varchar(32) NOT NULL,
    `playTime` int NOT NULL,
    `lyricist` varchar(8) NOT NULL,
    `composer` varchar(8) NOT NULL,
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DESC `singer`;
DESC `album`;
DESC `music`;


-- 2. 데이터 저장

INSERT INTO `singer`
(`name`, `debut`, `agency`, `createdAt`, `updatedAt`)
VALUES
('성시경', 2000, '에스케이재원', now(), now()),
('AKMU', 2014, 'YG엔터테인먼트', now(), now()),
('아이유', 2008, '이담엔터테인먼트', now(), now());

INSERT INTO `album`
(`singerId`, `title`, `releaseDate`, `tracks`, `createdAt`, `updatedAt`)
VALUES
(1, 'The Ballads', '2006-10-10', 16, now(), now()),
(1, '여기, 내 맘속에...', '2008-06-12', 11, now(), now()),
(2, '항해', '2019-09-25', 10, now(), now()),
(2, 'SUMMER EPISODE', '2017-07-20', 4, now(), now()),
(3, 'Love poem', '2019-11-18', 6, now(), now()),
(3, 'Palette', '2017-04-21', 6, now(), now());

INSERT INTO `music`
(`albumId`, `title`, `playTime`, `lyricist`, `composer`, `createdAt`, `updatedAt`)
VALUES
(1, '거리에서', 279, '윤종신', '윤종신', now(), now()),
(1, '그리운 날엔', 250, '심재희', '김형석', now(), now()),
(1, '바람, 그대', 250, '이미나', '하림', now(), now()),
(2, '여기 내 맘속에', 250, '이미나', '유희열', now(), now()),
(2, '안녕 나의 사랑', 257, '유희열', '성시경', now(), now()),
(3, '어떻게 이별까지 사랑하겠어, 널 사랑하는 거지', 290, '이찬혁', '이찬혁', now(), now()),
(4, 'DINOSAUR', 240, '이찬혁', '이찬혁', now(), now()),
(4, 'MY DARLING', 225, '이찬혁', '이찬혁', now(), now()),
(5, 'Blueming', 217, '아이유', '이종훈', now(), now()),
(5, 'Love poem', 258, '아이유', '이종훈', now(), now()),
(6, '밤편지', 253, '아이유', '김희원', now(), now()),
(6, '팔레트', 217, '아이유', '아이유', now(), now());

SELECT * FROM `singer`;
SELECT * FROM `album`;
SELECT * FROM `music`;


-- 3. 발매일 조건
SELECT M.title, M.composer, A.title
FROM `album` AS `A`
JOIN `music` AS `M`
ON A.id = M.albumId
WHERE A.releaseDate LIKE '201%';


-- 4. 가수별 총 노래 수
SELECT S.name, S.debut, count(*) AS `count`
FROM `singer` AS `S`
JOIN `album` AS `A`
ON S.id = A.singerId
JOIN `music` AS `M`
ON A.id = M.albumId
WHERE S.debut > 2005
GROUP BY S.id
ORDER BY `count` DESC;


-- 5. AKMU 노래
SELECT S.name, M.title, M.playTime, A.title AS `album title`
FROM `singer` AS `S`
JOIN `album` AS `A`
ON S.id = A.singerId
JOIN `music` AS `M`
ON A.id = M.albumId
WHERE S.name = 'AKMU';


-- 6. 기간 내의 노래
SELECT M.title, S.name, M.playTime, A.title AS `album title`
FROM `singer` AS `S`
JOIN `album` AS `A`
ON S.id = A.singerId
JOIN `music` AS `M`
ON A.id = M.albumId
WHERE A.releaseDate > '2008-01-01' AND A.releaseDate < '2019-01-01' AND M.playTime >= 240;


-- 7. 앨범별 총 재생 시간
SELECT S.name, A.title, A.tracks, sum(M.playTime) AS `playTime`
FROM `singer` AS `S`
JOIN `album` AS `A`
ON S.id = A.singerId
JOIN `music` AS `M`
ON A.id = M.albumId
GROUP BY A.id
HAVING `playTime` > 470
ORDER BY `playTime`;
