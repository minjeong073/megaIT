-- 1. 부동산 매물 테이블

-- real estate - officeId, address, area, type, price, rentPrice
-- realtor - office, phoneNumber, address, grade

CREATE TABLE `realtor` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `office` varchar(16) NOT NULL,
    `phoneNumber` varchar(16) NOT NULL,
    `address` varchar(32) NOT NULL,
    `grade` varchar(8) NOT NULL,
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `real_estate` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `realtorId` int NOT NULL,
    `address` text NOT NULL,
    `area` int NOT NULL,
    `type` char(2) NOT NULL,
    `price` int NOT NULL,
    `rentPrice` int NULL,
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DESC `realtor`;
DESC `real_estate`;
DROP TABLE `real_estate`;
-- 2. 정보 입력

INSERT INTO `realtor`
(`office`, `phoneNumber`, `address`, `grade`, `createdAt`, `updatedAt`)
VALUES
('황금부동산', '02-300-2000', '서울시 서초구', '안심중개사', now(), now()),
('대박부동산', '02-000-7777', '서울시 동작구', '일반중개사', now(), now());

INSERT INTO `real_estate`
(`realtorId`, `address`, `area`, `type`, `price`, `rentPrice`, `createdAt`, `updatedAt`)
VALUES
(1, '레미얀 레이크 아파트 301동 905호', 84, '전세', 40000, null, now(), now()),
(2, '레알편한세상 시티 505동 101호', 110, '매매', 120000, null, now(), now()),
(1, '롱데캐슬 101동 402호', 87, '월세', 20000, 200, now(), now()),
(1, '슼뷰 오피스텔 1210호', 55, '월세', 10000, 100, now(), now()),
(2, '푸르지용 리버 203동 804호', 123, '매매', 170000, null, now(), now());

SELECT * FROM `realtor`;
SELECT * FROM `real_estate`;

-- 3. 매물 찾기

SELECT `id` FROM `realtor` WHERE `office` = '황금부동산';		
-- 결과 1

SELECT `address` AS '매물 주소', `price` AS '보증금', `rentPrice` AS '월세' FROM `real_estate`
WHERE `realtorId` = 1 AND `type` = '월세';

-- 4. 옵션 리스트

CREATE TABLE `option` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `realEstateId` int NOT NULL,
    `type` varchar(16) NOT NULL,
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DESC `option`;

INSERT INTO `option` 
(`realEstateId`, `type`, `createdAt`, `updatedAt`)
VALUES
(1, '에어컨', now(), now()),
(1, '세탁기', now(), now()),
(1, '냉장고', now(), now()),
(1, '옷장', now(), now()),
(2, '에어컨', now(), now()),
(2, '옷장', now(), now()),
(3, '세탁기', now(), now()),
(4, '에어컨', now(), now()),
(4, '세탁기', now(), now()),
(4, '냉장고', now(), now()),
(5, '옷장', now(), now());

SELECT * FROM `option`;
SELECT *, count(*) AS `옵션 개수` FROM `option` GROUP BY `realEstateId`;

