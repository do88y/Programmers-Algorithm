package level1;

class AvgOfArray {
    // 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

    public double solution(int[] arr) {
        double sum = 0;
        for (int i = 0; i<arr.length; i++) {
            sum += arr[i];
        }
        double answer = sum/arr.length;
        return answer;
    }
}

// 느낀점: foreach를 쓰면 좀 더 직관적이고 깔끔하게 풀 수 있었겠다.