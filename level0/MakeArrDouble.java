package level0;

import java.util.Arrays;

public class MakeArrDouble {
    //정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(i -> i*2).toArray();
    }
    //느낀점: stream 연습. 간단한 문제였다. 하지만 toArray()가 생각이 안 나서 검색했다.🥲
}
