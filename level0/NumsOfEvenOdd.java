package level0;

import java.util.Arrays;

public class NumsOfEvenOdd {
    //정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        answer[0] = (int) Arrays.stream(num_list).filter(e -> e % 2 == 0).count();
        answer[1] = (int) Arrays.stream(num_list).filter(e -> e % 2 != 0).count();
        return answer;
    }
    //느낀점: stream을 연습해 보려고 시도했는데 보기에는 깔끔할 수 있어도 오히려 반복문 한 번 돌며 짝수 홀수 갯수 찾는 것 보다 비효율 적인 방법인 것 같다.
    //IntStream.of((int) Arrays.stream(numList).filter(i -> i % 2 == 0).count(), (int) Arrays.stream(numList).filter(i -> i % 2 == 1).count()).toArray();
    //다른 사람의 풀이에 이렇게 한 줄로 바로 리턴하는 코드도 있던데 이것도 짧긴 하지만 두 번 반복해야 하는 건 마찬가지다.
    //stream을 쓰더라도 상황에 맞게 효율적으로 잘 쓰는게 중요한 것 같다.

}
