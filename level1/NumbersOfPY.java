package level1;

public class NumbersOfPY {
    // 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
    // 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

    class Solution {
        boolean solution(String s) {
            boolean answer = true;
            int p = 0;
            int y = 0;
            String ls = s.toLowerCase();

            for(int i=0; i<ls.length(); i++) {
                if(ls.charAt(i) == 'p')
                    p++;
                else if(ls.charAt(i) == 'y')
                    y++;
            }

            if(p==0 && y==0)
                answer = true;
            if(p == y)
                answer = true;
            else if(p != y)
                answer = false;

            return answer;
        }
    }
}
// 느낀점: 다른 사람 풀이를 보니 람다식을 써서 한 줄로 표현한 사람이 있었지만 그건 시간이 훨씬 많이 걸린다고 한다.
// 다른 사람 코드에서는 count 변수를 하나만 줘서 p면 +, y면 -되게 해서 count==0이면 true 반환하게 한게 신선했다.
// return에 p==y로 쓰면 true와 false가 알아서 반환되는 것도 다시 떠올리게 되었다.