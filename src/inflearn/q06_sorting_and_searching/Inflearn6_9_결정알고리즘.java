package inflearn.q06_sorting_and_searching;

import java.util.Arrays;
import java.util.Scanner;

public class Inflearn6_9_결정알고리즘 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/06-9

    public static int count(int[] arr, int capacity){
        int cnt = 1, sum = 0;
        for(int x : arr){
            // sum의 누적값이 용량을 초과할 경우 새로운 DVD를 1장 더 만들고 용량 초기화
            if (sum + x > capacity){
                cnt++;
                sum = x;
            }
            else sum += x;
        }

        return cnt;
    }

    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        // lt를 배열의 최댓값으로 초기화
        int lt = Arrays.stream(arr).max().getAsInt();
        // rt를 배열의 총 합으로 초기화
        int rt = Arrays.stream(arr).sum();
        while(lt <= rt){
            int mid = (lt + rt) / 2; // DVD 한장의 용량
            // DVD의 장수가 m 값이 넘지 않을 때 answer을 mid로 초기화
            if(count(arr, mid) <= m){
                answer = mid;
                rt = mid - 1;
            } else lt = mid + 1;
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scan.nextInt();
        System.out.println(solution(n, m, arr));
    }
}
