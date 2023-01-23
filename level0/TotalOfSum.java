package level0;

public class TotalOfSum {
    //정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
    class Solution {
        public int solution(int n) {
            int answer = 0;
            int i = 2;

            while(i <= n) {
                answer += i;
                i += 2;
            }

            return answer;
        }
    }
    //느낀점: for문으로 홀수까지 체크하는 것 보다 바로 2씩 더하는게 효율이 더 좋을 것 같아서 선택한 방법이다.
    //바로 떠오르는 답 보다는 다른 풀이를 생각할줄 알게 되었다는 점이 고무적이다.
}
