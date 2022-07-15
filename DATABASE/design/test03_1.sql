-- 부동산 매물 테이블 만들기

CREATE TABLE `realtor` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `office` varchar(16) NOT NULL,
    `phoneNumber` varchar(16) NOT NULL,
    `address`	varchar(64) NOT NULL,
    `grade` varchar(8) NOT NULL,
    `createdAt`	timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `real_estate` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `realtorId` int NOT NULL,
    `address` varchar(64) NOT NULL,
    `area` decimal(4,1) NOT NULL,
    `type` char(2) NOT NULL,
    `price` int NOT NULL,
    `rentPrice` int,
    `createdAt`	timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `realtor`
(`office`, `phoneNumber`, `address`, `grade`, `createdAt`, `updatedAt`)
VALUES
('황금부동산', '02-300-2000', '서울시 서초구', '안심중개사', now(), now()),
('대박부동산', '02-000-7777', '서울시 동작구', '일반중개사', now(), now());

SELECT * FROM `realtor`;

INSERT INTO `real_estate`
(`realtorId`, `address`, `area`, `type`, `price`, `rentPrice`, `createdAt`, `updatedAt`)
VALUES
(1, '레미얀 레이크 아파트 301동 905호', 84, '전세', 40000, null, now(), now()),
(2, '레알편한세상 시티 505동 101호', 110, '매매', 120000, null, now(), now()),
(1, '롱데캐슬 101동 402호', 87, '월세', 20000, 200, now(), now()),
(1, '슼뷰 오피스텔 1210호', 55, '월세', 10000, 100, now(), now()),
(2, '푸르지용 리버 203동 804호', 123, '매매', 170000, null, now(), now());

SELECT * FROM `real_estate`;

-- 매물 찾기
SELECT * FROM `realtor` WHERE `office` = '황금부동산';

SELECT `address`, `price`, `rentPrice` FROM `real_estate`
WHERE `realtorId` = 1 AND `type` = '월세';


-- ex) CREATE TABLE `option` (
-- 		`에어컨`
--    	`세탁기`
--     	`냉장고`
--     	`옷장`
--     	...
-- 		)
-- -> 문제
--  - col 개수 많아짐
--  - 옵션이 없는 경우 낭비
--  - 새로운 옵션이 생기거나 사라지는 경우 table 새로 만들어야 할 수도

CREATE TABLE `option` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `realEstateId` int NOT NULL,
    `option` varchar(16) NOT NULL,
    `createdAt`	timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `option`
(`realEstateId`, `option`, `createdAt`, `updatedAt`)
VALUES
(2, '냉장고', now(), now()),
(2, '세탁기', now(), now()),
(2, '식기세척기', now(), now()),
(4, '에어컨', now(), now());

SELECT * FROM `option`;

-- 세탁기가 옵션에 있는 매물 주소 조회
SELECT * FROM `option` WHERE `option` = '세탁기';
SELECT `address` FROM `real_estate` WHERE `id` = 2;