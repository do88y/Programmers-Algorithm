package level1;

public class Year2016 {
    // 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
    // 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
    // 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT 입니다.
    // 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
    public String solution(int a, int b) {
        String answer = "";
        int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] days = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int sum = 0;

        for(int i=0; i<a-1; i++) {
            sum += months[i];
        }
        int day = (sum+b) % 7;

        return days[day];
    }
    // 느낀점: 오늘은 다른 날 보다 문제 푸는데 걸린 시간이 적었다. 이번 다른사람 풀이에는 자바 util 날짜 관련 내장 메서드를 쓴 답도 있었지만
    // 내가 쓴 코드가 마음에 든다. 다만, 7로 나눠서 나온 값을 switch를 써서 answer에 요일을 넣어주는 답은 인상적이었다.
}
