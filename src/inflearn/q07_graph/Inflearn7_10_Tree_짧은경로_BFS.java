package inflearn.q07_graph;

import java.util.LinkedList;
import java.util.Queue;

public class Inflearn7_10_Tree_짧은경로_BFS {
    static Node root;
    static Queue<Node> Q = new LinkedList<>();

    // 내가 작성한 코드
    public static int BFS(Node root) {
        int L = 0;
        Q.offer(root);
        while (!Q.isEmpty()) {
            int size = Q.size();
            for (int j = 0; j < size; j++) {
                Node target = Q.poll();
                if (target.lt == null && target.rt == null) return L;
                if (target.lt != null) Q.offer(target.lt);
                if (target.rt != null) Q.offer(target.rt);
            }
            L++;
        }
        return 0;
    }


    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(BFS(root));
    }
}
