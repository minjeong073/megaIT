-- 홍당무 마켓

-- 사용자끼리 중고물품 올리고 거래하는 서비스
-- 닉네임, 프로필 이미지, 매너 온도, 제목, 가격, 물품 설명, 물품 사진

-- 판매자 정보 테이블 - 닉네임, 프로필 이미지, 매너 온도
-- 물품 정보 테이블 - 제목, 가격, 물품 설명, 물품 사진

CREATE TABLE `seller` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `nickname` varchar(32) NOT NULL,
    -- 이미지 는 주소 형태로 저장
    `profileImage` varchar(256),
    `temperature` decimal(3, 1) NOT NULL,
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `used_goods` (
	`id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `sellerId` int NOT NULL,
    `title` varchar(64) NOT NULL,
    `price` int NOT NULL,
    `description` text NOT NULL,
    `picture` varchar(256),
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE `seller`;

INSERT INTO `seller`
(`nickname`, `profileImage`, `temperature`, `createdAt`, `updatedAt`)
VALUES
('마로비', 'https://cdn.pixabay.com/photo/2018/05/26/18/06/dog-3431913__340.jpg', 36.5, now(), now()),
('아메리카노', null, 48.2, now(), now()),
('우영우', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTrv01fBaWAaUVjGTwAmmIDdClpwXNHhSwhrw&usqp=CAU', 29.0, now(), now()),
('동그라미', null, 36.5, now(), now()),
('하구루', 'https://cdn.pixabay.com/photo/2015/12/12/14/57/giant-rubber-bear-1089612__340.jpg', 36.5, now(), now());

SELECT * FROM `seller`;

INSERT INTO `used_goods`
(`sellerId`, `title`, `price`, `description`, `picture`, `createdAt`, `updatedAt`)
VALUES
(5, '플스4 팝니다', 100000, '쿨거래 하실분들 연락주세요', 'https://cdn.pixabay.com/photo/2017/05/19/14/09/ps4-2326616_960_720.jpg', now(), now()),
(5, '원피스 팝니다', 20000, '살이 빠져서 사이즈가 커져서 못입습니다.', 'https://cdn.pixabay.com/photo/2020/06/30/09/33/woman-5355744_960_720.jpg',  now(), now()),
(3, '후라다 여성지갑 팝니다', 200000, '오늘 선물하려고 했는데 헤어졌어요.', NULL, now(), now()),
(2, '바퀴벌레 좀 잡아주세요', 5000, '제발 잡아 주세요 막 날아 다녀요.', NULL, now(), now()); 


-- #1 하구루의 판매 물품 리스트 가져오기
-- seller 테이블에서 하구루의 sellerId 조회
SELECT * FROM `seller` WHERE `nickname` = '하구루';
-- 결과 5

-- used_goods 테이블에서 sellerid 가 5인 데이터 조회
SELECT * FROM `used_goods` WHERE `sellerId` = 5;


-- #2 바퀴벌레 잡아달라는 사람의 닉네임과 매너 온도 확인
-- used_goods 테이블에서 바퀴벌레 키워드로 제목을 올린 데이터의 sellerId 확인
SELECT * FROM `used_goods` WHERE `title` LIKE '바퀴벌레%';
-- 결과 2

-- seller 테이블에서 sellerId 가 2인 데이터 조회
SELECT `nickname` , `temperature` FROM `seller` WHERE `id` = 2;



