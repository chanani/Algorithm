package inflearn.q01_string;

import java.util.*;

public class Inflearn1_11 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/01-11
    // 내가 작성한 코드
    /*public static String solution(String str) {
        String answer = "";
        String[] arr = str.split("");
        int count = 1;
        int i = 0;
        while(i < str.length() - 1){
            if (arr[i].equals(arr[i + 1])){ // 다음 문자와 같을 때 count 증가
                count++;
            } else if (!arr[i].equals(arr[i + 1])){
                if (count == 1){
                    answer += arr[i];
                } else if (count != 1){
                    answer += arr[i] + String.valueOf(count);
                    count = 1;
                }
            }
            i++;
        }
        for (int j = 0; j < 2; j++) {
            String last = answer.substring(answer.length() - 1).replaceAll("[0-9]", "");

            if (last.equals("")){
                answer += arr[arr.length - 1];
            } else if (!last.equals("")){
                if (!last.equals(arr[arr.length - 1])){
                    answer.replace((char) (answer.length() - 1), (char) Integer.parseInt(answer.substring(answer.length() - 1)));
                } else {
                    answer += 2;
                }
            }
        }

        return answer;
    }*/

    public static String solution(String s) {
        String answer = "";
        s = s + " ";
        int cnt = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) cnt++;
            else {
                answer += s.charAt(i);
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
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
