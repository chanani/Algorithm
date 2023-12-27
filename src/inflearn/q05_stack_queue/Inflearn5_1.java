package inflearn.q05_stack_queue;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class Inflearn5_1 {
    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/05-01
    // 내가 작성한 코드
    /*public static String solution(String str) {
        String answer = "NO";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if (stack.size() == 0){
                stack.push(x);
            } else if (stack.peek() != x){
                stack.pop();
            } else if (stack.peek() == x){
                stack.push(x);
            }

        }
        if (stack.size() == 0) answer = "YES";

        return answer;
    }*/
    public static String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(solution(str));
    }
}
