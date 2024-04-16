package level1;

public class SmallestRectangle {
    // 모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다.
    // 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.
    public int solution(int[][] sizes) {
        int widthSize = 0;
        int lengthSize = 0;
        for (int i = 0; i < sizes.length; i++) {
            int right = sizes[i][0];
            int left = sizes[i][1];

            int max = Integer.max(right, left);
            if (max > widthSize) widthSize = max;

            int min = Integer.min(right, left);
            if (min > lengthSize) lengthSize = min;
        }

        return widthSize * lengthSize;
    }

    // 느낀점: stream으로 풀어보려고 했는데 실패. 다른 사람의 풀이를 보니 for문으로도 깔끔하게 잘 풀었다.
    // 2차원 배열에 익숙하지 않아서 sizes[i][i] 이렇게 값을 가져오는줄 알았는데 sizes[i] 이렇게 가져오면 됐었다.ㅠ
}
