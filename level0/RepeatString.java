package level0;

public class RepeatString {
    //문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
    public String solution(String my_string, int n) {
        String answer = "";

        char[] chars = my_string.toCharArray();
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += chars[i];
            }
        }
        return answer;
    }

    //느낀점: 분명 예전에 풀었던 문제 중에 반복문 사용하지 않고 글자 이어붙이는 방법이 있었는데 생각이 안 났다...
    //다른 사람의 풀이를 보고서야 기억이 났는데 StringBuilder 클래스의 append()를 사용하면 간단하면서 메모리를 덜 낭비하고 문제를 풀 수 있었다.
}
