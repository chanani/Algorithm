package inflearn.Q03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Inflearn3_2 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/03-2
    // 내가 작성한 코드
    public static ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        while(i < n  && j < m){
            if (arr1[i] == arr2[j]){
                answer.add(arr1[i]);
                i++;
                j++;
            } else {
                if (arr1[i] > arr2[j]) j++;
                else i++;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scan.nextInt();
        }

        for(int x : solution(n, arr1, m, arr2)){
            System.out.print(x + " ");
        }
    }


}
