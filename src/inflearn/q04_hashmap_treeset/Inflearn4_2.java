package inflearn.q04_hashmap_treeset;

import java.util.HashMap;
import java.util.Scanner;

public class Inflearn4_2 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/04-2
    // 내가 작성한 코드
    /*public static String solution(String s1, String s2) {
        String answer = "YES";
        String[] arr1 = s1.split("");
        String[] arr2 = s2.split("");
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map1.put(arr1[i], map1.getOrDefault(arr1[i], 0) + 1);
            map2.put(arr2[i], map2.getOrDefault(arr2[i], 0) + 1);
        }

        for(String x : map1.keySet()){
            if (map1.get(x) != map2.get(x)){
                answer = "NO";
            }
        }


        return answer;
    }*/

    public static String solution(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s1.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for(char x : s2.toCharArray()){
            if (!map.containsKey(x) || map.get(x) == 0) return "NO";
            map.put(x, map.get(x) - 1);
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        System.out.println(solution(str1, str2));
    }
}
