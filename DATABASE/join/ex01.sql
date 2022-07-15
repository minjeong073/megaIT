SELECT * FROM `seller`;
SELECT * FROM `used_goods`;

-- 하구루 사용자의 판매 물품 리스트 조회
SELECT * FROM `seller` WHERE `nickname` = '하구루'; -- 5
SELECT * FROM `used_goods` WHERE `sellerId` = 5;

-- join 사용하기
SELECT seller.*, used_goods.*
FROM `seller`
JOIN `used_goods`
ON seller.id = used_goods.sellerId
WHERE seller.nickname = '하구루'
ORDER BY used_goods.price;


## INNER JOIN
-- 테이블 별칭 붙이기

SELECT A.*, B.*
FROM `seller` AS `A`
JOIN `used_goods` AS `B`
ON A.id = B.sellerId;

## LEFT JOIN

SELECT seller.*, used_goods.*
FROM `seller`
LEFT JOIN `used_goods`
ON seller.id = used_goods.sellerId;
-- FROM 뒤의 테이블이 모두 보여줌
-- 모든 사용자가 다 보여짐
-- JOIN table 에 값이 없는 경우 null 로 표시


## RIGHT JOIN

SELECT seller.*, used_goods.*
FROM `seller`
RIGHT JOIN `used_goods`
ON seller.id = used_goods.sellerId;
-- inner join 과 같은 결과
-- join 뒤의 테이블 모두 보여줌

SELECT seller.*, used_goods.*
FROM `used_goods`
RIGHT JOIN `seller`
ON seller.id = used_goods.sellerId;

-- 1:N -> 1 LEFT, N RIGHT FROM 에 





