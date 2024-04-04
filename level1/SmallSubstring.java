package level1;

public class SmallSubstring {
    // 숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서,
    // 이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.
    public int solution(String t, String p) {
        int answer = 0;
        long pNumber = Long.parseLong(p);

        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            long subTNumber = Long.parseLong(t.substring(i, i + p.length()));
            if (subTNumber <= pNumber) {
                answer ++;
            }
        }
        return answer;
    }
    // 몇몇 케이스에서 런타임 에러가 발생했는데, 큰 숫자들이 있었기 때문에 int가 아닌 long을 사용하니 해결되었다.
}
