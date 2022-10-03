package level1;

public class AddOfMatrices {
    // 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
    // 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
    // 내가 공간지각력이 부족한가..? 유독 2차원 배열에서 어려움을 느낀다. 처음 배운 뒤로 잘 접해보지도 않아서 개념을 다시 복습했다.
    // 간단한 문제라서 그리 어렵지 않게 풀었지만 조금만 꼬아도 어려울 수 있겠다는 생각이 든다.
    // 다른 사람의 풀이 중에 어차피 길이는 똑같으니 answer 배열에 arr1을 대입하고 arr2만 더해서 해결한 풀이가 인상적이었다.
}
