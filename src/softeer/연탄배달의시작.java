package softeer;

import java.util.Scanner;

public class 연탄배달의시작 {
    // 문제 링크 : https://softeer.ai/practice/7626

    public static void main(String[] args) {
        int answer = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = scan.nextInt();
        int min = 1000000;
        for(int i = 0; i < n - 1; i++){
            int m = Math.abs(arr[i] - arr[i + 1]);
            if(min > m) min = m;
        }

        for(int i = 0; i < n - 1; i++){
            int m = Math.abs(arr[i] - arr[i + 1]);
            if(min >= m) answer++;
        }
        System.out.println(answer);

    }

}
