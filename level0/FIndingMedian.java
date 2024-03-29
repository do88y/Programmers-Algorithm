package level0;

import java.util.Arrays;

public class FIndingMedian {
    //중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
    //예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
    public int solution(int[] array) {
        int answer = 0;
        int[] ints = Arrays.stream(array).sorted().toArray();
        answer = ints[array.length / 2];
        return answer;
    }
    //느낀점: stream 이용해서 풀어보려고 했는데 특정 값을 뽑아내는 데에는 stream이 적합하지 않은 것 같다.
    //바로 배열 인덱스를 return 할 수 없다는 건 처음 알았다.
    //다른 사람의 풀이에서 배운 건 array[array.length >> 1] 이렇게 shift로도 풀 수 있다는 것👍
}
