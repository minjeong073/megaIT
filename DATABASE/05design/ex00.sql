
테이블 설계

하나의 컬럼 값에 여러 정보가 들어가지 않게 설계
ex) hobby - 영화, 독서 : 안좋은 설계 방식
--> hobby - 영화
		  - 독서

id(PK), userId(FK)
PK : Primary Key
FK : Foreign Key

user TABLE
- id (PK)
- name
- birth
- email
...

hobby TABLE
- id (PK)
- userId (FK)
- hobby
...


정규화
- 1정규형 : 테이블 셀에 여러개의 데이터를 넣지 않기 -> 행으로 나눠서 
- 2정규형 : 키를 제외한 나머지 속성들은 키에만 종속되게 하기
- 3정규형 : 테이블 안에 두번 이상 연결된 종속 (이행 종속) 을 가지지 않기


테이블과 테이블 관계
- 1:1, 1:N, N:N
- 주로 1:N
- 1:N 일 경우 N인 테이블에 1의 PK 정보 넣어야함
