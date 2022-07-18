SELECT * FROM `review`;

-- 1. 그룹별 개수 세기
SELECT `userName`, count(*) AS `count` FROM `review` GROUP BY `userName`;

-- 2. 그룹별 평균 구하기
SELECT `storeName`, avg(`point`) AS 'average' FROM `review` GROUP BY `storeName`;

-- 3. 그룹 조건
SELECT `userName` FROM `review` GROUP BY `userName`
HAVING count(*) >= 4;

SELECT * FROM `score`;

-- 4. 학생별 평균
SELECT `name`, avg(`score`) AS 'average' FROM `score` 
WHERE `year` = 2020 AND `semester` = 1 AND `term` = '기말고사' GROUP BY `name`;

-- 5. 성적별 평균
SELECT `subject`, avg(`score`) AS 'average' FROM `score`
WHERE `year` = 2020 GROUP BY `subject`;

-- 6. 석차 구하기
SELECT `name`, avg(`score`) AS `average` FROM `score`
WHERE `year` = 2020 GROUP BY `name`
ORDER BY `average` DESC;
