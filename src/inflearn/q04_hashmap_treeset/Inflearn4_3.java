package inflearn.q04_hashmap_treeset;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Inflearn4_3 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/04-3
    // 내가 작성한 코드
    public static int[] solution(int n, int m, int[] arr) {
        int[] answer = new int[m];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <= n - m; i++) {
            for (int j = 0; j < m; j++) {
                set.add(arr[j + i]);
            }
            answer[i] = set.size();
            set.clear();
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for(int x : solution(n, m, arr)){
            System.out.print(x +  " ");
        }
    }
}
