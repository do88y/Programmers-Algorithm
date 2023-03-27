package level0;

import java.util.Arrays;
import java.util.function.Predicate;

public class ArraySimilarity {
    //두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
    public int solution(String[] s1, String[] s2) {
        return (int) Arrays.stream(s1).filter(s -> Arrays.stream(s2)
                .anyMatch(Predicate.isEqual(s))).count();
    }
    //느낀점: 처음에 중간연산자를 filter가 아닌 map을 썼더니 아무리 해도 답이 안 나왔다...
    //anyMatch(Predicate.isEqual())은 list 비교하는 것으로 외워둬야겠다.
}
