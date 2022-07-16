-- 1. 테이블 생성
CREATE TABLE `company` (
    `id` integer NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` varchar(16) NOT NULL,
    `business` varchar(16) NOT NULL,
    `scale` varchar(4) NOT NULL,
    `headcount` int NOT NULL,
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `job_posting` (
    `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `companyId` int NOT NULL,
    `position` varchar(32) NOT NULL,
    `responsibilities` varchar(64) NOT NULL,
    `qualification` varchar(64) NOT NULL,
    `type` char(3) NOT NULL,
    `region`varchar(16) NOT NULL,
    `salary` int NOT NULL,
    `deadline` date NOT NULL,
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DESC `company`;
DESC `job_posting`;
DROP TABLE `job_posting`;
-- 2. 데이터 저장

INSERT INTO `company`
(`name`, `business`, `scale`, `headcount`, `createdAt`, `updatedAt`)
VALUES
('Cacao', '인터넷 포털', '대기업', 2848, now(), now()),
('Rine', '모바일 무선', '대기업', 1138, now(), now()),
('NG소프트', '컨텐츠 게임', '중견기업', 4430, now(), now()),
('쿠퐁', '쇼핑몰', '중견기업', 5350, now(), now()),
('Naber', '인터넷 포털', '대기업', 4048, now(), now()),
('우와한형제들', '소프트웨어 솔루션', '중견기업', 926, now(), now());

SELECT * FROM `company`;

INSERT INTO `job_posting`
(`companyId`, `position`, `responsibilities`, `qualification`, 
`type`, `region`, `salary`, `deadline`, `createdAt`, `updatedAt`)
VALUES
(1, '안드로이드 개발자', '메신저 앱 개발', 'kotlin 개발 경력 3년 이상', 
'정규직', '성남시 분당구', 7300, '2026-03-13', now(), now()),
(1, '안드로이드 개발자', '쇼핑 서비스 개발', 'kotlin 개발 경력 3년 이상', 
'정규직', '성남시 분당구', 6300, '2026-04-04', now(), now()),
(1, '웹 back-end 개발자', '이모티콘 샵 API 서버 개발', 'spring 개발 경력 3년 이상', 
'정규직', '성남시 분당구', 7000, '2026-03-28', now(), now()),
(2, '아이폰 앱 개발자', '메신저 앱 개발', 'RxSwift 개발 경력 3년 이상', 
'정규직', '성남시 분당구', 7600, '2026-04-01', now(), now()),
(2, '웹 back-end 개발자', 'Rine 포스팅 기능 API 개발', 'spring 개발 경력 3년 이상', 
'정규직', '성남시 분당구', 6600, '2026-03-29', now(), now()),
(3, '게임 개발자', '게임 개발', 'Unreal Engine 경력 5년 이상', 
'정규직', '성남시 분당구', 8400, '2026-04-20', now(), now()),
(3, '모바일 게임 개발자', '리뉘쥐 모바일 게임 개발', 'Unreal Engine 개발 가능자', 
'계약직', '성남시 분당구', 8500, '2026-04-05', now(), now()),
(4, '웹 back-end 개발자', '오픈마켓 웹 개발', 'spring 개발 가능자', 
'정규직', '서울시 송파구', 8100, '2026-05-02', now(), now()),
(4, '웹 front-end 개발자', '오픈마켓 웹 개발', 'react 개발 가능자', 
'계약직', '서울시 송파구', 9000, '2026-04-10', now(), now()),
(5, '웹 back-end 개발자', 'Naber 메일 기능 개발', 'spring 개발 경력 5년 이상', 
'계약직', '성남시 분당구', 9800, '2026-04-20', now(), now()),
(5, '동영상 플레이어 개발자', '네이버TV 플레이어 개발', '동영상 코덱 기술 개발 능력자', 
'정규직', '성남시 분당구', 7800, '2026-05-01', now(), now()),
(5, '웹 front-end 개발자', 'Now 웹 개발', 'Vue.js 개발 가능자', 
'정규직', '성남시 분당구', 7000, '2026-04-15', now(), now()),
(6, '웹 back-end 개발자', '사내 인트라넷 개발', 'spring 개발 경력 3년 이상', 
'계약직', '서울시 송파구', 8800, '2026-04-15', now(), now()),
(6, '웹 back-end 개발자', '쇼핑 라이브 API 개발', 'spring 개발 경력 3년 이상', 
'정규직', '서울시 송파구', 8200, '2026-05-12', now(), now());

SELECT * FROM `company`;
SELECT * FROM `job_posting`;

-- 3. 연봉순 정렬
SELECT C.name, J.position, J.qualification, J.type, J.salary
FROM `company` AS `C`
JOIN `job_posting` AS `J`
ON C.id = J.companyId
ORDER BY J.salary DESC;

-- 4. 복합 조건
SELECT C.name, C.scale, J.position, J.qualification, J.type, J.salary
FROM `company` AS `C`
JOIN `job_posting` AS `J`
ON C.id = J.companyId
WHERE C.scale = '대기업' AND J.type = '정규직' AND J.salary >= 7000
ORDER BY J.salary DESC
LIMIT 3;

-- 5. 기업별 공고 수
SELECT C.name, count(*) AS `count`, C.business, C.headcount
FROM `company` AS `C`
JOIN `job_posting` AS `J`
ON C.id = J.companyId
WHERE J.deadline < '2026-05-01' AND J.type = '정규직'
GROUP BY C.id
ORDER BY `count` DESC;

-- 6. 근무형태 별 평균 연봉
SELECT J.type, avg(J.salary) AS `salary`
FROM `company` AS `C`
JOIN `job_posting` AS `J`
ON C.id = J.companyId
WHERE C.scale = '중견기업'
GROUP BY J.type;

-- 7. 기업별 평균 연봉
SELECT C.name, avg(J.salary) AS `salary`, C.scale, C.headcount
FROM `company` AS `C`
JOIN `job_posting` AS `J`
ON C.id = J.companyId
WHERE J.region = '성남시 분당구'
GROUP BY C.id
HAVING `salary` >= 7000
ORDER BY C.headcount DESC;
