package inflearn.q05_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Inflearn5_5 {
    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/05-05
    // 내가 작성한 코드
    /*public static int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x == '(') stack.push(x);
            else if (stack.peek() == '(' && x == ')'){
                stack.pop();
                answer += stack.size();
            } else if (stack.peek() != '(' && x == ')'){
                stack.pop();
                answer += 1;
            }
        }

        return answer;
    }*/

    public static int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') stack.push('(');
            else {
                stack.pop();
                if (str.charAt(i - 1) == '(') answer += stack.size();
                else answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(solution(str));
    }
}
