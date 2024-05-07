-- FISH_INFO 테이블에서 잡은 BASS와 SNAPPER의 수를 출력하는 SQL 문을 작성해주세요.
-- 컬럼명은 'FISH_COUNT`로 해주세요.
SELECT COUNT(I.ID) AS FISH_COUNT
  FROM FISH_INFO I
         JOIN FISH_NAME_INFO NI
              ON I.FISH_TYPE = NI.FISH_TYPE
 WHERE NI.FISH_NAME IN ('BASS', 'SNAPPER')

-- 느낀점: 아직도 간단한 쿼리도 뚝딱 해결을 못 하고 오래 생각해야 하는 것 같다..