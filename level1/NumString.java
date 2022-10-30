package level1;

public class NumString {
    //네오와 프로도가 숫자놀이를 하고 있습니다.
    //네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.
    //다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
    //1478 → "one4seveneight"
    //234567 → "23four5six7"
    //10203 → "1zerotwozero3"
    //이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다.
    //s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
    public int solution(String s) {
        int answer = 0;

        String[] nums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String[] strings = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero"};

        for (int i = 0; i < nums.length; i++) {
            if (!s.contains(strings[i])) continue;
            s = s.replace(strings[i], nums[i]);
        }

        return Integer.parseInt(s);
    }
    //느낀점: 어제 배운 contains() 메서드를 이용해 비교적 쉽게 풀었다.
    //아니 쉽게 풀었다기엔 arrayindexoutofbounds 예외가 계속 나서 보니 문자 배열 마지막에 zero를 안 썼던 거였다.
    //어이없는 실수는 언제쯤... 그나마 다행인 건 점점 오류 찾는 속도가 빨라지는 것 같다는 거다.
    //오늘이 일본 여행 마지막 밤인데 열심히 논 만큼 돌아가서 다시 힘차게 달려봐야겠다!
}
