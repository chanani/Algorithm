package inflearn.q06_sorting_and_searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Inflearn6_8_이분검색 {
    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/06-8

    /*public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] == m) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }*/
    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0, rt = n-1;
        while(lt <= rt){
            int mid = (lt + rt) / 2;
            if (arr[mid] == m){
                answer = mid + 1;
                break;
            }
            if (arr[mid] > m) rt = mid - 1;
            else lt = mid + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scan.nextInt();
        System.out.println(solution(n, m, arr));
    }
}
