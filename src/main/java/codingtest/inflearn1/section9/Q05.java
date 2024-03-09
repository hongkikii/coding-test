package main.java.codingtest.inflearn1.section9;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 정점의 수
        int M = sc.nextInt(); // 간선의 수
        int[] min = new int[N+1];
        List<ArrayList<Edge>> graph = new ArrayList<>();
        for(int i=0; i<=N; i++){
            min[i] = Integer.MAX_VALUE;
        }
        for(int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
        }
        for(int i=1; i<=M; i++) {
            int start = sc.nextInt();
            int vertex = sc.nextInt();
            int weight = sc.nextInt();
            graph.get(start).add(new Edge(vertex, weight));
        }

        Queue<Edge> queue = new PriorityQueue<>();
        queue.add(new Edge(1, 0));
        min[1] = 0;

        while(!queue.isEmpty()) {
            Edge poll = queue.poll();
            int nowVertex = poll.vertex;
            int nowCost = poll.weight;
            if(min[nowVertex] < nowCost) continue;
            for(Edge edge : graph.get(nowVertex)) {
                if(min[edge.vertex] > nowCost + edge.weight) {
                    min[edge.vertex] = nowCost + edge.weight;
                    queue.add(new Edge(edge.vertex, nowCost+ edge.weight));
                }
            }
        }
        for(int i=1; i<=N; i++) {
            if(min[i] != Integer.MAX_VALUE) {
                System.out.println(i + ":" + min[i]);
            }
            else {
                System.out.println(i + ":" + "Impossible");
            }
        }
    }

    static class Edge implements Comparable<Edge> {
        int vertex;
        int weight;

        public Edge(int vertex, int weight){
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o){
            return this.weight - o.weight;
        }
    }

}
