package level1;

import java.util.Arrays;

public class DescendingString {
    // 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    // s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        char[] arrs = s.toCharArray();
        Arrays.sort(arrs);

        for (int i = arrs.length - 1; i >= 0; i--) {
            sb.append(arrs[i]);
        }
        answer = sb.toString();
        return answer;
    }
    // 느낀점: 문자열을 내장함수로 sort했을 때 어떤 방식으로 정렬되는지 몰랐다. 대문자가 소문자보다 우선시 되고 알파벳 순으로 정렬이 된다.
    // 결국 정렬 된 문자열을 거꾸로 반환하면 되는 문제였다.
    // 다른 사람의 풀이를 보니 StringBuilder나 Stream을 이용해서 엄청 간단하고 깔끔하게 풀었다. 내장 함수도 잘 알아두면 유용하게 쓸 수 있는 것 같다.
}
