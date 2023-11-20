package inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class Inflearn1_5 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/01-05
    // 내가 작성한 코드
    public static String solution(String str){
        String answer = "";
        char[] arr = str.toCharArray();
        int lt = 0, rt = arr.length - 1;

        while(lt < rt){
            if (!Character.isAlphabetic(arr[lt])){
                lt++;
            } else if(!Character.isAlphabetic(arr[rt])){
                rt--;
            } else {
                char temp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(arr);
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(solution(str));
    }
}
