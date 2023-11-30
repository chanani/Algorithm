package inflearn.Q01;


import java.util.*;

public class Inflearn1_1 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/01-01
    // 내가 작성한 코드
    /*public static void main(String[] args) {
        int answer = 0;
        Scanner scan = new Scanner(System.in);
        String q = scan.next().toLowerCase();
        String r = scan.next().toLowerCase();
        String[] q2 = q.split("");
        for (int i = 0; i < q2.length; i++) {
            if (q2[i].equals(r)){
                answer++;
            }
        }
        System.out.println(answer);
    }*/

    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        // index 접근
        /*for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) answer++;
        }*/
        // str.toCharArray() : 문자 하나 하나가 배열로 생성됨
        for(char x : str.toCharArray()){
            if (x == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Inflearn1_1 T = new Inflearn1_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(T.solution(str, c));
    }
}
