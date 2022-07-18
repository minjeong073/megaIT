SELECT * FROM `customer`;

-- 실행 계획(성능)
-- PK 를 통한 조회 : const
EXPLAIN SELECT * FROM `customer` WHERE `customer_id` = 3;

EXPLAIN SELECT * FROM `customer` WHERE `customer_id` < 10;
-- 결과 : type = range

-- 인덱스가 없는 컬럼 조건 조회
EXPLAIN SELECT * FROM `customer` WHERE `active` = 1;
-- 결과 : type = ALL -> full scan

-- 인덱스가 있는 컬럼 조회
EXPLAIN SELECT * FROM `customer` WHERE `store_id` = 2;
-- 결과 : type = ref -> 인덱스 기반으로 같다

-- 인덱스 걸린 컬럼 LIKE 조건
EXPLAIN SELECT * FROM `customer` WHERE `last_name` LIKE 'A%';
-- 결과 : range
EXPLAIN SELECT * FROM `customer` WHERE `last_name` LIKE '%A';
-- 결과 : ALL
EXPLAIN SELECT * FROM `customer` WHERE `last_name` LIKE '%A%';
-- 결과 : type = ALL, possible_key = null

-- -> LIKE 는 full scan 으로 탐색하기 때문에 사용하지 않는게 좋음

SELECT * FROM `film`;

EXPLAIN SELECT * FROM `film` WHERE `length` < 50;
-- index 가 안걸려 있기 때문에 ALL

-- length index 추가
ALTER TABLE `film` ADD INDEX `idx_length` (`length`);

EXPLAIN SELECT * FROM `film` WHERE `length` < 50;
-- type = range

EXPLAIN SELECT * FROM `film` WHERE `length` < 150;
-- type = ALL
-- length < 150 에 해당하는 결과가 많기 때문에 굳이 idx 를 사용하지 않음 -> ALL
-- 많은 결과값이 나올 경우 index 지움


-- index 지우기
ALTER TABLE `film` DROP INDEX `idx_length`;








