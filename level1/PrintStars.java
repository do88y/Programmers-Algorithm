package level1;

import java.util.Scanner;
public class PrintStars {
    // 이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
    // 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=1; i<=b; i++) {
            for(int j=1; j<=a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    // 느낀점: 이 문제는 워낙 유명한 문제라서 간단하게 풀었다. 그 와중에 람다식으로 신박하게 푼 사람도 있었다.
    // 자바 복습하러 가야지 ㅎㅎ...
}
