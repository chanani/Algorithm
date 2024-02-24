package inflearn.q08_DFS_BFS;

import java.util.Scanner;

public class Inflearn8_6_순열구하기_DFS {
    static int[] pm, ch, arr;
    static int n, m;

    public static void DFS(int L) {
        if (L == m) {
            for(int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if(ch[i] == 0){
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L + 1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = scan.nextInt();
        ch = new int[n];
        pm = new int[m];
        DFS(0);
    }
}
