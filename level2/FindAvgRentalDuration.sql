-- CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블에서 평균 대여 기간이 7일 이상인 자동차들의 자동차 ID와 평균 대여 기간(컬럼명: AVERAGE_DURATION) 리스트를 출력하는 SQL문을 작성해주세요.
-- 평균 대여 기간은 소수점 두번째 자리에서 반올림하고, 결과는 평균 대여 기간을 기준으로 내림차순 정렬해주시고, 평균 대여 기간이 같으면 자동차 ID를 기준으로 내림차순 정렬해주세요.
SELECT CAR_ID, ROUND(AVG(DATEDIFF(END_DATE, START_DATE) + 1), 1) AS AVERAGE_DURATION
  FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
 GROUP BY CAR_ID
HAVING AVG(DATEDIFF(END_DATE, START_DATE) + 1) >= 7
 ORDER BY AVERAGE_DURATION DESC, CAR_ID DESC

-- 느낀점: 정답이 아니래서 다시 천천히 뜯어보니 DATEDIFF에서 1을 더하지 않았다. 좀 더 차분히 보는 습관을 들여야겠다.