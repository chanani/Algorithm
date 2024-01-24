package inflearn.q06_sorting_and_searching;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Inflearn6_4_LRU {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/06-4

    /*public static int[] solution(int n, int k, int[] arr) {
        int[] answer = new int[n];

        for (int i = 0; i < k; i++) {
            boolean check = true;
            int index = 0;
            for (int j = 0; j < n; j++) {
                if (answer[j] == arr[i]) {
                    check = false;
                    index = j;
                }
            }
            if (check) {
                for (int j = n - 1; j > 0; j--) answer[j] = answer[j - 1];
                answer[0] = arr[i];
            } else {
                for (int j = index; j > 0; j--) answer[j] = answer[j - 1];
                answer[0] = arr[i];
            }
        }
        return answer;
    }*/

    public static int[] solution(int size, int k, int[] arr) {
        int[] cache = new int[size];
        for(int x : arr){
            int pos = -1;
            for (int i = 0; i < size; i++) if(x == cache[i]) pos = i;
            if (pos == -1){
                for (int i = size - 1; i >= 1 ; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            } else {
                for (int i = pos; i >= 1 ; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            }
        }

        return cache;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[k]; // 전체목록

        for (int i = 0; i < k; i++) arr[i] = scan.nextInt();

        for (int x : solution(n, k, arr)) System.out.print(x + " ");
    }
}
