package level1;

public class FindKim {
    // String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
    // seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

    class Solution {
        public String solution(String[] seoul) {
            String answer = "";

            for(int i=0; i<seoul.length; i++) {
                if(seoul[i].equals("Kim")) {
                    answer = "김서방은 " + i + "에 있다";
                }
            }

            return answer;
        }
    }

    // 느낀점: for문 끝에 break;을 넣었으면 한 번 덜 돌아서 효율성을 높일 수 있었다.
}
