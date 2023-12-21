package inflearn.q03_two_pointers_and_Sliding_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Inflearn3_6 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/03-6
    // 내가 작성한 코드
    public static int solution(int n, int m, int[] arr) {
        int answer = 0, count =0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) count++;
            while(count > m){
                if (arr[lt] == 0) count--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }




        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(solution(n, m, arr));

    }
}
