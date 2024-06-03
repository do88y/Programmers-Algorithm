-- 데이터 분석 팀에서는 우유(Milk)와 요거트(Yogurt)를 동시에 구입한 장바구니가 있는지 알아보려 합니다.
-- 우유와 요거트를 동시에 구입한 장바구니의 아이디를 조회하는 SQL 문을 작성해주세요. 이때 결과는 장바구니의 아이디 순으로 나와야 합니다.
SELECT CART_ID
  FROM CART_PRODUCTS
 WHERE NAME IN ('Milk', 'Yogurt')
 GROUP BY CART_ID
HAVING COUNT(DISTINCT NAME) = 2
 ORDER BY CART_ID

-- 느낀점: `동시에 구입한 장바구니` 라는 조건을 어떻게 구현할지가 좀 고민됐다. 상품종류의 갯수를 세는 것으로 해결했다.