import java.util.*;
import java.io.*;

public class Main {
    static int n, m, k, x;
    static int[][] arr;
    static boolean[] visit;
    static Queue<Integer> Q = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        k = scan.nextInt();
        x = scan.nextInt();
        arr = new int[n + 1][n + 1];
        visit = new boolean[n + 1];
        for (int i = 1; i <= m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            arr[a][b] = 1;
        }
        BFS(x);
        if (Q.size() == 0) {
            System.out.println(-1);
        } else {
            int[] result = new int[Q.size()];
            for (int i = 0; i <= Q.size(); i++) {
                result[i] = Q.poll();
            }
            Arrays.sort(result);
            for (int r : result) System.out.println(r);
        }

    }

    public static void BFS(int x) {
        Q.offer(x);
        visit[x] = true;
        int L = 0;
        while (!Q.isEmpty()) {
            int size = Q.size();
            for (int i = 0; i < size; i++) {
                int cx = Q.poll();
                for (int j = 1; j <= n; j++) {
                    if (arr[cx][j] == 1 && !visit[j]) {
                        visit[j] = true;
                        Q.offer(j);
                    }
                }
            }
            L++;
            if (L == k) return;
        }
    }
}