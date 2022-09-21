package level1;

public class HarshadNumber {
    // 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
    // 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
    // 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

    class Solution {
        public boolean solution(int x) {
            boolean answer = true;
            int sum = 0;
            int a = x;

            while (a >= 1) {
                sum += a % 10;
                a /= 10;
            }

            if (x % sum == 0) {
                return true;
            } else
                return false;
        }
    }

    // 느낀점: 이 문제는 비교적 쉬웠지만 쉬운 문제가 점점 떨어져간다... 큰일이다.....
}
