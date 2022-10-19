package level1;

public class GCDandLCM {
    // 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
    // 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
    // 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int big = n>m ? n : m;
        int small = n+m-big;
        int temp = 0;

        while(big%small != 0) {
            temp = small;
            small = big%small;
            big = temp;
        }
        answer[0] = small;

        answer[1] = n*m/answer[0];
        return answer;
    }
    //느낀점: 결국 풀이법을 찾아 헤메이다 유클리드 호제법을 만나게 되었다. 먼저 유클리드 호제법으로 최대공약수를 구한 뒤에
    //두 수의 곱을 최대공약수로 나누면 최소공배수를 구할 수 있었다.
    //두 수를 나누어 나머지가 0이 되었을 때 작은 수가 두 수의 최대공약수인데, 나누어 떨어지지 않으면 작은 수와 두 수를 나눈 나머지를
    //반복해서 나머지 0이 될 때 까지 나누면 된다. 공통수학 이후로 수포자였기 때문에 수학적 사고력이 부족할 수 있지만 모르면 공식을 외워서 응용하면 된다고 생각한다.
}
