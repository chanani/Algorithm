package inflearn.q03_two_pointers_and_Sliding_window;

import java.util.ArrayList;
import java.util.Scanner;

public class Inflearn3_1 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/03-1
    // 내가 작성한 코드
   /* public static ArrayList<Integer> solution(int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            answer.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            answer.add(arr2[i]);
        }
        Collections.sort(answer);

        return answer;
    }*/
    public static ArrayList<Integer> solution(int n1, int n2, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while(p1 < n1 && p2 < n2){
            if (arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
            else answer.add(arr2[p2++]);
        }
        while(p1< n1) answer.add(arr1[p1++]);
        while(p2< n2) answer.add(arr2[p2++]);

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scan.nextInt();
        }
        int n2 = scan.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scan.nextInt();
        }

        for(int x : solution(n1, n2, arr1, arr2)){
            System.out.print(x + " ");
        }
    }

}
