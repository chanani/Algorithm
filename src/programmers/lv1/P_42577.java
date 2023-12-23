package programmers.lv1;

public class P_42577 {

    // 문제 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42577

    public static boolean solution(String[] phone_book){
        boolean answer = true;

        for (int i = 1; i < phone_book.length; i++) {
            if (phone_book[i].substring(0, phone_book[0].length()).equals(phone_book[0])) return false;
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] arr = {"119", "97674223", "1195524421"};
        System.out.println(solution(arr));
    }
}

