package main.java.codingtest.inflearn1.section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q07 {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int R = sc.nextInt();
        List<Edge> list = new ArrayList<>();
        arr = new int[C + 1];
        int result = 0;

        for(int i=1; i<=C; i++) {
            arr[i] = i;
        }

        for(int i=0; i<R;  i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int cost = sc.nextInt();
            list.add(new Edge(A, B, cost));
        }

        Collections.sort(list);

        for(Edge edge : list) {
            int A = find(edge.A);
            int B = find(edge.B);
            if(A!= B) {
                result += edge.cost;
                arr[A] = B;
            }
        }
        System.out.print(result);
    }

    static class Edge implements Comparable<Edge> {
        int A;
        int B;
        int cost;

        public Edge(int A, int B, int cost) {
            this.A = A;
            this.B = B;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }

    public static int find(int v) {
        if(arr[v] == v) return v;
        else return arr[v] = find(arr[v]);
    }

}
