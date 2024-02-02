package inflearn.q02_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Inflearn2_6 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/02-06
    // 내가 작성한 코드
    /*public static ArrayList<Integer> solution(int[] numbers){
        ArrayList<Integer> answer = new ArrayList<>();
        int i = 0;
        for(int x : numbers){
            String t = String.valueOf(x);
            String temp = new StringBuilder(t).reverse().toString();
            boolean result = true;
            int j = 0;
            while (result){
                if (temp.length() < 2){
                    break;
                }
                if (temp.substring(j,j + 1).equals("0")){
                    temp = temp.substring(j + 1, temp.length());
                    j++;
                } else {
                    result = false;
                }
            }
            if (cal(Integer.parseInt(temp)) && Integer.parseInt(temp) != 1){
             answer.add(Integer.parseInt(temp));
            }
            i++;
        }
        return answer;
    }*/

    /*public static boolean cal(int num){
        boolean result = true;
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                count++;
            }
        }
        if (count != 0){
            result = false;
        }

        return result;
    }*/

    public static boolean isPrime(int num){
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while(tmp > 0){
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp/10;
            }
            if (isPrime(res)) answer.add(res);

        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for(int x : solution(n, arr)){
            System.out.print(x + " ");
        }
    }


}
