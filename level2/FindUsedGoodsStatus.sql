-- USED_GOODS_BOARD 테이블에서 2022년 10월 5일에 등록된 중고거래 게시물의 게시글 ID, 작성자 ID, 게시글 제목, 가격, 거래상태를 조회하는 SQL문을 작성해주세요.
-- 거래상태가 SALE 이면 판매중, RESERVED이면 예약중, DONE이면 거래완료 분류하여 출력해주시고, 결과는 게시글 ID를 기준으로 내림차순 정렬해주세요.
SELECT BOARD_ID, WRITER_ID, TITLE, PRICE,
       CASE
           WHEN STATUS LIKE 'SALE'
               THEN '판매중'
           WHEN STATUS LIKE 'RESERVED'
               THEN '예약중'
           WHEN STATUS LIKE 'DONE'
               THEN '거래완료'
           END AS STATUS
  FROM USED_GOODS_BOARD
 WHERE CREATED_DATE LIKE '2022-10-05%'
 ORDER BY BOARD_ID DESC

-- 느낀점: 다른 사람의 정답은 조건을 CREATED_DATE = '2022-10-05'로 줘서 문제를 보니 CREATED_DATE type이 DATETIME이 아니라 DATE로 되어있다. 문제를 잘 읽자.😭