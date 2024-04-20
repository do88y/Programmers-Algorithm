-- FISH_INFO 테이블에서 가장 큰 물고기 10마리의 ID와 길이를 출력하는 SQL 문을 작성해주세요.
-- 결과는 길이를 기준으로 내림차순 정렬하고, 길이가 같다면 물고기의 ID에 대해 오름차순 정렬해주세요.
-- ID 컬럼명은 ID, 길이 컬럼명은 LENGTH로 해주세요.
SELECT ID, LENGTH
  FROM FISH_INFO
 ORDER BY LENGTH DESC, ID
 LIMIT 10

-- 느낀점: MSSQL 에서의 TOP이 MYSQL 에서는 ORDER BY 한 뒤의 LIMIT 이라는 걸 알았다.