package level1;

import java.util.Arrays;

public class WhoDidNotFinish {
    //수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
    //마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
    class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";

            Arrays.sort(participant);
            Arrays.sort(completion);

            int i = 0;
            for (i = 0; i < completion.length; i++) {
                if (!participant[i].equals(completion[i])) break;
            }

            return participant[i];
        }
    }

    //느낀점: 오랜만에 알고리즘 문제를 풀어봤는데 문제 푸는 것 자체는 어렵지 않았는데 효율성 테스트에서 통과가 안 됐다.
    //나는 이중 for문을 이용해서 풀었는데 너무 시간이 오래 걸리는 풀이였다.
    //검색을 해 보니 컬렉션으로 만들 필요도 없이 정렬을 해서  두 배열을 비교하면 간단하게 끝나는 문제였다.
    //이제는 단순히 문제를 푸는걸 목적으로 하기 보다는 효율적으로 문제를 해결할 수 있는 방법을 고민해야겠다.
}
