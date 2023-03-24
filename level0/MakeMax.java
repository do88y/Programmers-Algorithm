package level0;

import java.util.Arrays;

public class MakeMax {
    //정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
    public int solution(int[] numbers) {
        return Arrays.stream(numbers).sorted().skip(numbers.length-2).reduce(1, (a, b) -> a*b);
    }
    //느낀점: stream 연습을 위해 좀 억지스럽긴 하지만 풀긴 풀었다.
    //sorted(Comparator.reverseOrder())이 코드가 왜 에러가 뜨는줄 몰랐는데 boxed()를 이용해 박싱을 해줘야 사용 가능했다.
}
