package level2;

import java.util.Objects;

public class CorrectBracket {
    //괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어
    //"()()" 또는 "(())()" 는 올바른 괄호입니다.
    //")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
    //'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고,
    //올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.
    boolean solution(String s) {
        boolean answer = true;
        int temp = 0;

        char[] chars = s.toCharArray();
        for (char i : chars) {
            if (Objects.equals(i, '(')) temp += 1;
            else temp -= 1;
            if(temp == -1)   return false;
        }
        if (temp == 0)  return true;
        else return false;
    }
    //느낀점: 오랜만에 오류 없이 한 번에 성공한 문제다. 5점 받아서 기분이 더 좋았다.
    //어떻게 풀어야 할지 계속 머릿속에 두고 고민하다가 해법이 떠올라서 노트북을 켰다.
    //인텔리제이 도움도 아주 컸다. 메서드가 가물가물 할 때 도움이 많이 된다.
    //오늘 새로 배운 것도 있는데 i와 '('를 비교할 때 i.equals('(')를 했더니 오류가 났다.
    //인텔리제이가 Objects.equals를 추천 해 줘서 저 메서드의 존재를 알았다.
    //참 신통방통하다. 인텔리제이 호감 +1
    //끙끙거리며 시간 끄는 것 보다 이렇게라도 도움 받아서 배우는게 낫지 않을까?
}
