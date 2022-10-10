package level1;

public class CreateWeirdChars {
    // 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
    // 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] sarr = s.split("");

        for(String ss : sarr) {
            if(" ".equals(ss)) {
                cnt = 0;
            }
            else {
                cnt++;
            }
            if(cnt%2 == 0)    answer += ss.toLowerCase();
            else            answer += ss.toUpperCase();
        }

        return answer;
    }
    // 인덱스 구하기 위해 charAt() 사용했는데 컴파일 오류가 나서 다른 방법을 찾을 수가 없어서 결국 구글링을 해봤다... (점점 한계가 느껴져서 슬픔)
    // 인덱스가 아니라 오래 걸려도 하나씩 쪼개서 배열에 넣고 count로 대소문자 바꿀 위치값 알아내서 바꾼 값을 다시 answer에 넣어줘야한다.
    // 하.. 이렇게 풀었더니 10점 주던데 하나도 안 기쁘고 자괴감이 든다...
    // 나는 equals()로 풀었지만 contains()-> 문자열 포함 여부 확인하는 메서드 사용해도 된다. 기억하자!!
}