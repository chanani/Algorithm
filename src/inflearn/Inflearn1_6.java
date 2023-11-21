package inflearn;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Inflearn1_6 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/01-06
    // 내가 작성한 코드
    /*public static String solution(String str){
        String answer = "";
        Set<String> set = new HashSet<>();
        String[] arr = str.split("");
        for (int i = 0; i < str.length(); i++) {
            boolean bool = set.add(arr[i]);
            if (bool){
                answer += arr[i];
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
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i){
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }
}
