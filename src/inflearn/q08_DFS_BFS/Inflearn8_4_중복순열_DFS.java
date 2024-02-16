package inflearn.q08_DFS_BFS;

import java.util.Scanner;

public class Inflearn8_4_중복순열_DFS {
    static int[] pm;
    static int n, m;
    public static void DFS(int L){
        if (L == m) {
            for(int x : pm) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1);
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        pm = new int[m];
        DFS(0);
    }


}
