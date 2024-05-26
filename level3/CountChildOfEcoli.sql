-- 대장균 개체의 ID(ID)와 자식의 수(CHILD_COUNT)를 출력하는 SQL 문을 작성해주세요. 자식이 없다면 자식의 수는 0으로 출력해주세요.
-- 이때 결과는 개체의 ID 에 대해 오름차순 정렬해주세요.
SELECT E1.ID, COUNT(E2.ID) AS CHILD_COUNT
  FROM ECOLI_DATA E1
         LEFT JOIN ECOLI_DATA E2
                   ON E1.ID = E2.PARENT_ID
 GROUP BY E1.ID
 ORDER BY E1.ID

-- 느낀점: 셀프 조인 하면 어렵지 않게 풀 수 있는 문제