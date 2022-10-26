package level1;

public class FindPrime {
    //1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
    //소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
    //(1은 소수가 아닙니다.)
    public int solution(int n) {
        int answer = 0;
        boolean isPrime;

        //n까지의 수 전부
        for(int i=2; i<=n; i++) {
            isPrime = true;
            //n 전까지의 수로 나누기
            for(int j=2; j<i; j++) {
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)  answer++;
        }

        return answer;
    }
    //느낀점: 이 코드가 맞는 것 같은데 시간초과가 되어서 다시 풀어봐야한다.
    // 근데 지금 실력으로는 모르겠어서 나중에 다시 봐야할 것 같다...ㅠ
}
