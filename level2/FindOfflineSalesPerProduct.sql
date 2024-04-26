-- PRODUCT 테이블과 OFFLINE_SALE 테이블에서 상품코드 별 매출액(판매가 * 판매량) 합계를 출력하는 SQL문을 작성해주세요.
-- 결과는 매출액을 기준으로 내림차순 정렬해주시고 매출액이 같다면 상품코드를 기준으로 오름차순 정렬해주세요.
SELECT P.PRODUCT_CODE, SUM(P.PRICE * O.SALES_AMOUNT) AS SALES
  FROM PRODUCT P
         JOIN OFFLINE_SALE O
              ON P.PRODUCT_ID = O.PRODUCT_ID
 GROUP BY P.PRODUCT_CODE
 ORDER BY SALES DESC, P.PRODUCT_CODE

-- 느낀점: SUM 빠뜨렸다가 한참 찾았다. 하나의 PRODUCT_CODE에 여러개의 매출이 나오기 때문에 모든 매출을 더해야했는데 생각을 못했다.