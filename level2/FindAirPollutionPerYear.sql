-- AIR_POLLUTION 테이블에서 수원 지역의 연도 별 평균 미세먼지 오염도와 평균 초미세먼지 오염도를 조회하는 SQL문을 작성해주세요.
-- 이때, 평균 미세먼지 오염도와 평균 초미세먼지 오염도의 컬럼명은 각각 PM10, PM2.5로 해 주시고, 값은 소수 셋째 자리에서 반올림해주세요.
-- 결과는 연도를 기준으로 오름차순 정렬해주세요.
SELECT YEAR(YM) AS YEAR, ROUND(AVG(PM_VAL1), 2) AS 'PM10', ROUND(AVG(PM_VAL2), 2) AS 'PM2.5'
  FROM AIR_POLLUTION
 WHERE LOCATION2 = '수원'
 GROUP BY YEAR
 ORDER BY YEAR

-- 느낀점: 실패가 떠서 도저히 모르겠어서 다른 사람의 풀이를 참고했는데 연도 조회 형식을 `DATE_FORMAT(YM, '%Y')`으로 하면 안되고 YEAR(YM)으로 해야한다고 한다.
-- DATE_FORMAT을 사용하면 문자열로 반환되고 YEAR는 정수로 반환된다고 한다. 문제에는 형식 제한이 없었는데 문제의 오류가 아닐까..