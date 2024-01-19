package inflearn.q06_sorting_and_searching;

import java.util.Scanner;

public class Inflearn6_2_버블정렬 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/06_2
    // 내가 작성한 코드
    public static int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                 int tmp = arr[j];
                 arr[j] = arr[j + 1];
                 arr[j + 1] = tmp;
                }
            }
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
