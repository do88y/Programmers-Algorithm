package level1;

import java.util.*;

public class PickTwoNumsAndAdd {
    //정수 배열 numbers가 주어집니다.
    //numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를
    //배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (!list.contains(sum)) {
                    list.add(sum);
                }
            }
        }
        Collections.sort(list);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
    //느낀점: 인텔리제이의 도움을 받긴 했지만 이제 컬렉션일 때 Collections.sort() 메서드도 쉽게 떠올릴 수 있다.
    //컬렉션에서 포함되어 있는지 찾는 메서드 contains()가 생각이 안 나서 검색을 했다.
    //그것 말고는 딱히 어려운 것 없이 무난하게 이중 for문으로 풀 수 있는 문제였다.
    //이것도 stream으로 짧게 풀 수 있을 것 같아 다른 사람의 풀이를 보니 역시나 stream으로 푼 답이 있었고
    //Iterator로 hasNext()메서드를 사용해서 푸니 좀 더 간결해 보였다. Iterator 기억해 둬야지.
    //일본 여행 와서도 조금씩이라도 공부 하려고 노트북 들고왔는데
    //무거운 거 들고다니느라 조금 피곤해도 루틴이 깨지지 않으니 마음에 안정이 온다.
}
