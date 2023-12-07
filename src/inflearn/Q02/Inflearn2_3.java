package inflearn.Q02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Inflearn2_3 {
    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/02-03
    // 내가 작성한 코드
    public static String[] solution(int[] me, int[] you){
        String[] answer = new String[me.length];
        for (int i = 0; i < me.length; i++) {
            answer[i] = cal(me[i], you[i]);
        }
        return answer;
    }

    public static String cal(int me, int you){
        String answer = "";
        if (me == you){
            answer = "D";
        } else if ((me == 1 && you == 2) || (me == 2 && you == 3) || (me == 3 && you == 1)){
            answer = "B";
        } else if ((me == 2 && you == 1) || (me == 3 && you == 2) || (me == 1 && you == 3)){
            answer = "A";
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] me = new int[num];
        int[] you = new int[num];

        boolean reset = true;
        for (int i = 0; i < num; i++) {
            if (reset){
                me[i] = scan.nextInt();
                if (i == num - 1) {
                    reset = false;
                    i = -1;
                }
            } else {
                you[i] = scan.nextInt();
            }
        }
        for(String x : solution(me, you)){
            System.out.println(x);
        }
    }
}
