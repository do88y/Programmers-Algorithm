package level1;

import java.util.*;

public class ReverseTernary {
    //자연수 n이 매개변수로 주어집니다.
    //n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        String snum = "";

        // 3진수로 쪼개서 배열에 넣기
        while(n > 0) {
            list.add(n % 3);
            n /= 3;
        }

        // 순서대로 answer에 넣기
        for(int i : list) {
            snum += (i+"");
            answer = Integer.parseInt(snum, 3);
        }

        return answer;
    }
    //느낀점: 향상된 for문을 사용하는데 Object를 int에 넣을 수 없다고 나와서 List에 제네릭을 씌워서 해결
    //3진수로 쪼개는 건 기억에 있어서 어렵지 않게 했는데 3진수를 10진수로 바꾸는 알고리즘이 가물가물 해서 검색을 했다.
    //그랬더니 놀랍게도 원래 내가 알고있던 Integer.parseInt()가 진법 변환에도 쓸 수 있다는 걸 알았다.
    //원래 String-> Integer 변환할 때 사용 가능하니 문자열을 넣어도(10진법 이상 OK) 되고
    //두 번째 값에 진수값을 넣어주면 된다.
    //오늘 아침부터 하나 더 배워서 뿌듯하다.
}
