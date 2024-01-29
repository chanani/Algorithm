package inflearn.q07_graph;

import java.util.Scanner;

public class Inflearn7_4_피보나치재귀_메모이제이션 {
    static int[] fibo;

    /*public static int DFS(int n) {
        if(n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = DFS(n - 2) + DFS(n - 1);
    }*/

    public static int DFS(int n) {
        if (fibo[n] > 0) return fibo[n];
        if(n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = DFS(n - 2) + DFS(n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        fibo = new int[n + 1];
        DFS(n);
        for (int i = 1; i <= n; i++) System.out.print(fibo[i] + " ");
    }
}
