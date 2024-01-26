package inflearn.q06_sorting_and_searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Inflearn6_6 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/06-6
    /*public static int[] solution(int n, int[] arr) {
        int[] answer = new int[2];
        int[] result = Arrays.copyOf(arr, n);
        Arrays.sort(result);
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != result[i]) {
                answer[j] = i + 1;
                j++;
            }
        }
        return answer;
    }*/

    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for (int i = 0; i < n; i++) {
            if(arr[i] != tmp[i]) answer.add(i + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scan.nextInt();
        for(int x : solution(n, arr)) System.out.print(x + " ");
    }

}
