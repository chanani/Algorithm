package inflearn.q04_hashmap_treeset;

import java.util.*;

public class Inflearn4_3 {

    // 문제 링크 : https://cote.inflearn.com/contest/10/problem/04-3
    // 내가 작성한 코드
    /*public static int[] solution(int n, int m, int[] arr) {
        int[] answer = new int[m];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <= n - m; i++) {
            for (int j = 0; j < m; j++) {
                set.add(arr[j + i]);
            }
            answer[i] = set.size();
            set.clear();
        }

        return answer;
    }*/

    public static ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();

        for (int i = 0; i < k - 1; i++) { // 만약 4일씩 구한다고하면 미리 3일을 Map에 추가해 놓기
            HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);
            answer.add(HM.size());
            HM.put(arr[lt], HM.get(arr[lt]) - 1);
            if (HM.get(arr[lt]) == 0) HM.remove(arr[lt]);
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int x : solution(n, m, arr)) {
            System.out.print(x + " ");
        }
    }
}
