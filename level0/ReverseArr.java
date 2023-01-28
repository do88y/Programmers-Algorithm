package level0;

public class ReverseArr {
    //정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
    //num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution(int[] num_list) {
        int leng = num_list.length;
        int[] answer = new int[leng];

        int count = 0;
        for(int i = leng-1; i >= 0; i--) {
            answer[count] = num_list[i];
            count ++;
        }

        return answer;
    }
    //느낀점: 내가 후보로 생각한 풀이들
    //1. 배열을 String으로 합쳐서 10으로 나눈 나머지를 하나씩 배열에 넣는다.
    //2. stack에 쌓아서 하나씩 꺼내서 배여렝 넣는다.
    //3. for문을 이용한다.
    //이 정도였는데 무슨 경우의 수를 생각해도 두 번의 과정을 거쳐야 하는 것 같아서 그냥 제일 간단한 for문으로 풀었다.
    //바로 전 시간에 배열을 stream으로 만들 수 있다는 걸 배웠는데 까맣게 잊어버리고 무넺 제출할 때 앗차 하고 생각났다.
    //심지어 count로 인덱스 변수를 선언하지 않고도 num_list.length-i-1로 인덱스를 구할 수 있었다... 아직 level0에서도 배울게 한참 많구나...
    //오히려 좋다.☺️
}
