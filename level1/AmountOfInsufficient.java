package level1;

public class AmountOfInsufficient {
    // 새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다.
    // 이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다.
    // 즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
    // 놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
    // 단, 금액이 부족하지 않으면 0을 return 하세요.

    public long solution(long price, long money, int count) {
        long answer;

        while(count != 0) {
            money -= price*count;
            count --;
        }
        answer = (money >= 0) ? 0 : money*-1;

        return answer;
    }
    // 느낀점: 점수가 +10이 떠서 기분이 좋았다. 뭐 정확성과 효율성을 기준으로 점수 매긴다던데...
    // 이번에 처음으로 삼항연산자를 사용해봤고 또 long타입과 섞여있어서 몇 케이스가 에러나길래 그냥 연산하는 변수들은 다 long으로 바꿔서 받았다.
    // 조금씩 코드가 깔끔해지는 것 같아서 뿌듯하다.
}
