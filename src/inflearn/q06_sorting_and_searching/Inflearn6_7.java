package inflearn.q06_sorting_and_searching;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{
    public int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}

public class Inflearn6_7 {
    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/06-6

    /*public static int[][] solution(int n, int[][] arr) {
        int[][] answer = arr;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j][0] > arr[j + 1][0]){
                    int tmp = arr[j][0];
                    int tmp2 = arr[j][1];
                    arr[j][0] = arr[j + 1][0];
                    arr[j][1] = arr[j + 1][1];
                    arr[j + 1][0] = tmp;
                    arr[j + 1][1] = tmp2;
                } else if (arr[j][0] == arr[j + 1][0] && arr[j][1] > arr[j + 1][1]){
                    int tmp = arr[j][0];
                    int tmp2 = arr[j][1];
                    arr[j][0] = arr[j + 1][0];
                    arr[j][1] = arr[j + 1][1];
                    arr[j + 1][0] = tmp;
                    arr[j + 1][1] = tmp2;
                }
            }
        }


        return answer;
    }*/



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Point>  arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            arr.add(new Point(x, y));
        }

        Collections.sort(arr);
        for(Point o : arr) System.out.println(o.x + " " + o.y);
    }


}
