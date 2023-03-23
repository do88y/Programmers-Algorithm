package level0;

public class SharePizza2 {
    //머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
    //피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
    public int solution(int slice, int n) {
        int answer = 1;
        while (answer * slice < n) {
            answer ++;
        }
        return answer;
    }
    //느낀점: 이정도면 무난하지~ 하면서 제축했는데 다른 사람의 풀이가 왜 정답인지 도저히 이해가 안 간다...
    //return n % slice > 0 ? n/slice+1 : n/slice; 이거 한 줄인데 대입해 봐도 답이 안 나오는 것 같은데😭
    //이것도 이해 안 가는게 어이없어🥹 누구한테 물어봐야지...
}
