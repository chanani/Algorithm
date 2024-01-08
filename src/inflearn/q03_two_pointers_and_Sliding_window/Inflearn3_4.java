package inflearn.q03_two_pointers_and_Sliding_window;

import java.util.Scanner;

public class Inflearn3_4 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/03-4
    // 내가 작성한 코드
    public static int solution(int n, int m, int[] arr) {
        int answer = 0, sum = 0, lt = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) answer++;
            while(sum >= m){
                sum -= arr[lt++];
                if (sum == m) answer++;
            }

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
