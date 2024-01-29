import java.util.*;

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        this.data = val;
        lt = rt = null;
    }
}

public class Main {

    static int n;

    public static void DFS(int m) {
        if (n == m) return;
        else {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int node = 1;
        int i = 0, j = 1;
        while (i < k){
            node += j * 2;
            j *= 2;
            i++;
        }
        int[] arr = new int[node];
        for (int l = 0; l < node; l++) arr[i] = scan.nextInt();

        DFS(0);
    }


}