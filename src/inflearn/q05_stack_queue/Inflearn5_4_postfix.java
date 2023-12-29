package inflearn.q05_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Inflearn5_4_postfix {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/05-03
    // 내가 작성한 코드
    public static int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) stack.push(x - 48);
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') stack.push(lt + rt);
                else if (x == '-') stack.push(lt - rt);
                else if (x == '*') stack.push(lt * rt);
                else if (x == '/') stack.push(lt / rt);
            }
        }
        answer = stack.get(0);

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(solution(str));
    }
}
