package inflearn.q07_graph;

import java.util.Scanner;

public class Inflearn7_2_이진수출력_재귀 {
    // 10진수를 2진수로 변환
    public static void DFS(int n) {
        if(n == 0) return;
        else {
            DFS(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        DFS(n);
    }
}
