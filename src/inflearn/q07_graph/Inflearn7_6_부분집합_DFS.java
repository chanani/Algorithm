package inflearn.q07_graph;

import java.util.Scanner;

public class Inflearn7_6_부분집합_DFS {

    static int n;
    static int[] ch;

    public static void DFS(int L){
        if (L == n + 1){
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                 if (ch[i] == 1) tmp += i + " ";
            }
            if (tmp.length() > 0) System.out.println(tmp);
        } else{
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        ch = new int[n + 1];
        DFS(1);
    }
}
