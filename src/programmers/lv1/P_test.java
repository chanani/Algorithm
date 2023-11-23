package programmers.lv1;

import java.util.*;

public class P_test {

    public static void main(String[] args) {

        String answer = "";
        Map<String, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        map.put("맹", "찬");
        set.add("맹구");
        set.add("짱구");
        set.add("유리");
        set.add("철수");
        set.add("훈이");
        stack.push(1);
        stack.push(2);
        stack.pop();
        queue.add(3);
        queue.add(4);

        System.out.println("stack : " + stack.toString());
        System.out.println("stack.peek() : " + stack.peek());
        System.out.println("queue : " + queue.toString());
        System.out.println("queue.peek() : " + queue.peek());
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            System.out.println("set 목록 : " + iter.next());
        }




        // if (map.get("맹") == "찬") answer = map.get("맹");

        System.out.println(answer);



    }
}
