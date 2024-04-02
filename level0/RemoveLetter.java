package level0;

import java.util.List;

public class RemoveLetter {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] split = my_string.split("");
        List<String> sList = List.of(split);
        for (int i = 0; i < sList.size(); i++) {
            if (sList.get(i).equals(letter))    sList.remove(sList.get(i));
            answer += sList.get(i);
        }
        return answer;
    }
}
