-- 분화된 연도(YEAR), 분화된 연도별 대장균 크기의 편차(YEAR_DEV), 대장균 개체의 ID(ID) 를 출력하는 SQL 문을 작성해주세요.
-- 분화된 연도별 대장균 크기의 편차는 분화된 연도별 가장 큰 대장균의 크기 - 각 대장균의 크기로 구하며 결과는 연도에 대해 오름차순으로 정렬하고 같은 연도에 대해서는 대장균 크기의 편차에 대해 오름차순으로 정렬해주세요.
WITH CTE_MAX_SIZE AS (
    SELECT YEAR(DIFFERENTIATION_DATE) AS YEAR,
           MAX(SIZE_OF_COLONY) AS MAX_SIZE
      FROM ECOLI_DATA
     GROUP BY YEAR
)
SELECT YEAR(DIFFERENTIATION_DATE) AS YEAR,
       M.MAX_SIZE - SIZE_OF_COLONY AS YEAR_DEV,
       ID
  FROM ECOLI_DATA E
         JOIN CTE_MAX_SIZE M
              ON YEAR(DIFFERENTIATION_DATE) = M.YEAR
 ORDER BY YEAR, YEAR_DEV

-- 느낀점: 단순 함수 사용하는 문제만 나오다가 갑자기 서브쿼리(CTE)를 사용하는 문제가 나오니까 난이도가 급상승 한 느낌...
-- 최대 사이즈 구하는 걸 서브쿼리 사용하지 않아서 처음에 잠깐 헤멨다.