package level1;

public class NatNumToArray {

    // 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
    class Solution {
        public int[] solution(long n) {
            String s =n+"";
            int[] answer = new int[s.length()];
            int i = 0;

            // for문과 %이용해서 배열에 거꾸로 넣기
            while(n > 0) {
                answer[i] = (int)(n%10);
                n = n/10;
                i++;
            }
            return answer;
        }
    }

}

// 느낀점: 사실 이번에 구글링 도움을 받았다. 분명 알고리즘 자체는 맞는데 ArrayIndexOutOfBoundsException이 떠서 답답했다.
// 이유는 배열 길이 지정을 안 해줬기 때문이었다...
// String s =n+"";와 int[] answer = new int[s.length()]; 두 줄을 넣었더니 잘 됐다. 기본기가 참 중요하다는 것을 느낀다.
