package level1;

public class GetMiddleLetter {
    // 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
    public String solution(String s) {
        String answer = "";
        int mid = s.length()/2;
        answer = s.length()%2 == 0 ? s.substring(mid-1, mid+1) : s.substring(mid, mid+1);
        return answer;
    }
    // 느낀점: substr()과 substring()이 많이 헷갈렸다.
    // 다른 사람의 풀이를 보니 return에 substring한 줄로 끝나서 상대적 박탈감을 느꼈다.🥺
}
