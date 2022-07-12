SELECT * FROM `city`;

-- LIMIT
-- 50개만 조회하기 (1page)
SELECT * FROM `city` LIMIT 50;
-- LIMIT 0, 50 과 같은 표현

-- 51번 부터 50개 조회하기 (2page)
SELECT * FROM `city` LIMIT 50, 50;

-- 101번째 부터 50개 조회하기 (3page)
SELECT * FROM `city` LIMIT 100, 50;

-- 포함된 문자열 조회
-- C로 시작되는 도시
SELECT * FROM `city`
WHERE `city` LIKE 'C%';

-- C로 끝나는 도시
SELECT * FROM `city`
WHERE `city` LIKE '%C';

-- C가 포함된 도시
SELECT * FROM `city`
WHERE `city` LIKE '%C%';

-- 대소문자 구분
SELECT * FROM `city`
WHERE `city` LIKE binary('%c%'); -- 대문자 C

-- 정렬하기
-- 오름차순
SELECT * FROM `city` ORDER BY `country_id`;

-- 내림차순
SELECT * FROM `city` ORDER BY `country_id` DESC;

-- C가 포함된 시작하는 도시를 country_id 로 내림차순 정렬해서 10개만 조회
SELECT * FROM `city` WHERE `city` LIKE '%C%' ORDER BY `country_id` DESC LIMIT 10;

-- concat()
SELECT concat('hello', 'world');

-- ex) 도시 이름 : 서울, 나라코드 : 150 으로 출력
SELECT concat('도시이름 : ', `city`, ' 나라코드 : ', `country_id`) AS `string` FROM `city`;
