package inflearn.Q03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Inflearn3_1 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/02-11
    // 내가 작성한 코드
    public static ArrayList<Integer> solution(int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            answer.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            answer.add(arr2[i]);
        }
        Collections.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scan.nextInt();
        }
        int n2 = scan.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scan.nextInt();
        }

        for(int x : solution(arr1, arr2)){
            System.out.print(x + " ");
        }
    }

}
