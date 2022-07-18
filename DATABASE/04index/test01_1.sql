-- 1. query 만들기
-- 2. 실행 계획 확인
-- 3. 성능 향상되도록 index 설정하기

-- 이정재가 작성한 리뷰 리스트
-- 별점이 3.0 이하의 별점 중 이병헌이 작성한 리뷰 리스트 
-- 교촌치킨의 리뷰내용이 있는 리뷰 리스트
-- 가게별 별점 평균

-- 1. query 만들기
SELECT * FROM `review` WHERE `userName` = '이정재';
SELECT * FROM `review` WHERE `point` <= 3.0 AND `userName` = '이병헌';
SELECT * FROM `review` WHERE `storeName` = '교촌치킨' AND `review` IS NOT NULL;
SELECT `storeName`, avg(`point`) AS `average` FROM `review` GROUP BY `storeName`;

-- 2. 실행 계획 확인
EXPLAIN SELECT * FROM `review` WHERE `userName` = '이정재';
EXPLAIN SELECT * FROM `review` WHERE `point` <= 3.0 AND `userName` = '이병헌';
EXPLAIN SELECT * FROM `review` WHERE `storeName` = '교촌치킨' AND `review` IS NOT NULL;
EXPLAIN SELECT `storeName`, avg(`point`) AS `average` FROM `review` GROUP BY `storeName`;

-- 3. index 설정
ALTER TABLE `review` ADD INDEX `idx_userName` (`userName`);
ALTER TABLE `review` ADD INDEX `idx_point` (`point`); -- key 로 사용하지 않음 -> 제거
ALTER TABLE `review` DROP INDEX `idx_point`;
ALTER TABLE `review` ADD INDEX `idx_storeName` (`storeName`);
