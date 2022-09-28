package level1;

public class AddMissingNums {
    // 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
    // numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

    public int solution(int[] numbers) {
        int answer = -1;
        int numsum = 0;
        int resum = 0;

        for(int i=0; i<numbers.length; i++) {
            numsum += numbers[i];
        }
        for(int i=0; i<=9; i++) {
            resum += i;
        }

        return resum-numsum;
    }
    // 느낀점: 전체 합에서 주어진 배열 합의 차를 구하는 접근은 좋았지만 다른 사람의 풀이를 보니 더 간결하게 표현 할 수 있었다.
    // 주어진 배열을 향상된 for문으로 돌려서 sum에서 바로 대입한 i값을 빼주면 코드를 줄일 수 있었다.
    // 사실 내 코드가 훨씬 길게 느껴지는 건 0-9를 미리 더하지 않고 for문으로 더했기 떄문인데
    // 미리 더한 값을 대입하는 건 꼼수처럼 느껴졌기 때문에 그랬지만 어차피 바뀌지 않을 값이기 때문에 상관 없을 것 같다!
}
