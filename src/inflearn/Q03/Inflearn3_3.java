package inflearn.Q03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Inflearn3_3 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/03-3
    // 내가 작성한 코드
    /*public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }
        answer = sum;
        int k = 0;
        for (int i = m; i < n; i++) {
            sum = sum + arr[i] - arr[k];
            k++;
            if (answer < sum) answer = sum;
        }

        return answer;
    }*/

    public static int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) sum += arr[i];
        answer = sum;
        for(int i = k; i < n; i++){
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(solution(n, k, arr));
    }
}
