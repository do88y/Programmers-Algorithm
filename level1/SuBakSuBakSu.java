package level1;

public class SuBakSuBakSu {

    // 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
    // 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
    class Solution {
        public String solution(int n) {
            String answer = "";

            for(int i=1; i<=n; i++) {
                if(i%2 == 1) {
                    answer += "수";
                }else {
                    answer += "박";
                }
            }

            return answer;
        }
    }
}
// 느낀점: 긴 고민 없이 알고리즘을 짰는데 창의적인 다른 사람들의 답을 보면서 고민 없이는 좋은 알고리즘이 나올 수 없겠다는 생각이 든다.
// 하루 할당량을 채운다는 생각이 아니라 실력 향상을 위한 공부를 해야겠다.