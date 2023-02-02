package level0;

public class ReverseString {
    //문자열 my_string이 매개변수로 주어집니다.
    //my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer(my_string);

        return sb.reverse().toString();
    }
    //느낀점: 사실 stream 연습하려고(중독임) stream string 뒤집기 키워드로 구글링 하다가 StringBuffer 클래스의 reverse() 메서드를 발견했다.
    //정말 깔끔하고 직관적으로 마무리 할 수 있는 코드라는 생각이 들어서 사용해 봤다.
    //아쉬웠던 점은 다른 사람 코드를 보니 return 값에 바로 new로 생성할 수 있다는 생각을 못 했다는 것이다.
}
