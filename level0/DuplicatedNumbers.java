package level0;

import java.util.Arrays;

public class DuplicatedNumbers {
    //정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(i -> i == n).count();
    }
    //느낀점: 다른 사람 풀이를 봤더니 eachfor문을 사용하고 그 안에 삼항연산자를 사용해서 1 혹은 0을 더해주는 답이 인상깊다.
    //삼항연산자로 계산한 결과를 바로 변수에 넣는 연산까지 가능한 줄 몰랐는데 하나 배웠다...
    //이렇게 입문 단계에도 배울 게 많다니..!
}
