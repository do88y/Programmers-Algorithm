-- 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.

class EvenOrOdd {
    public String solution(int num) {
        int cal = num % 2;
        if (cal == 0) {
            String answer = "Even";
            return answer;
        } else {
            String answer = "Odd";
            return answer;
        }
    }
}