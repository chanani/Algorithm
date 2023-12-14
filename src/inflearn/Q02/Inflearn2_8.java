package inflearn.Q02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Inflearn2_8 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/02-08
    // 내가 작성한 코드
    public static int[] solution(int[] arr){
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) count++;
            }
            answer[i] = count;
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

        for(int x : solution(arr)){
            System.out.print(x + " ");
        }
    }

}
