SELECT * FROM `review`;

-- 1. 문자열 찾기
SELECT * FROM `review`
WHERE `userName` = '맛있으면짖는개' AND `review` LIKE '왈왈%';

-- 2. 정렬하기
SELECT * FROM `review`
ORDER BY `createdAt` DESC LIMIT 10;

-- 3. 별점 높은순
SELECT * FROM `review`
WHERE `storeName` = '교촌치킨' ORDER BY `point` DESC;

-- 4. 가장 낮은 별점
SELECT `userName`, `storeName`, `point` FROM `review`
ORDER BY `point` LIMIT 1;