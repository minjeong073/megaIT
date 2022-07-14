-- 1. 리뷰 테이블 나누기
-- 중복 : store, phoneNumber, address, businessNumber, introduce
--		-리뷰 : menu, userName, point, review

CREATE TABLE `new_stores` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `store` varchar(16) NOT NULL,
    `phoneNumber` varchar(16) NOT NULL,
    `address` varchar(32) NOT NULL,
    `businessNumber` varchar(16) NOT NULL,
    `introduce` text NOT NULL,
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `new_review` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `storeId` int NOT NULL,
    `menu` varchar(16) NOT NULL,
    `userName` varchar(16) NOT NULL,
    `point` decimal(2,1) NOT NULL,
    `review` text,
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DESC `new_stores`;
DESC `new_review`;

-- 2. insert

INSERT INTO `new_stores`
(`store`, `phoneNumber`, `address`, `businessNumber`, `introduce`, `createdAt`, `updatedAt`)
VALUES
('교촌치킨', '02-000-0000', '서울시 서초구', '111-111-1111', '항상 맛있는 닭을 선사 합니다.', now(), now()),
('BHC', '02-111-0000', '서울시 서초구', '111-222-1111', '전지현씨 BHC', now(), now()),
('버거킹', '02-222-1111', '서울시 서초구', '333-222-12222', '맥도날드 가지말고 여기로와요', now(), now());

SELECT * FROM `new_stores`;

INSERT INTO `new_review`
(`storeId`, `menu`, `userName`, `point`, `review`, `createdAt`, `updatedAt`)
VALUES
(1, '오리지날콤보', '이병헌', 4.5, '콤보는 항상 진리입니다.', now(), now()),
(2, '핫후라이드', '전지현', 5, null, now(), now()),
(2, '뿌링클', '이정재', 3.5, '내가 뿌링끌 상인가?', now(), now()),
(3, '와퍼세트', '이병헌', 4.0, '패티 너무 좋아요', now(), now()),
(1, '오리지날콤보', '맛있으면짖는개', 4.5, '왈왈왈!! 왈왈!', now(), now()),
(2, '뿌링클', '전지현', 5, null, now(), now());

SELECT * FROM `new_review`;

-- 3. 리뷰 출력
-- menu, userName, point, review

SELECT `id` FROM `new_stores` WHERE `store` = '교촌치킨';		-- 1

SELECT `menu`, `userName`, `point`, `review` FROM `new_review`
WHERE `storeId` = 1;

