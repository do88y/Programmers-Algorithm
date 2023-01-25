package level0;

public class AvgOfArr {
    //정수 배열 numbers가 매개변수로 주어집니다.
    //numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
    public double solution(int[] numbers) {
        double sum = 0;

        for(int number : numbers) {
            sum += number;
        }
        return sum/numbers.length;
    }
    //while을 쓸까 하다가 for each를 썼다. 이유는 루프를 한 번 덜 돌기 때문이다.
    //return에 바로 계산식을 넣어서 효율성을 높이려는 시도를 했다.
    //다른 사람의 풀이를 봤더니 stream을 사용한 멋진 코드가 있었다.
    //아주 깔끔하고 알아보기 쉬웠다. 이렇게 쉬운 코드부터 stream을 익혀나가는게 좋을 것 같다.
}
