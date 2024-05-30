-- PATIENT, DOCTOR 그리고 APPOINTMENT 테이블에서 2022년 4월 13일 취소되지 않은 흉부외과(CS) 진료 예약 내역을 조회하는 SQL문을 작성해주세요.
-- 진료예약번호, 환자이름, 환자번호, 진료과코드, 의사이름, 진료예약일시 항목이 출력되도록 작성해주세요. 결과는 진료예약일시를 기준으로 오름차순 정렬해주세요.
SELECT A.APNT_NO,
       P.PT_NAME,
       P.PT_NO,
       A.MCDP_CD,
       D.DR_NAME,
       A.APNT_YMD
  FROM APPOINTMENT A
        JOIN PATIENT P
            ON A.PT_NO = P.PT_NO
        JOIN DOCTOR AS D
            ON D.DR_ID = A.MDDR_ID
 WHERE A.MCDP_CD = 'CS'
   AND DATE_FORMAT(A.APNT_YMD, '%Y-%m-%d') = '2022-04-13'
   AND APNT_CNCL_YN = 'N'
 ORDER BY APNT_YMD

-- 느낀점: 처음에 CTE 사용했다가 과하다는걸 알고 고쳤다. 간결하고 정확하게 하기 힘들다.🥲