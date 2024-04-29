-- MEMBER_PROFILE 테이블에서 생일이 3월인 여성 회원의 ID, 이름, 성별, 생년월일을 조회하는 SQL문을 작성해주세요.
-- 이때 전화번호가 NULL인 경우는 출력대상에서 제외시켜 주시고, 결과는 회원ID를 기준으로 오름차순 정렬해주세요.
SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%d') AS DATE_OF_BIRTH
  FROM MEMBER_PROFILE
 WHERE DATE_OF_BIRTH LIKE '_____03%'
   AND GENDER LIKE 'W'
   AND TLNO IS NOT NULL
 ORDER BY MEMBER_ID

-- 느낀점: 함수 쓰기 귀찮아서 `DATE_OF_BIRTH LIKE '_____03%'`로 3월 생일을 찾았지만 ㅎ마수를 쓰면 더 깔끔할 것 같다.
-- 검색 해 보니 `DATE_FORMAT(DATE_OF_BIRTH, '%m') = 3` 로 쓰면 될 것 같다.