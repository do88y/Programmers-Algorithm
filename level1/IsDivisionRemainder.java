package level1;

class IsDivisionRemainder {
// 자연수 n이 매개변수로 주어집니다.
// n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
// 답이 항상 존재함은 증명될 수 있습니다.

    public int solution(int n) {
        int answer;
        for(answer = 1; answer <= 1000000; answer++) {
            int div = n%answer;
            if(div == 1) {
                break;
            }
        }
        return answer;
    }
}

// 조건이 3 ≤ n ≤ 1,000,000 로 주어진 것을 활용하여 for(answer = 2; answer < n; answer++)로 조건 설정하는 것이 효율적이었을 것
// if 조건에도 if(n%answer == 1)로 적으면 더 간결하다.