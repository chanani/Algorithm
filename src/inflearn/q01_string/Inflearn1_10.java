package inflearn.q01_string;

import java.util.Scanner;

public class Inflearn1_10 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/01-10
    // 내가 작성한 코드

    /*public static String solution(String s, String e) {
        String answer = "";
        String[] arr = s.split("");
        int[] eIndex = new int[s.replaceAll("[^!" + e + "]", "").length()];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(e)){
                eIndex[j] = i;
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int minIndex = 300;
            for (int k = 0; k < eIndex.length; k++) {
                if (!arr[i].equals(s) && minIndex > Math.abs(i - eIndex[k])){
                    minIndex = Math.abs(eIndex[k] - i);
                } else if (arr[i].equals(s)){
                    minIndex = 0;
                }
            }
            if (i != arr.length - 1) answer += String.valueOf(minIndex) + " ";
            else answer += String.valueOf(minIndex);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String e = scan.next();
        System.out.println(solution(s, e));
    }
    */

    public static int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t){ // 왼쪽에서부터 떨어진 거리
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p = 100;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t){ // 오른쪽에서 부터 떨어진 거리
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p); // 두 수를 비교해서 작은 수로 초기화
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);
        for(int x : solution(str, c)){
            System.out.println(x + " ");
        }
    }

}
