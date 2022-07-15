DROP TABLE `new_review`;
DROP TABLE `new_stores`;

CREATE TABLE `new_review` (
    `id` int NOT NULL AUTO_INCREMENT primary key,
    `storeId` int NOT NULL,
    `menu` varchar(32) NOT NULL,
    `userName` varchar(32) NOT NULL,
    `point` decimal(2,1) DEFAULT 3.5,
    `review` varchar(256),
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `store` (
    `id` int NOT NULL AUTO_INCREMENT primary key, 
    `name` varchar(32) NOT NULL,
    `phoneNumber` varchar(16) NOT NULL,
    `address` varchar(64) NOT NULL, 
    `businessNumber` varchar(32) NOT NULL,
    `introduce` text, 
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DESC `store`;
DESC `new_review`;

INSERT INTO `store` 
(`name`, `phoneNumber`, `address`, `businessNumber`, `introduce`, `createdAt`, `updatedAt`)
VALUES 
("교촌치킨", '02-000-0000', '서울시 서초구', '111-111-1111', '항상 맛있는 닭을 선사 합니다.', now(), now()),
("BHC", '02-111-0000', '서울시 서초구', '111-222-1111', '전지현씨 BHC', now(), now()),
("버거킹", '02-222-1111', '서울시 서초구', '333-222-12222', '맥도날드 가지말고 여기로와요', now(), 
now()),
("도미노피자", '02-222-2222', '서울시 서초구', '111-222-12222', '방문포장 반값!!!', now(), 
now()),
("피자알볼로", '02-000-1111', '서울시 서초구', '123-010-12222', NULL, now(), 
now()),
("할머니순대국", '02-123-4567', '서울시 서초구', '100-200-14000', '12시간 푹고은 육수', now(), 
now()),
("배달삼겹", '02-222-8888', '서울시 서초구', '333-5454-9999', '우리돼지 한돈만 사용합니다!!', now(), 
now()),
("가장맛있는족발", '02-012-8080', '서울시 서초구', '133-253-1243', '리뷰이벤트 막국수 드려요!!', now(), now());

INSERT INTO `new_review` 
(`storeId`, `menu`, `userName`, `point`, `review`, `createdAt`, `updatedAt`) 
VALUES 
(1, '오리지날 콤보', '이병헌', 4.5, '콤보는 항상 진리입니다.', now(), now()),
(2, '핫후라이드', '전지현', 5, NULL, now(), now()),
(2, '뿌링클', '이정재', 3.5, '내가 뿌링클 상인가?', now(), now()),
(3, '와퍼세트', '이병헌', 4.0, '패티 너무좋아요', now(), now()),
(1, '오리지날 콤보', '맛있으면짖는개', 4.5, '왈왈왈!! 왈왈!', now(), now()),
(2, '뿌링클', '전지현', 5, NULL, now(), now()),
(8, '족발(앞다리)', '이병헌', 4.5, '막국수 서비스 좋아요!', now(), now()),
(7, '삼겹혼밥세트', '정우성', 4.0, '항상 맛있어요 같이오는 김치찌개 짱맛', now(), now()),
(2, '마쵸킹', '전지현', 5, NULL, now(), now()),
(1, '오리지날 콤보', '정우성', 4.5, NULL, now(), now()),
(4, '도미노피자', '이정재', 4.5, '피자알볼로보다 맛있어요', now(), now()),
(5, '피자알볼로', '이정재', 4.5, '도미노피자 보다 맛있어요', now(), now()),
(7, '삼겹혼밥세트', '이병헌', 4.0, NULL, now(), now()),
(8, '매운족발', '정우성', 4.5, '메뉴가 반반족발로 잘못왔어요. 맛있어서 그냥 먹었어요', now(), now()),
(7, '삽겹이인세트', '이정재', 1.5, '다탔어!! XX 열받네', now(), now()),
(5, '피자알볼로', '맛있으면짖는개', 3.0, '....', now(), now()),
(2, '뿌링클', '전지현', 5, NULL, now(), now()),
(8, '족발(앞다리)', '이병헌', 4.5, '빠른배달 칭찬해!', now(), now()),
(7, '목살 고기만', '이정재', 2.0, '고기가 덜익어서 왔어요!', now(), now()),
(4, '도미노피자', '맛있으면짖는개', 4.5, '왈왈왈!! 왈왈!!', now(), now()), 
(8, '반반족발', '이병헌', 3.5, NULL, now(), now());

SELECT * FROM `store`;
SELECT * FROM `new_review`;

-- 1. inner join
-- store : name, phoneNumber
-- new_review : menu, userName, point, review

SELECT A.name, A.phoneNumber, B.menu, B.userName, B.point, B.review
FROM `store` AS `A`
JOIN `new_review` AS `B`
ON A.id = B.storeId;

-- 2. left join
SELECT A.name, A.phoneNumber, B.menu, B.userName, B.point, B.review
FROM `store` AS `A`
LEFT JOIN `new_review` AS `B`
ON A.id = B.storeId;


-- 3. 낮은 리뷰 추출
SELECT B.menu, B.userName, B.point, B.review
FROM `store` AS `A`
JOIN `new_review` AS `B`
ON A.id = B.storeId
WHERE A.name = '배달삼겹' AND B.point < 3.0
ORDER BY B.point DESC;


-- 4. 리뷰 내용 있는 리스트
SELECT A.name, B.menu, B.point, B.review
FROM `store` AS `A`
JOIN `new_review` AS `B`
ON A.id = B.storeId
WHERE B.userName = '이병헌' AND B.point >= 4.5 AND B.review IS NOT NULL;

-- 5. 맛집 랭킹
SELECT A.name, A.phoneNumber, avg(B.point) AS `averagePoint`
FROM `store` AS `A`
JOIN `new_review` AS `B`
ON A.id = B.storeId
GROUP BY A.name
ORDER BY `averagePoint` DESC
LIMIT 5;

