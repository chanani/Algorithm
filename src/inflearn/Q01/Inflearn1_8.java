package inflearn.Q01;

import java.util.Scanner;

public class Inflearn1_8 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/01-07
    // 내가 작성한 코드
    /*public static String solution(String str){
        String answer = "NO";
        char[] arr = str.toCharArray();
        str = "";
        for (int i = 0; i < arr.length; i++) {
            if (Character.isAlphabetic(arr[i])) str += arr[i];
        }
        String result = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(result)) answer = "YES";
        System.out.println(str);
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(solution(str));
    }*/
    public static String solution(String str){
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String str2 = new StringBuilder(str).reverse().toString();
        if (str.equals(str2)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(solution(str));
    }
}
