-- USER_INFO 테이블에서 2021년에 가입한 회원 중 나이가 20세 이상 29세 이하인 회원이 몇 명인지 출력하는 SQL문을 작성해주세요.

SELECT count(*) as users
from user_info where to_char(joined, 'yyyy') = '2021'
and age between 20 and 29;

-- 쉬어가는 느낌으로 푼 SQL 문제인데 생각지 못한 부분에서 막혔다.
-- 날짜를 찾을 때 where joined like '2021%'로 하면 되는줄 알았는데 안 돼서 찾아보니
-- to_char(컬럼명, 형식) = '' 이런 식으로 찾아야 했다. 이건 배운 기억에 없는데, 잘 기억해둬야겠다.
