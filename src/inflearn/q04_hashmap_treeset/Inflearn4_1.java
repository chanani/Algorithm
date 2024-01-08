package inflearn.q04_hashmap_treeset;

import java.util.HashMap;
import java.util.Scanner;

public class Inflearn4_1 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/04-1
    // 내가 작성한 코드
    public static char solution(int n, String str) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : str.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        // map안에 key가 존재하는지 확인하는 방법 boolean으로 반환

        System.out.println(map.containsKey('A'));
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            if (map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();

        System.out.println(solution(n, str));

    }
}
