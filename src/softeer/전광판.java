package softeer;

import java.util.Scanner;

public class 전광판 {
    // 문제 링크 : https://softeer.ai/practice/6268
    // 구현은 했는데 코드가 너무 지저분하다....
    static int[][] arr = {
            {1, 1, 1, 0, 1, 1, 1}, // 0
            {0, 0, 1, 0, 0, 1, 0}, // 1
            {1, 0, 1, 1, 1, 0, 1}, // 2
            {1, 0, 1, 1, 0, 1, 1}, // 3
            {0, 1, 1, 1, 0, 1, 0}, // 4
            {1, 1, 0, 1, 0, 1, 1}, // 5
            {1, 1, 0, 1, 1, 1, 1}, // 6
            {1, 1, 1, 0, 0, 1, 0}, // 7
            {1, 1, 1, 1, 1, 1, 1}, // 8
            {1, 1, 1, 1, 0, 1, 1} // 9
    };

    public static void main(String[] args) {
        int answer = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            String a = scan.next();
            String b = scan.next();
            int alen = a.length();
            int blen = b.length();
            if (a.length() < 5) {
                for (int x = 0; x < 5 - alen; x++) a = " " + a;
            }
            if (b.length() < 5) {
                for (int x = 0; x < 5 - blen; x++) b = " " + b;
            }
            System.out.println("a : " + a);
            System.out.println("b : " + b);
            for (int j = 0; j < 5; j++) {
                String sa = a.substring(j, j + 1);
                String sb = b.substring(j, j + 1);
                if (sa.equals(" ") && sb.equals(" ")){
                    continue;
                } else {
                    answer += check(sa, sb);
                }
            }
            System.out.println(answer);
            answer = 0;
        }

    }

    public static int check(String a, String b) {
        int count = 0;
        if (a.equals(" ") || b.equals(" ")) {
            if (a.equals(" ")){
                for (int i = 0; i < 7; i++) {
                    int ib = Integer.parseInt(b);
                    if (arr[ib][i] == 1) count++;
                }
            } else if (b.equals(" ")){
                for (int i = 0; i < 7; i++) {
                    int ia = Integer.parseInt(a);
                    if (arr[ia][i] == 1) count++;
                }
            }
        } else {
            for (int i = 0; i < 7; i++) {
                int ia = Integer.parseInt(a);
                int ib = Integer.parseInt(b);
                if (arr[ia][i] != arr[ib][i]) count++;
            }
        }

        return count;
    }
}
