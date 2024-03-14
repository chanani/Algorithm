package inflearn.q08_DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Inflearn8_14_섬나라아일랜드_BFS {

    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static Queue<Point> Q = new LinkedList<>();

    static int n, answer = 0;

    public static void BFS(int x, int y, int[][] board) {
       Q.add(new Point(x, y));
       while(!Q.isEmpty()){
           Point pos = Q.poll();
           for (int i = 0; i < 8; i++) {
               int nx = pos.x + dx[i];
               int ny = pos.y + dy[i];
               if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1){
                   board[nx][ny] = 0;
                   Q.add(new Point(nx, ny));
               }
           }
       }
    }

    public static void solution(int[][] board){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 1){
                    answer++;
                    board[i][j] = 0;
                    BFS(i, j, board);
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int[][]arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        solution(arr);
        System.out.println(answer);

    }


}
