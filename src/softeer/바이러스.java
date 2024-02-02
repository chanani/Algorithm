package softeer;

import java.util.Scanner;

public class 바이러스 {
    // 문제 링크 : https://softeer.ai/practice/6284

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int p = scan.nextInt();
        int n = scan.nextInt();
        long answer = k;
        for (int i = 1; i <= n; i++) {
            answer = (answer * p) % 1000000007;
        }
        System.out.println(answer);
    }
}

