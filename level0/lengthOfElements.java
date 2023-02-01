package level0;

public class lengthOfElements {
    //문자열 배열 strlist가 매개변수로 주어집니다.
    //strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
    //느낀점: stream을 연습 중이라 이것도 stream으로 풀어보려고 시도했다가 stream은 기본적으로 참조형 타입으로 값이 나오는 걸 알았다.
    //성능 안나온다고 하는 이유 중에 하나가 박싱 언박싱을 하기 때문이었다.
    //Arrays.stream(strList).map(element -> element.length()).toArray() 여기까지 했는데 int로 리턴 실패...
    //연산 값이 Integer로 나와서 헤메다가 결국 for문 써서 풀고 다른 사람 풀이를 보니까 mapToInt() 라는게 있었다.
    //IntStream로 바꿔주는 메서드가 있었다. 오늘도 하나 배워서 좋다☺️
}
