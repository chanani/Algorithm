package inflearn.q01_string;

import java.util.Scanner;

public class Inflearn1_7 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/01-07
    // 내가 작성한 코드
    /*public static String solution(String str){
        String answer = "";
        String[] arr = str.toUpperCase().split("");
        boolean bool = true;
        int lt = 0, rt = arr.length - 1;
        while(lt < rt){
            if (!arr[lt].equals(arr[rt]))bool = false;
            lt++;
            rt--;
        }
        if (bool)answer = "YES";
        else answer = "NO";
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }*/
    public static String solution(String str){
        String answer = "YES";
        /*str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) return "NO";
        }*/
        String tmp = new StringBuilder(str).reverse().toString();
        if (!str.equalsIgnoreCase(tmp)) answer = "NO";
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }
}
