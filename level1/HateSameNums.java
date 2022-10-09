package level1;

import java.util.ArrayList;

public class HateSameNums {
    // 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
    // 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
    // arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
    // arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
    // 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(arr[0]);
        for(int i=1; i<arr.length; i++) {
            if(arr[i] != arr[i-1])  list.add(arr[i]);
        }

        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
    // 느낀점: 또 작은 실수 때문에 테스트케이스가 실패로 떴다... 오늘의 실수는 list.add(arr[0])를 arr[1]로 적는 실수를 했다.
    // 뭐가 잘못됐지 하면서 실수를 찾느라 시간을 한참 썼다. 실수를 하지 않도록 좀 더 주의해야겠다.
}
