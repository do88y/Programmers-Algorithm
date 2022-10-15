package level1;

import java.util.*;

public class SortString {
    // 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
    // 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
    // 제한 조건
    // strings는 길이 1 이상, 50이하인 배열입니다.
    // strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
    // strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
    // 모든 strings의 원소의 길이는 n보다 큽니다.
    // 인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.

    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }

        return answer;
    }
    // 어제 12시 안에 커밋 하느라 문제랑 느낀점을 못 써서 다시 씀. 일단 제한조건에 같은 문자열이 여럿 일 경우,
    // 사전순이라는 말 때문에 단어의 n번째 인덱스 뒤에 단어 자체를 붙였다. 그리고 정렬 후 다시 answer배열에 넣을 때는
    // 첫 글자를 뺸 단어를 넣어야 한다는 것 말고는 크게 어려운 점은 없었다.
    // 다만, 조금씩 익숙 해 지는 중이라고 하지만 아직 메서드들의 사용법이 좀 어색하다. 이번에는 charAt()과 substring()을 복습하는 느낌이었다.
}