package inflearn.Q02;

import java.util.ArrayList;
import java.util.Scanner;

public class Inflearn2_2 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/02-02
    // 내가 작성한 코드
    public static int solution(int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int height = arr[0];
        answer.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > height){
                answer.add(arr[i]);
                height = arr[i];
            }
        }

        return answer.size();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num ];
        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(solution(arr));
    }

}
