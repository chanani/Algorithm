package programmers.lv2;

import java.util.Stack;

public class P_12909 {
    // 문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12909

    public static boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else {
                if (stack.contains('(')) {
                    stack.pop();
                } else return false;
            }
        }
        if (!stack.isEmpty()) return false;
        return answer;
    }

    public static void main(String[] args) {
        String s = "(()(";
        System.out.println(solution(s));
    }

}
