package level0;

import java.util.Arrays;

public class CutArr {
    //정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.stream(numbers).skip(num1).limit(num2-num1+1).toArray();
    }
    //느낀점: 역시나 오늘도 stream 연습 중이다.
    //나는 복잡한 방법을 썼는데 다른 사람의 풀이를 보니 더 간단한 방법이 있었다.
    //copyOfRange() 라는 걸 처음 봤는데, 특정 범위의 배열을 복사하는 메서드가 있었다.
    //처음에는 배울 게 끝이 없어서 재밌다는 생각을 했는데 요즘은 조금 지치는 것 같다. 아무래도 마음에 취업에 대한 부담을 가지면서 그렇게 된 것 같다.
    //마음을 조금은 편하게 가지는게 좋을 것 같다.
}
