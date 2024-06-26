-- FOOD_WAREHOUSE 테이블에서 경기도에 위치한 창고의 ID, 이름, 주소, 냉동시설 여부를 조회하는 SQL문을 작성해주세요.
-- 이때 냉동시설 여부가 NULL인 경우, 'N'으로 출력시켜 주시고 결과는 창고 ID를 기준으로 오름차순 정렬해주세요.

SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, case when FREEZER_YN is null then 'N' else FREEZER_YN end
from FOOD_WAREHOUSE where ADDRESS like '경기도%' order by WAREHOUSE_ID;

-- 느낀점: 오늘은 SQL문 정답만 맞추는 데에도 오래 걸려서 이것만 풀어야겠다.😂 오래 걸린 이유가 냉동창고가 null인 경우 N으로 출력하는 것 때문이었다.
-- 나름 SQL은 자신있다고 생각했는데 기억에서 너무 흐려졌다. SQL문도 자주 접해봐야겠다.