package inflearn.q07_graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class Inflearn7_8_상태트리탐색_BFS {
    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/07-08
    static int answer = 0;
    static int[] dis = {1, -1, 5}; // 이동 배열
    static int[] ch; // 체크 배열
    static Queue<Integer> Q = new LinkedList<>();

    public static int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                if (x == e) return L;
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0){
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int e = scan.nextInt();
        System.out.println(BFS(s, e));
    }
}
