-- 보호소에서 중성화 수술을 거친 동물 정보를 알아보려 합니다.
-- 보호소에 들어올 당시에는 중성화1되지 않았지만, 보호소를 나갈 당시에는 중성화된 동물의 아이디와 생물 종, 이름을 조회하는 아이디 순으로 조회하는 SQL 문을 작성해주세요.
SELECT O.ANIMAL_ID, O.ANIMAL_TYPE, O.NAME
  FROM ANIMAL_INS I
         JOIN ANIMAL_OUTS O
              ON I.ANIMAL_ID = O.ANIMAL_ID
 WHERE I.SEX_UPON_INTAKE LIKE 'Intact%'
   AND (O.SEX_UPON_OUTCOME LIKE 'Spayed%' OR O.SEX_UPON_OUTCOME LIKE 'Neutered%')
 ORDER BY O.ANIMAL_ID

-- 느낀점: 레벨 설정이 잘못 된 문제인듯