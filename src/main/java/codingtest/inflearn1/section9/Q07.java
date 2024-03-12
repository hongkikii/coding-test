package main.java.codingtest.inflearn1.section9;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int R = sc.nextInt();
        boolean[] check  = new boolean[C+1];
        List<ArrayList<Edge>> list = new ArrayList<>();
        for(int i=1; i<=R; i++) {
            list.add(new ArrayList<>());
        }
        for(int i=0; i<R; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int cost = sc.nextInt();
            list.get(A).add(new Edge(B, cost));
            list.get(B).add(new Edge(A, cost));
        }

        Queue<Edge> queue = new PriorityQueue<>();
        queue.add(new Edge(1, 0));

        int result = 0;
        while(!queue.isEmpty()) {
            Edge edge = queue.poll();
            if(!check[edge.vertex]) {
                check[edge.vertex] = true;
                result += edge.cost;
                for(Edge v : list.get(edge.vertex)) {
                    if(!check[v.vertex]) {
                        queue.add(v);
                    }
                }
            }
        }
        System.out.print(result);
    }

    static class Edge implements Comparable<Edge> {
        int vertex;
        int cost;

        public Edge(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }

}
