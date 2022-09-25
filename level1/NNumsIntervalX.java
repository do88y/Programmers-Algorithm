package level1;

public class NNumsIntervalX {

    // 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
    // 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i=0; i<answer.length; i++) {
            if (i==0) {
                answer[0] = x;
                continue;
            }
            answer[i] = (i+1)*(long)x;
        }

        return answer;
    }
    // 느낀점: 이번에도 다른 테스트 13,14 두 케이스만 실패가 떠서 long으로 형변환을 해줬더니 통과됐다.
    // 정확히 언제 수동으로 형변환 해야하는지 모르겠는데 (곱하는 과정에서 요류가 나는건가..) 타입을 최대한 맞춰줘야겠다.
    // 다른 풀이를 보니 if(i==0)은 필요 없었다.
}
