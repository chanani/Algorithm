package inflearn;

import java.util.*;

public class Inflearn1_3 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/01-03
    // 내가 작성한 코드
    /*public static String solution(String str){
        String answer = "";
        String[] arr = str.split( " ");
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (answer.length() < arr[i].length()){
                answer = arr[i];
                count = 1;
            } else if (answer.length() == arr[i].length()){
                count++;
            }
        }
        if (count == 2) answer = arr[0];
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(solution(str));
    }*/

    public static String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos; // 가장 작은 값으로 초기화
        /*String[] s = str.split(" ");
        for(String x : s){
            int len = x.length();
            if (len > m){
                m = len;
                answer = x;
            }
        }*/
        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > m) answer = str;

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(solution(str));
    }


}
