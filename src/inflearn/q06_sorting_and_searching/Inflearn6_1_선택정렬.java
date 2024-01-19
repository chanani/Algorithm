package inflearn.q06_sorting_and_searching;

import java.util.Arrays;
import java.util.Scanner;

public class Inflearn6_1_선택정렬 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/06_1
    // 내가 작성한 코드
    public static int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
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
