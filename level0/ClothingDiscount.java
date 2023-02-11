package level0;

public class ClothingDiscount {
    //머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
    //구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
    public int solution(int price) {
        if (price < 100000) return price;
        else if (price <= 300000)   return price * 95 / 100;
        else if (price <= 500000)   return price * 90 / 100;
        else   return price * 80 / 100;
    }
    //느낀점: 레벨0에서 처음으로 고득점이 나와서 물음표가 떴다.
    //왤까 생각해보니 price*0.9를 하면 int로 한번 더 캐스팅을 해야하는데 그것보다 한 번 더 연산작업을 하는 선택을 해서 그런 것 같다.(추측임)
    //다른 사람 풀이 중에 인상적이었던 건 큰 수 부터 조건을 걸면 마지막 else가 없어도 된다는 것이다.
    //얼마나 차이가 날지는 모르겠지만 경우의 수를 하나 더 알고있는 것과 모르는 건 많은 차이가 있다고 생각한다.
}
