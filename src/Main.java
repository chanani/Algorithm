import java.util.*;
import java.io.*;

public class Main {
    static int[] visit = new int[1000000001];
    static int input, answer;
    static Queue<Integer> Q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        System.out.println(solution(5));
    }

    public static int solution(int n) {
        input = n;
        if (n == 0) return 0;
        answer = BFS(0);
        return answer;
    }

    public static int BFS(int v) {
        Q.offer(v);
        visit[v] = 1;
        while (!Q.isEmpty()) {
            int size = Q.size();
            for (int i = 0; i < size; i++) {
                int x = Q.poll();
                for (int j = 0; j < 2; j++) {
                    int nx;
                    if (j == 0) {
                        if (x == 0) continue;
                        nx = x * 2;
                        if (nx == input) return visit[x];
                        else {
                            if (visit[nx] == 0 && nx > 0 && nx <= 100000000) {
                                visit[nx] = 1;
                                Q.offer(nx);
                            }
                        }
                    } else {
                        nx = x + 1;
                        if (nx == input) return visit[x];
                        if (visit[nx] == 0 && nx > 0 && nx <= 100000000) {
                            visit[nx] = visit[x] + 1;
                            Q.offer(nx);
                        }
                    }

                }

            }
        }
        return 0;
    }
}