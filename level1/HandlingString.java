package level1;

public class HandlingString {
    // 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
    // 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

    public boolean solution(String s) {
        boolean answer = true;

        String pattern = "^(\\d{4}|\\d{6})$";
        answer = s.matches(pattern);

        return answer;
    }
    // 느낀점: 정규식 기억 안 나서 찾아봤는데 생각보다 복잡하지 않았다. 다만 \d 쓸 때는 앞에 하나를 더 붙여야 한다.
    // 문제 풀수록 점점 문제 푸는 방식을 선택하는 폭이 넓어진다. 뭐든 꾸준함이 중요하다.

}
