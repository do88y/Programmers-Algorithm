package level1;

public class CaesarCipher {
    //어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
    //예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다.
    //"z"는 1만큼 밀면 "a"가 됩니다.
    //문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            //공백 처리
            if(ch==' ') {
                answer += ch;
                continue;
            }
            //소문자
            if(ch>='a' && ch<='z') {
                if(ch+n > 'z') {
                    answer += (char)(ch-26+n);
                }else {
                    answer += (char)(ch+n);
                }
            //대문자
            }else if(ch>='A' && ch<='Z') {
                if(ch+n > 'Z') {
                    answer += (char)(ch-26+n);
                }else {
                    answer += (char)(ch+n);
                }
            }
        }
        return answer;
    }
    //이 문제는 방식은 알겠는데 머릿 속에서 정리가 안 되어서 구글링을 했다.
    //내 코드가 답이 안 나온 이유는
    //소문자와 대문자 처리를 한 번에 하려고 함-> 간결한 코드도 좋지만 길어도 보기좋게 정리된 코드가 나을 수 있다.
    //공백 처리 위치를 잘못 잡음-> 처음부터 공백일 시 문자열에 더해주면 됨.
    //문자를(int)를 씌워서 형변환 할 필요도 없었다.
    //그냥 문자가 들은 변수 그대로 연산이 가능한 걸 몰랐다. 뭐 알았다면 큰 수확 아닐까! ㅎㅎ
    //다만, 연산이 끝난 뒤 (char)로 형변환 해서 대입해줘야 함.
}
