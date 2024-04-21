-- PRODUCT 테이블에서 상품 카테고리 코드(PRODUCT_CODE 앞 2자리) 별 상품 개수를 출력하는 SQL문을 작성해주세요.
-- 결과는 상품 카테고리 코드를 기준으로 오름차순 정렬해주세요.
SELECT SUBSTR(PRODUCT_CODE, 1, 2) AS PRODUCT, COUNT(*) AS PRODUCTS
  FROM PRODUCT
 GROUP BY SUBSTR(PRODUCT_CODE, 1, 2)
 ORDER BY PRODUCT_CODE

-- 느낀점: GROUP BY를 많이 안써봤다는 걸 알았다.
-- GROUP BY PRODUCT_CODE 를 해야하는줄 알고 왜 안되지 고민했는데 알고보니 PRODUCT_CODE가 모두 달랐고 앞자리 두 글자만 같았다.