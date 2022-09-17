// 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

public class StringToInteger {
    public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }
}

// 느낀점: 그냥 편한대로 parseInt 내장함수를 사용해서 문제를 풀었는데 함수를 사용하면 알고리즘 연습이 안 될 것 같다.
// 다른 사람 답 아직 안 봤으니까 내일 다시 함수 사용하지 않는 방법으로 풀어봐야겠다.