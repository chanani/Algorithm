package inflearn.q07_graph;

import java.util.Scanner;

public class Inflearn7_12_경로탐색_인접행렬_DFS {

    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;

    public static void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0){
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        DFS(1);
        System.out.println(answer);
    }
}
