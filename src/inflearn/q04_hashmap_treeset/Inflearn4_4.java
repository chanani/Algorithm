package inflearn.q04_hashmap_treeset;

import java.util.HashMap;
import java.util.Scanner;

public class Inflearn4_4 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/04-3
    // 내가 작성한 코드
    /*public static int solution(String S, String T) {
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        String str = S.substring(0, 2);
        int i = 0;
        for(char x : T.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
            i++;
        }

        //System.out.println(str);
        String[] arr = S.split("");
        for (int j = T.length() - 1; j < S.length(); j++) {
            boolean result = true;
            str += arr[j];
            for(char x : str.toCharArray()){
                if (!map.containsKey(x)) result = false;
            }
            str = str.substring(1, T.length());
            if (result) answer++;
        }

        return answer;
    }*/

    public static int solution(String a, String b) {
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        for(char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0) + 1);
        int L = b.length()- 1;
        for (int i = 0; i < L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
        int lt = 0;
        for (int rt = L; rt < a.length(); rt++) {
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
            if (am.equals(bm)) answer++;
            am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
            if (am.get(a.charAt(lt)) == 0) am.remove(a.charAt(lt));
            lt++;
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
