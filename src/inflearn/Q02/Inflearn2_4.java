package inflearn.Q02;

import java.util.Scanner;

public class Inflearn2_4 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/02-04
    // 내가 작성한 코드
    public static int[] solution(int number){
        int[] answer = new int[number];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < number; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for(int x : solution(number)){
            System.out.print(x + " ");
        }
    }

}
