package inflearn.q01_string;

import java.util.Scanner;

public class Inflearn1_12 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/01-12
    // 내가 작성한 코드
    public static String solution(String str[]){
        String answer = "";
        int[] numbers = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            numbers[i] += Integer.valueOf(str[i], 2);
            char temp = (char) numbers[i];
            answer += temp;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();;
        String str = scan.next().replaceAll("#","1").replaceAll("\\*", "0");
        String[] arr = new String[number];
        for (int i = 0; i < number; i++) {
            arr[i] =  str.substring(0, 7);
            str = str.substring(7 , str.length());
        }
        System.out.println(solution(arr));
    }


}
