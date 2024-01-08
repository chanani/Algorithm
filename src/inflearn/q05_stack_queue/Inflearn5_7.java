package inflearn.q05_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Inflearn5_7 {
    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/05-07
    // 내가 작성한 코드
    /*public static String solution(String str1, String str2) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for(char x : str1.toCharArray()) queue.offer(x);
        for(char x : str2.toCharArray()){
            if (queue.contains(x)) {
                if (x == queue.peek()) queue.poll();
                else return "NO";
            }
        }
        if (queue.size() != 0) return "NO";
        return answer;
    }*/

    public static String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for(char x : need.toCharArray()) queue.offer(x);
        for(char x : plan.toCharArray()){
            if (queue.contains(x)){
                if (x != queue.poll()) return "NO";
            }
        }
        if (!queue.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();

        System.out.println(solution(str1, str2));
    }
}
