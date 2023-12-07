package inflearn.Q02;

import java.util.Scanner;

public class Inflearn2_5 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/02-05
    // 내가 작성한 코드
    /*public static int solution(int number){
        int answer = 0;
        int count = 0;
        for (int i = 2; i < number; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0)count++;
            }
            if (count == 0) answer++;
            count = 0;
        }
        return answer;
    }*/
//    public static int solution(int n){
//        int answer = 0;
//        int[] ch = new int[n+1];
//        for (int i = 2; i <= n; i++) {
//            if (ch[i]==0){
//                answer++;
//                for (int j = i; j <= n; j = j + i) {
//                    ch[j] = 1;
//                }
//            }
//        }
//
//        return answer;
//    }

    // 연습
    public static int solution(int n ){
        int answer = 0;

        int[] result = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (result[i] == 0){
                answer++;
                for (int j = i; j <= n; j = j + i) {
                    result[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(solution(number));
    }

}
