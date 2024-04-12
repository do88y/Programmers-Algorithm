-- 상반기 아이스크림 총주문량이 3,000보다 높으면서 아이스크림의 주 성분이 과일인 아이스크림의 맛을 총주문량이 큰 순서대로 조회하는 SQL 문을 작성해주세요.
SELECT f.FLAVOR
  FROM FIRST_HALF f
        JOIN ICECREAM_INFO i
            ON f.FLAVOR = i.FLAVOR
WHERE f.TOTAL_ORDER > 3000
  AND i.INGREDIENT_TYPE LIKE 'fruit_based';

-- 느낀점: 레벨1에서 처음 보는 join 사용하는 문제. 무난했지만 오타가 나서 찾느라 좀 헤멨다.