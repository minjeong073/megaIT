SELECT * FROM `company`;
SELECT * FROM `recruit`;


-- 3. 연봉순 정렬

SELECT C.name, R.position, R.qualification, R.type, R.salary
FROM `company` AS `C`
JOIN `recruit` AS `R`
ON C.id = R.companyId
ORDER BY R.salary DESC;


-- 4. 복합 조건

select C.name, C.scale, R.position, R.qualification, R.type, R.salary
FROM `company` AS `C`
JOIN `recruit` AS `R`
ON C.id = R.companyId
WHERE C.scale = '대기업' AND R.type = '정규직' AND R.salary >= 7000
ORDER BY R.salary DESC
LIMIT 3;

-- 5. 기업별 공고 수

SELECT C.name, count(*) AS `count`, C.business, C.headcount
FROM `company` AS `C`
JOIN `recruit` AS `R`
ON C.id = R.companyId
WHERE R.deadline < '2026-05-01 00:00:00' AND R.type = '정규직'
GROUP BY C.id
ORDER BY `count` DESC;


-- 6. 근무형태 별 평균 연봉

SELECT R.type, avg(R.salary) AS `salary`
FROM `company` AS `C`
JOIN `recruit` AS `R`
ON C.id = R.companyId
WHERE C.scale = '중견기업'
GROUP BY R.type;

-- 7. 기업별 평균 연봉

SELECT C.name, avg(R.salary) AS `salary`, C.scale, C.headcount
FROM `company` AS `C`
JOIN `recruit` AS `R`
ON C.id = R.companyId
WHERE R.region = '성남시 분당구'
GROUP BY C.id
HAVING `salary` >= 7000
ORDER BY C.headcount DESC;
