package level1;

public class SumOfNegPosNums {
    // 어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
    // 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i<signs.length; i++) {
            if(signs[i])    answer += absolutes[i];
            else            answer -= absolutes[i];
        }
        return answer;
    }
    // 느낀점: 다른 풀이를 보니 if문 대신에 삼항 연산자를 써서 true면 1을, false면 -1을 곱해줬다.
    // 다른 풀이도 삼항연산자를 쓰니 if문 안 쓰고 깔끔하게 한 줄로 끝났다. 삼항연산자를 잘 활용하자!
}
