package inflearn.q05_stack_queue;

import java.util.*;

public class Inflearn5_2 {
    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/05-02
    // 내가 작성한 코드

    public static String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if (x == ')'){
                while(stack.pop() != '(');
            } else stack.push(x);
        }
        for (int i = 0; i < stack.size(); i++) answer += stack.get(i);


        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution(str));
    }
}
