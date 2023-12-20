package inflearn.q01_string;

import java.util.ArrayList;
import java.util.Scanner;

public class Inflearn1_4 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/01-04
    // 내가 작성한 코드
    /*public static String[] solution(String[] arr){
        String[] answer = new String[arr.length];
        for(int i = 0; i < arr.length; i++){
            answer[i] = "";
            String[] str = arr[i].split("");
            for (int j = arr[i].length() - 1; j >= 0; j--) {answer[i] += str[j];}
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            String getString = scan.next();
            arr[i] = getString;
        }
        String[] answer = solution(arr);
        for(String result : answer){
            System.out.println(result);
        }
    }*/

    public static ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer= new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scan.next();
        }
        for(String result : solution(n, str)){
            System.out.println(result);
        }
    }

}
