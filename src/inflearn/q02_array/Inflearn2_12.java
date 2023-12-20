package inflearn.q02_array;

import java.util.Scanner;

public class Inflearn2_12 {
    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/02-12
    public static int solution(int student, int test, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= student; i++) {
            for (int j = 1; j <= student; j++) {
                int count = 0;
                for (int k = 0; k < test; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < student; s++) {
                        if (arr[k][s] == i) pi = s;
                        if (arr[k][s] == j) pj = s;
                    }
                    if (pi < pj) count++;
                }
                if (count == test) answer++;
            }

        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int student = scan.nextInt();
        int test = scan.nextInt();
        int[][] arr = new int[test][student];
        for (int i = 0; i < test; i++) {
            for (int j = 0; j < student; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println(solution(student, test, arr));


    }
}
