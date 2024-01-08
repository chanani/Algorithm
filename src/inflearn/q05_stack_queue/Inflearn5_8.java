package inflearn.q05_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Inflearn5_8 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/05-07
    // 내가 작성한 코드


    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Character> queue = new LinkedList<>();

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

        System.out.println(solution(n, m, arr));
    }

}
