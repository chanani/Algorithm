package inflearn.q06_sorting_and_searching;

import java.util.Scanner;

public class Inflearn6_3_삽입정렬 {
    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/06_3

    public static int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0 ; j--) {
                if (arr[j] > tmp) arr[j + 1] = arr[j];
                else break;
            }
            arr[j + 1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scan.nextInt();
        for (int x : solution(n, arr)) System.out.print(x + " ");
    }
}
