package level1;

class SumOfFactors {
    // 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0)
                answer += i;
        }
        return answer;
    }
}

// 이번 문제는 쉽네 라고 생각했지만 항상 더 나은 답이 있다는 것에 놀란다.
// for문에서 i <= n/2;를 쓰고 return answer+n;를 쓰면 for문을 다 돌지 않아도 된다.