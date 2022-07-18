JOIN
key 값이 연결되어있는 N 개의 테이블의 데이터를 합쳐서 한번에 가져옴

순서
SELECT > FROM > JOIN ON > WHERE

주의: 테이블 이름이 같을 수도 있기 때문에 테이블 이름 명시해야함

SELECT * 
FROM `users`
JOIN `hobby`
ON users.id = hobby.userId	-- 매칭 시킬 기준
WHERE `hobby`.
-> FROM 뒤의 `` 의 모든 정보 + join 정보 가져옴


ON
- 매칭 시킬 기준
- 테이블 이름 붙이기

종류
INNER JOIN(기본)
OUTER JOIN - LEFT, RIGHT

ex)
A.id = B.id
A.id : 1, 2, 3
B.id = 1, 2, 4

1) inner join 
교집합에 해당되는 데이터만 테이블 결과로 가져옴
ex)
1	이름1	나이1	야구
2	이름2	나이2	노래

2) left join
LEFT JOIN `hobby`
대응되는 것이 없으면 null 로 
좌측 테이블 전체만 출력
ex)
1	이름1	나이1	야구
2	이름2	나이2	노래
3 	이름3	나이3	NULL


3) right join 
RIGHT JOIN `hobby`
ex)
우측 테이블 전체만 출력
1	이름1	나이1	야구
2	이름2	나이2	노래
NULL NULL 	NULL 	축구


