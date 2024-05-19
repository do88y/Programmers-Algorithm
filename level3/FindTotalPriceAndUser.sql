-- USED_GOODS_BOARD와 USED_GOODS_USER 테이블에서 완료된 중고 거래의 총금액이 70만 원 이상인 사람의 회원 ID, 닉네임, 총거래금액을 조회하는 SQL문을 작성해주세요.
-- 결과는 총거래금액을 기준으로 오름차순 정렬해주세요.
SELECT U.USER_ID, U.NICKNAME, SUM(B.PRICE) AS TOTAL_SALES
  FROM USED_GOODS_BOARD B
         JOIN USED_GOODS_USER U
              ON B.WRITER_ID = U.USER_ID
 WHERE B.STATUS = 'DONE'
 GROUP BY B.WRITER_ID
HAVING SUM(B.PRICE) >= 700000
 ORDER BY TOTAL_SALES

-- 느낀점: 처음에 WHERE 조건에 거래 총금액 70만원 이상을 넣었다가 실패해서 문제의 카테고리를 보니 GROUP BY 로 되어있었다.
-- 생각 해 보니 사용자 별 총 금액을 구해야 하니 GORUP BY로 묶어서 HAVING 으로 그룹 별 조건을 걸어야 하는 거였다.