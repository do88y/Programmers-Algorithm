-- FISH_INFO 테이블에서 2021년도에 잡은 물고기 수를 출력하는 SQL 문을 작성해주세요.
-- 이 때 컬럼명은 'FISH_COUNT' 로 지정해주세요.
SELECT COUNT(*) AS FISH_COUNT
  FROM FISH_INFO
 WHERE TIME LIKE '2021%'

-- 느낀점: 그저께 문제랑 비슷한 문제; 레벨1 쿼리는 너무 쉽긴 하다.