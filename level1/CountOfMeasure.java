package level1;

public class CountOfMeasure {
    // 두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서,
    // 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
    int solution(int left, int right) {
        int answer = 0;

        for(int i=left; i<=right; i++) {
            int measure = 0;
            for(int j=1; j<=i; j++) {
                if(i%j == 0) measure++;
            }
            answer = measure%2 == 0 ? answer+i : answer-i;
        }

        return answer;
    }
    // 느낀점: 약수의 계산은 저번에도 나왔던 문제라서 어렵지 않았다. 다만 저번보다 조건이 좀 더 생겨서 고민하는 시간이 조금 더 걸리긴 했다.
    // 문제는 분명 맞는 풀이인데 테스트 통과가 안 되는 것이었다... (단골 멘트)
    // 알고보니 카운드 해 주는 measure 변수 초기화를 for문 바깥에 해버려서 안쪽 for문 돌 때 초기화가 안 된 상태로 계속 카운트가 되어서 생긴 문제였다.
    // 내가 은근히 부주의한걸 느끼는 요즘인데 사소한 실수를 주의해야겠다!
}
