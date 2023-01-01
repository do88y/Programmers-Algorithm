package level1;

import java.util.HashMap;
import java.util.Map;

public class MostCloseChar {
    //문자열 s가 주어졌을 때, s의 각 위치마다 자신보다 앞에 나왔으면서, 자신과 가장 가까운 곳에 있는 같은 글자가 어디 있는지 알고 싶습니다.
    //예를 들어, s="banana"라고 할 때,  각 글자들을 왼쪽부터 오른쪽으로 읽어 나가면서 다음과 같이 진행할 수 있습니다.
    //
    //b는 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
    //a는 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
    //n은 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
    //a는 자신보다 두 칸 앞에 a가 있습니다. 이는 2로 표현합니다.
    //n도 자신보다 두 칸 앞에 n이 있습니다. 이는 2로 표현합니다.
    //a는 자신보다 두 칸, 네 칸 앞에 a가 있습니다. 이 중 가까운 것은 두 칸 앞이고, 이는 2로 표현합니다.
    //따라서 최종 결과물은 [-1, -1, -1, 2, 2, 2]가 됩니다.
    //
    //문자열 s이 주어질 때, 위와 같이 정의된 연산을 수행하는 함수 solution을 완성해주세요.

    public int[] solution(String s) {
        int length = s.length();
        int[] answer = new int[length];

        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length; i ++) {
            int result = map.getOrDefault(chars[i], -1);
            if (result == -1) {
                map.put(chars[i], i);
                answer[i] = result;
            } else {
                int prevLocation = i - result;
                map.put(chars[i], i);
                answer[i] = prevLocation;
            }
        }

        return answer;
    }
    //느낀점: 오랜만의 코딩테스트였는데 한 번에 성공이 떠서 놀랐다;;;
    //프로젝트 진행하면서 해결 과제에 논리적으로 접근하는 감각이 조금 성장한 것 같다.
    //사실 한 번은 아니고 import를 잊어버려서 두번째였지만... ㅎ
    //좀 더 다듬으면 예뻐질 것 같지만 날 것 그대로 두기로 했다.
    //new int[s.length()]로 바로 넣을 수 있는 것 기억하자.
    //charAt을 쓰면 s를 배열로 바꿀 필요가 없었다.
    //다른 사람의 풀이를 보니 getDefault가 아니라 containsKey를 썼던데
    //컬렉션을 더 잘 활용하려면 공부가 필요할 것 같다.
}
