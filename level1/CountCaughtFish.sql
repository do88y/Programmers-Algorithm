-- 잡은 물고기 중 길이가 10cm 이하인 물고기의 수를 출력하는 SQL 문을 작성해주세요.
-- 물고기의 수를 나타내는 컬럼 명은 FISH_COUNT로 해주세요.
SELECT COUNT(*) AS FISH_COUNT
FROM FISH_INFO
WHERE LENGTH IS NULL

-- 느낀점: 문제를 제대로 안 읽어서 `잡은 물고기의 길이가 10cm 이하일 경우에는 LENGTH 가 NULL`이라는 걸 뒤늦게 봤다.
-- 그것 말고는 그냥 count 사용하는 문제였다.