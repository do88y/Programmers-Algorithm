package level0;

public class divisionOfNums {
    //정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
    public int solution(int num1, int num2) {

        return (int)((double)num1/num2*1000);
    }
    //느낀점: 설마 이것도 stream으로 풀 수 있으려나 싶었는데 아니었다.
    //이렇게 stream에 대한 광기는 커져한 갔다...
    //암튼 이게 맞나 반신반의 하면서 casting 한 답이 한 번에 맞아서 기분은 좋았다.
}
