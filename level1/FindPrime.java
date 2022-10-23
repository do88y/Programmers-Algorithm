package level1;

public class FindDecimal {
    //1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
    //소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
    //(1은 소수가 아닙니다.)
    public int solution(int n) {
        int answer = n;
        int count = 0;

        //n까지의 수 전부
        for(int i=2; i<=n; i++) {
            //n 전까지의 수로 나누기
            for(int j=2; j<i; j++) {
                if(i == j)    break;
                if(i%j == 0) {
                    answer--;
                    break;
                }
            }
        }

        return answer-1;
    }
    //느낀점: 시간 안에 커밋 하려면 바빠서 일단 커밋부터 함...
}
