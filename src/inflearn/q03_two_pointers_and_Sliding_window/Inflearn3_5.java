package inflearn.q03_two_pointers_and_Sliding_window;

import java.util.Scanner;

public class Inflearn3_5 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/03-05
    // 내가 작성한 코드
    /*public static int solution(int n){
        int answer = 0, sum = 0;
        for (int i = 1; i <= Math.ceil((double) n / 2); i++) {
            int point = i + 1;
            sum += i;
            while(sum < n){
                sum += point;
                point++;
            }
            if (sum == n)answer++;
            sum = 0;
        }
        return answer;
    }*/
    public static int solution(int n){
        int answer = 0, sum =0, lt = 0;
        int m = n / 2 + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) arr[i] = i + 1;
        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) answer++;
            while(sum >= n){
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(solution(n));
    }
}
