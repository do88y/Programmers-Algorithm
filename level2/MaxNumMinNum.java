package level2;

import java.util.Arrays;

public class MaxNumMinNum {
    //문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
    // str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
    //예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
    public String solution(String s) {
        String answer = "";

        String[] arr = s.split(" ");
        int[] intArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(intArr);

        return intArr[0] + " " + intArr[intArr.length-1];
    }
    //느낀점: 레벨1 남은 문제가 다 어려워서 레벨2로 넘어왔다.
    //쉬운 문제라고 생각해서 생각 없이 풀었다가 역시나 1점을 받았다.
    //좋아요 가장 많이 받은 사람의 풀이를 보니 정렬 메서드를 사용하지 않고
    //min과 max 변수를 사용해서 크면 max에 저장, 작으면 min에 저장을 반복해서 최대,최솟값을 구했다.
    //그 밑에 댓글도 깔끔하다, 부운다는 태도여서 그 댓글에도 자세를 배우게 된다.
    //항상 겸손하게 배우는 자세를 가지기로 다시 한 번 결심한다.
}
