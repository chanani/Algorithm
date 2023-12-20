package inflearn.q02_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Inflearn2_1 {
    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/02-01
    // 내가 작성한 코드
    /*public static String solution(int numbers[]){
        String answer = String.valueOf(numbers[0]) + " ";
        for (int i = 1; i <= numbers.length - 1; i++) {
            if (numbers[i - 1] < numbers[i]){
                answer += numbers[i] + " ";
            }
        }
        return answer;
    }*/

    public static ArrayList<Integer> solution(int[] numbers){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) answer.add(numbers[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] numbers = new int[num + 1];
        for (int i = 0; i < num; i++) {
            numbers[i] = scan.nextInt();
        }
        for(int x : solution(numbers)){
            System.out.println(x + " ");
        }
    }


}
