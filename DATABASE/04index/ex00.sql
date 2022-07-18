full scan : database server 과부화 생길 수도 있음
-> 더 빠르게 데이터 찾는 방법 : index(색인)

데이터 본체 페이지 + 색인 페이지 로 따로 존재

단순하게 저장하는 것이 아니라 빨리 찾을 수 있도록 B+ Tree 구조로 저장

CREATE TABLE (
...
INDEX `idx_ranking`(`ranking`)
)
ranking column 만 따로 저장하는 table 생성
인덱스 추가
ALTER TABLE `` ADD INDEX `idx_ranking`(`ranking`);

단점
- col 데이터를 따로 빼서 저장해야 하기 때문에 데이터 용량 차지
- 삽입 삭제 과정 복잡 -> 삽입 삭제가 빈번할 경우 부하 커짐

++ 
Clustered Index
: 테이블 자체가 해당 컬럼을 통해서 정렬된 상태로 저장
: 테이블 하나당 하나만 존재 가능
: 일반적으로 primary key(pk) 가 해당

Non-Clustered Index
: 일반적인 형태의 index
: 테이블 외의 공간에 따로 tree 형태로 저장
: 테이블 하나당 여러개 가능
: 책의 목차, 색인처럼 컬럼값만 정렬되어 저장, 해당 행의 위치를 가지고 있음


실행 계획
쿼리를 수행할 계획에 대한 정보 확인
옵티마이저가 가장 최적으로 수행할 방법을 확인하고 보여줌
ex ) EXPLAIN SELECT * FROM `user`;

type (성능 안좋은 순)
- all > index > range > ref > eq_ref > const


사용가능성
possible_keys 사용가능한 키
key 사용한 키

# id	select_type	table	partitions	type	possible_keys	key	 key_len	 ref	rows	filtered	Extra
	1	SIMPLE		customer	null	const	  PRIMARY	PRIMARY	   2		const	1		100.00		null



