package level1;

import java.util.*;
public class DivideIntArr {
    // array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
    // divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor == 0)     list.add(arr[i]);
        }

        if(list.isEmpty())    list.add(-1);

        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
    // 느낀점: 확실히 내가 collection framework에 약하다. 스프링 들어가기 전에 한 번 복습을 했는데도 부족했나보다.
    // get()도 get[]와 헷갈렸고 .isEmpty()도 찾아보고서야 알았다. 조금씩 나아지겠지! 공부 할 게 정말 많다...
}
