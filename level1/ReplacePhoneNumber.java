package level1;

public class ReplacePhoneNumber {

    // 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
    // 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를
    // 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

    class Solution {
        public String solution(String phone_number) {
            String answer = "";
            int leng = phone_number.length();

            for(int i = 0; i < leng-4; i++) {
                answer += "*";
            }
            answer += phone_number.substring(leng-4);

            return answer;
        }
    }

}
// 느낀점: 다른 사람들이 푼 것을 보니 참 깔끔하고 효율적으로 하는 방법이 다양했다. 이걸 한 번에 머리에 넣기는 힘드니 블로그에 정리 해 봐야겠다.