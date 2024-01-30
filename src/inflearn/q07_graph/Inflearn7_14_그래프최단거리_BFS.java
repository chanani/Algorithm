package inflearn.q07_graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Inflearn7_14_그래프최단거리_BFS {

   /* static int[] ch;
    static int n, m;
    static Queue<Integer> Q;
    static int[][] graph;

    // 내가 구현한 코드
    public static void BFS(int v){
        Q = new LinkedList<>();
        int L = 0;
        Q.offer(v);
        while(!Q.isEmpty()){
            int size = Q.size();
            for (int i = 1; i <= size; i++) {
                int target = Q.poll();
                ch[target] = 1;
                for (int j = 1; j <= n; j++) {
                    if (ch[j] == 0 && graph[target][j] == 1){
                        int l = L + 1;
                        System.out.println(j + " : " + l);
                        ch[j] = 1;
                        Q.offer(j);
                    }
                }
            }
            L++;
        }
    }*/

    static int n, m = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    public static void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        queue.offer(v);
        while(!queue.isEmpty()){
            int cv = queue.poll();
            for(int nv : graph.get(cv)){
                if (ch[nv] == 0){
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n + 1];
        dis = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            graph.get(a).add(b);
        }
        BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }


}
