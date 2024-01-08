package inflearn.q05_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Inflearn5_6 {
    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/05-06
    // 내가 작성한 코드
    public static int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while(queue.size() != 1){
            for (int i = 0; i < k - 1; i++) queue.offer(queue.poll());
        }
        answer = queue.poll();
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int list = scan.nextInt();
        int number = scan.nextInt();

        System.out.println(solution(list, number));
    }
}
