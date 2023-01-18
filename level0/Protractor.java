package level0;

public class Protractor {
    //각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다.
    //각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.

    public int solution(int angle) {
        int answer = 0;

        if (0 < angle && angle < 90) {
            answer = 1;
        }
        if (angle == 90) {
            answer = 2;
        }
        if (90 < angle && angle < 180) {
            answer = 3;
        }
        if (angle == 180) {
            answer = 4;
        }
        return answer;
    }
    //느낀점: 기초부터 다져야겠다고 생각하고 레벨 0을 풀기 시작했다.
    //삼항연산자로 할까 switch문을 쓸까 하다가 깔끔하게 떨어지지가 않어서 기본적인 if문을 선택했다.
    //역시나 다른 사람의 풀이 추천 상위권에 삼항연산자, if문 모두 있었지만 예상대로 가독성이 좋지 않았다.
    //참신한 해법이 안 떠올라서 아쉽자만 여러 대안을 생각할 수 있었고
    //선택할 때 나름의 이유를 가지고 있었다는 것이 긍정적인 부분이었다.
}
