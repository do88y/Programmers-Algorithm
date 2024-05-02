-- 어느 한 게임에서 사용되는 아이템들은 업그레이드가 가능합니다.
-- 'ITEM_A'->'ITEM_B'와 같이 업그레이드가 가능할 때 'ITEM_A'를 'ITEM_B'의 PARENT 아이템, PARENT 아이템이 없는 아이템을 ROOT 아이템이라고 합니다.
-- ROOT 아이템을 찾아 아이템 ID(ITEM_ID), 아이템 명(ITEM_NAME)을 출력하는 SQL문을 작성해 주세요.
-- 이때, 결과는 아이템 ID를 기준으로 오름차순 정렬해 주세요.
SELECT II.ITEM_ID, II.ITEM_NAME
  FROM ITEM_INFO II
         LEFT JOIN ITEM_TREE IT
                   ON II.ITEM_ID = IT.ITEM_ID
 WHERE IT.PARENT_ITEM_ID IS NULL
 ORDER BY ITEM_ID

-- 느낀점: 간단하지만 재밌는 문제였다. 스토리도 있고 ROOT 아이템이 의미하는게 뭔지 생각해야 하는 문제였다.
-- 다만 업그레이트가 가능하지 않으면 ITEM_TREE에 값이 없을줄 알아서 LEFT JOIN을 쓰고 조건도 IT.ITEM_ID로 했는데 예제를 보니 무조건 데이터가 존재해서 조건을 IT.PARENT_ITEM_ID로 바꿨다.
-- LEFT JOIN도 JOIN으로 바꿨어야 했는데 실수했다.