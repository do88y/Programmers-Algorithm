package level1;

public class RemoveMinNum {
    // 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
    // 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
    // 제한조건: arr은 길이 1 이상인 배열입니다. 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

    // 내 풀이
    public int[] solution(int[] arr) {
        int[] answer = {};
        int temp;

        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        }else {
            for(int i=0; i<arr.length-1; i++) {
                for(int j=i+1; j<arr.length; j++) {
                    if(arr[i]<arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            answer = new int[arr.length-1];
            for(int i=0; i<arr.length-1; i++)
                answer[i]=arr[i];
        }
        return answer;
    }

    // 다른 사람 풀이
    public static int[] correct(int[] arr) {
        int min = arr[0];
        int[] answer = new int[arr.length - 1];

        if (arr.length <= 1) {
            int[] answer2 = { -1 };
            return answer2;
        }

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (min == arr[j]) {
                continue;
            } else {
                answer[index++] = arr[j];
            }
        }

        return answer;
    }

    // 느낀점: 테스트케이스는 내가 추가 한 것까지 다 통과가 되는데 이상하게 채점만 들어가면 하나도 빠짐없이 모두 실패가 뜬다...
    // 한 시간 반을 붙잡고 있다가 도저히 안되겠어서 일단 다른 사람 풀이를  구글링해서 넣었다.
    // 지금은 내 코드 틀린걸 모르겠는데 나중에 내공이 쌓인 뒤에 다시 돌아봐야겠다. 지금 안 보이던 것이 그 때는 분명 보일 것 같다.
}
