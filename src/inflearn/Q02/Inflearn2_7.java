package inflearn.Q02;


import java.util.*;

public class Inflearn2_7 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/02-07
    // 내가 작성한 코드
    public static int solution(int[] arr) {
        int answer = 0;
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer += count;
                count++;
            } else {
                count = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(solution(arr));
    }
}
