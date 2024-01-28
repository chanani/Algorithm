package inflearn.q07_graph;

import java.util.Scanner;

public class Inflearn7_1_재귀함수_스택프레임 {
    public static void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n - 1);
            System.out.print(n + " ");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        DFS(n);
    }
}
