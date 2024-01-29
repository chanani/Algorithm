package inflearn.q07_graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node2{
    int data;
    Node2 lt, rt;
    public  Node2(int val){
        data = val;
        lt = rt = null;
    }
}

public class Inflearn7_7_이지트리_레벨탐색_BFS {
    static Node2 root;

    public static void BFS(Node2 root){
        Queue<Node2> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                Node2 cur = Q.poll();
                System.out.print(cur.data + " ");
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        root = new Node2(1);
        root.lt = new Node2(2);
        root.rt = new Node2(3);
        root.lt.lt = new Node2(4);
        root.lt.rt = new Node2(5);
        root.rt.lt= new Node2(6);
        root.rt.rt = new Node2(7);
        BFS(root);
    }

}
