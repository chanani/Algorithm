package inflearn.Q02;

import java.util.*;

public class Inflearn2_10 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/02-10
    // 내가 작성한 코드
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx =  i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Inflearn2_10 main = new Inflearn2_10();
        int n = scan.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            arr[i][0] = scan.nextInt();
            for (int j = 0; j < n - 1; j++) {
                arr[i][j + 1] = scan.nextInt();
            }
        }

        System.out.println(main.solution(n, arr));
    }
}
