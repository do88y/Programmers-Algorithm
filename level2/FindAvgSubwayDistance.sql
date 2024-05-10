-- SUBWAY_DISTANCE 테이블에서 노선별로 노선, 총 누계 거리, 평균 역 사이 거리를 노선별로 조회하는 SQL문을 작성해주세요.
-- 총 누계거리는 테이블 내 존재하는 역들의 역 사이 거리의 총 합을 뜻합니다.
-- 총 누계 거리와 평균 역 사이 거리의 컬럼명은 각각 TOTAL_DISTANCE, AVERAGE_DISTANCE로 해주시고, 총 누계거리는 소수 둘째자리에서, 평균 역 사이 거리는 소수 셋째 자리에서 반올림 한 뒤 단위(km)를 함께 출력해주세요.
-- 결과는 총 누계 거리를 기준으로 내림차순 정렬해주세요.
SELECT ROUTE,
       CONCAT(ROUND(SUM(D_BETWEEN_DIST), 1), 'km') AS TOTAL_DISTANCE,
       CONCAT(ROUND(AVG(D_BETWEEN_DIST), 2), 'km') AS AVERAGE_DISTANCE
FROM SUBWAY_DISTANCE
GROUP BY ROUTE
ORDER BY ROUND(SUM(D_BETWEEN_DIST), 2) DESC

-- 느낀점: 테스트 케이스 통과해서 정답이라고 생각하고 제출했는데 오답이었다.
-- 알고보니 ORDER BY를 TOTAL_DISTANCE로 하면 문자열 정렬이라 기대와 다른 결과가 나오는 것이었다. 문자열을 붙이는 CONCAT을 제외하고 조건에 넣으니 통과했다.