package inflearn;

import java.util.Scanner;

public class Inflearn1_1 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/01-01

    public static void main(String[] args) {

        int answer = 0;
        Scanner scan = new Scanner(System.in);

        String q = scan.next().toLowerCase();
        String r = scan.next().toLowerCase();
        String[] q2 = q.split("");

        for (int i = 0; i < q2.length; i++) {
            if (q2[i].equals(r)){
                answer++;
            }
        }

        System.out.println(answer);



    }
}
