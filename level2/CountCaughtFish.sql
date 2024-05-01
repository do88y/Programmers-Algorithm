-- FISH_NAME_INFO에서 물고기의 종류 별 물고기의 이름과 잡은 수를 출력하는 SQL문을 작성해주세요.
-- 물고기의 이름 컬럼명은 FISH_NAME, 잡은 수 컬럼명은 FISH_COUNT로 해주세요.
-- 결과는 잡은 수 기준으로 내림차순 정렬해주세요.
SELECT COUNT(FI.FISH_TYPE) AS FISH_COUNT, FMI.FISH_NAME AS FISH_NAME
  FROM FISH_NAME_INFO FMI
         JOIN FISH_INFO FI
              ON FMI.FISH_TYPE = FI.FISH_TYPE
 GROUP BY FMI.FISH_TYPE, FMI.FISH_NAME
 ORDER BY FISH_COUNT DESC

-- 느낀점: 무난했던 문제였는데 처음에 COUNT 를 SUM 으로 잘못썼다. FISH_INFO 테이블에는 잡은 물고기 수 대로 FISH_TYPE이 쌓이는 거라서 COUNT가 맞다.