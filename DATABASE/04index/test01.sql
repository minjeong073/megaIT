SELECT * FROM `review`;

-- 1. query 만들기
-- 2. 실행 계획 확인
-- 3. 성능 향상되도록 index 설정하기


-- 이정재가 작성한 리뷰 리스트

-- 1. query 만들기
SELECT * FROM `review` WHERE `userName` = '이정재';
-- 2. 실행 계획 확인
EXPLAIN SELECT * FROM `review` WHERE `userName` = '이정재';

-- 3. 성능 향상되도록 index 설정하기
ALTER TABLE `review` ADD INDEX `idx_userName` (`userName`);

EXPLAIN SELECT * FROM `review` WHERE `userName` = '이정재';
-- 결과 : ref (idx_userName)

ALTER TABLE `review` DROP INDEX `idx_userName`;


-- 별점이 3.0 이하의 별점 중 이병헌이 작성한 리뷰 리스트 

-- 1. query 만들기
SELECT * FROM `review` WHERE `point` <= 3.0 AND `userName` = '이병헌';
-- 2. 실행 계획 확인
EXPLAIN SELECT * FROM `review` WHERE `point` <= 3.0 AND `userName` = '이병헌';

-- 3. 성능 향상되도록 index 설정하기
ALTER TABLE `review` ADD INDEX `idx_userName` (`userName`);
ALTER TABLE `review` ADD INDEX `idx_point` (`point`);

EXPLAIN SELECT * FROM `review` WHERE `point` <= 3.0 AND `userName` = '이병헌';
-- 결과 : idx_userName 으로 ref
-- 		 idx_point 로 range -> idx_userName 만 사용
-- ref (idx_userName)

ALTER TABLE `review` DROP INDEX `idx_point`;


-- 교촌치킨의 리뷰내용이 있는 리뷰 리스트

-- 1. query 만들기
SELECT * FROM `review` WHERE `storeName` = '교촌치킨' AND `review` IS NOT NULL;
-- 2. 실행 계획 확인
EXPLAIN SELECT * FROM `review` WHERE `storeName` = '교촌치킨' AND `review` IS NOT NULL;

-- 3. 성능 향상되도록 index 설정하기
ALTER TABLE `review` ADD INDEX `idx_storeName` (`storeName`);
ALTER TABLE `review` ADD INDEX `idx_review` (`review`);
ALTER TABLE `review` DROP INDEX `idx_review`;
EXPLAIN SELECT * FROM `review` WHERE `storeName` = '교촌치킨' AND `review` IS NOT NULL;
-- 결과 : ref (idx_storeName)

ALTER TABLE `review` DROP INDEX `idx_storeName`;


-- 가게별 별점 평균

-- 1. query 만들기
SELECT *, avg(`point`) AS `average` FROM `review`
GROUP BY `storeName` ORDER BY `average` DESC;
-- 2. 실행 계획 확인
EXPLAIN SELECT *, avg(`point`) AS `average` FROM `review`
GROUP BY `storeName` ORDER BY `average` DESC;

-- 3. 성능 향상되도록 index 설정하기
ALTER TABLE `review` ADD INDEX `idx_storeName` (`storeName`);

EXPLAIN SELECT *, avg(`point`) AS `average` FROM `review`
GROUP BY `storeName` ORDER BY `average` DESC;
-- 결과 : index (idx_storeName)


-- 최종 생성한 index : idx_userName, idx_storeName




