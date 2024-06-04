-- 7월 아이스크림 총 주문량과 상반기의 아이스크림 총 주문량을 더한 값이 큰 순서대로 상위 3개의 맛을 조회하는 SQL 문을 작성해주세요.
SELECT A.FLAVOR
  FROM FIRST_HALF A
         JOIN JULY B
              ON A.FLAVOR = B.FLAVOR
 GROUP BY FLAVOR
HAVING SUM(A.TOTAL_ORDER + B.TOTAL_ORDER)
 ORDER BY SUM(A.TOTAL_ORDER + B.TOTAL_ORDER) DESC
 LIMIT 3

-- 느낀점: JOIN 문제라고 되어있었는데 HAVING 절 사용이 포인트 같다.