package level1;

public class IsSquareRoot {
    // 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
    //  n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

    public long solution(long n) {
        long answer = 0;
        double x = Math.sqrt(n);

        if(Math.floor(x) == x)
            return (long)(x+1) * (long)(x+1);
        else
            return -1;
    }
    // 느낀점: 이것도 틀린게 없는 것 같은데 자꾸 테스트 중 40%는 실패가 떠서 답답해서 구글링을 해 보니
    // return때 형변환을 long이 아니라 int로 해서 그런거였다. 습관처럼 int로 형변환을 했는데 오류는 안 떠서 찾기가 어려웠다.
    // 리턴한 정수 뒤에 L이 붙지 않아서 테스트 실패가 뜬 것 같다. 사소한 실수를 주의해야겠다...
}