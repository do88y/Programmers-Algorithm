package level0;

public class OrderedPairs {
    //순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다. 자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (n%i == 0) answer++;
        }
        return answer;
    }
    //stream으로 어떻게 풀어야할지 모르겠어서 그냥 풀었는데 생각보다 쉬웠다.
    //(int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    //int 형변환하는 이유는 아마도 IntStream이 참조형으로 반환되어서 그런 것 같다.
}
