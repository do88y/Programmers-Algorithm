package level1;

import java.util.*;

public class DescOrderInt {
    // 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
    class Solution {
        public long solution(long n) {
            String str = Long.toString(n);
            List<Character> list = new ArrayList<Character>();

            for (int i = 0; i < str.length(); i++) {
                list.add(str.charAt(i));
            }

            list.sort(Comparator.reverseOrder());

            String strTemp = "";
            for (int i = 0; i < list.size(); i++) {
                strTemp += list.get(i);
            }

            return Long.parseLong(strTemp);
        }
    }
    // 느낀점: level1 첫번째 페이지에서 유일하게 못 푼 문제였는데 오늘 결국 구글링을 했다.
    // 배열의 길이가 정해져 있지 않은 상황에서 List를 사용하면 add로 배열에 추가할 수 있다는 걸 알고 있었는데 막상 실전이 되니 활용을 못 했다.
    // 내림차순 배열도 알고 있다고 생각했는데 문제로 마주하고 나서야 모른다는걸 알았다. 일반 타입과 컬렉션 타입이 다르다는 것도 처음 알았다.
    // 문제 풀면서 부족함을 알게되어 마음이 쓰리지만 자극이 되어서 좋다.
}
