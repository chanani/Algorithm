package inflearn;

import java.util.Scanner;

public class Inflearn1_9 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/01-09
    // 내가 작성한 코드
   /* public static long solution(String str){
        long answer = 0;
        String number = str.replaceAll("[^0-9]", "");

        if (number.length() != 0) {
            while (number.substring(0, 1).equals("0")) {
                number = number.substring(1, number.length());
            }
        }
        answer = Long.parseLong(number);
        return answer;
    }
    */

    public static long solution(String str){
        long answer = 0;
        for(char x : str.toCharArray()){
            if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
            // if(Character.isDigit(x)) answer += x; // isDigit = 숫자일 경우 true, String 누적
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }

}
