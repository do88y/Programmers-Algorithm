// 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
//예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

public class SumBetTwoInt {

    class Solution {
        public long solution(int a, int b) {
            long answer = 0;

            if(a == b) {
                answer = a;
            }else if(a < b) {
                for(int i=a; i<=b; i++) {
                    answer += i;
                }
            }else {
                for(int i=b; i<=a; i++) {
                    answer += i;
                }
            }


            return answer;
        }
    }

}

// 느낀점: 좋아요 가장 많이 받은 풀이를 보니 등차수열로 문제를 풀었다. 코드가 굉장히 깔끔했다.
// 내 코드는 a == b를 쓰지 않아도 상관 없었다. 좀 더 깔끔한 코드와 효율적인 코드를 위해 노력해야지!
