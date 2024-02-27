import java.util.*;
public class Main{
    static int[] mx = {-1,-1,-1,0,0,1,1,1};
    static int[] my = {-1,0,1,-1,1,-1,0,1};
    static int[][] arr;
    static boolean[][] visit;
    static boolean[][] top;
    static int n, m, answer;
    static Queue<int[]> Q = new LinkedList<>();
    public static void BFS(int x, int y){
        visit[x][y] = true;
        Q.offer(new int[]{x, y});
        ArrayList<int[]> topList = new ArrayList<>();
        while(!Q.isEmpty()){
            int[] ca = Q.poll();
            for(int i = 0; i < 8; i++){
                int nx = ca[0] + mx[i];
                int ny = ca[1] + my[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && !visit[nx][ny]){
                    if(arr[nx][ny] > arr[ca[0]][ca[1]]) return;
                    else if(arr[nx][ny] == arr[ca[0]][ca[1]]){
                        Q.offer(new int[]{nx, ny});
                        topList.add(new int[]{nx, ny});
                    }
                    visit[nx][ny] = true;
                }
            }
        }
        for(int i = 0; i < topList.size(); i++){
            int[] ca = topList.get(i);
            top[ca[0]][ca[1]] = true;
        }

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        arr = new int[n][m];
        visit = new boolean[n][m];
        top = new boolean[n][m];
        int answer = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] != 0 && !visit[i][j]){
                    answer++;
                    BFS(i, j);
                }
            }
        }

        System.out.println(answer);

    }
}