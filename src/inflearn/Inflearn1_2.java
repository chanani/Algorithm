package inflearn;

import java.util.Scanner;

public class Inflearn1_2 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/01-02
    // 내가 작성한 코드
   /* public static String solution(String str){
        String answer = "";
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                answer += Character.toUpperCase(str.charAt(i));
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                answer += Character.toLowerCase(str.charAt(i));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }*/

    public static String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
//            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
//            else answer += Character.toLowerCase(x);
        // 아스키코드 이용
            if (x >= 65 && x <= 90) answer += (char)(x+32);
            else answer += (char)(x-32);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }
}
