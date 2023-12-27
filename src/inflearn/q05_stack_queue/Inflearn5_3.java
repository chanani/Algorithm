package inflearn.q05_stack_queue;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Inflearn5_3 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/05-03
    // 내가 작성한 코드
    /*public static int solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < m; i++) {
            int target = 0;
            for (int j = 0; j < n; j++) {

                if (board[j][moves[i] - 1] != 0) {
                    target = board[j][moves[i] - 1];
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
            if (!stack.isEmpty()){
                if (stack.peek() == target){
                    stack.pop();
                    answer += 2;
                } else {
                    stack.push(target);
                }
            } else {
                stack.push(target);
            }

        }

        return answer;
    }*/

    public static int solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int pos : moves){
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos - 1] != 0){
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()){
                        answer += 2;
                        stack.pop();
                    } else stack.push(tmp);
                    break;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scan.nextInt();
            }
        }
        int m = scan.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = scan.nextInt();
        }
        System.out.println(solution(n, board, m, moves));
    }

}
