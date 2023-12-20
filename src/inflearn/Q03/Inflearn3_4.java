package inflearn.Q03;

import java.util.Scanner;

public class Inflearn3_4 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/03-4
    // 내가 작성한 코드
    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int x = 0;
            while (sum < m) {
                sum += arr[i + x];
                if (sum == m){
                    answer++;
                    break;
                } else if (sum > m ) break;
                x++;
            }
            sum = sum - arr[i]
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
