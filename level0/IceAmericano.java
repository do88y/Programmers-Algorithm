package level0;

import java.util.stream.IntStream;

public class IceAmericano {
    //머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다.
    //머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때, 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
    public int[] solution(int money) {
        return IntStream.of((money/5500), (money%5500)).toArray();
    }
    //느낀점: 그냥 느낌가는 대로 stream 쓴게 정답이라 뿌듯한 마음으로 다른사람 풀이를 봤는데 그냥 배열 생성하면서 바로 연산을 해서 return을 했다.
    //아무래도 그것보다 효율적인 답은 없을 것 같다.
}
