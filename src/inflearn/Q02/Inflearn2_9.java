package inflearn.Q02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Inflearn2_9 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/02-09
    // 내가 작성한 코드
    /*public static int solution(int n, int[][] arr){
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
            if (answer < sum){
                answer = sum;
            }
            sum = 0;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[j][i];
            }
            if (answer < sum){
                answer = sum;
            }
            sum = 0;
        }

        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
        }
        if (answer < sum){
            answer = sum;
        }
        sum = 0;

        for (int i = n - 1; i >= 0; i--) {
            sum += arr[i][i];
        }
        if (answer < sum){
            answer = sum;
        }


        return answer;
    }
*/
    public static int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;

        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }

        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            arr[i][0] = scan.nextInt();
            for (int j = 0; j < n - 1; j++) {
                arr[i][j + 1] = scan.nextInt();
            }
        }


        System.out.println(solution(n, arr));
    }

}
