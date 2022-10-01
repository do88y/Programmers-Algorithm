package level1;

public class DotProduct {
    // 길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
    // 이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)

    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i=0; i<a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }
    // 느낀점: 이거 그냥 반복문으로 연산하는거 아냐..? 라고 생각이 들 정도로 너무 간단해서 더 나은 풀이가 뭐가 있을까를 고민했다.
    // 없어서 그냥 제출했지만 +1점... 대략 5400명이 나와 같은 답을 제출했고 24명 정도 stream을 사용해서 풀었다.
    // stream을 사용할줄 모르는데 공부를 해야겠다고 생각했다. 안 쓰는 것과 못 쓰는 건 다르니까.
}
