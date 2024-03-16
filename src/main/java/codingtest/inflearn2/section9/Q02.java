package main.java.codingtest.inflearn2.section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q02 {
    static List<Pipe> list;
    static int size;
    static boolean[] check;
    static int d;
    static int result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        d = sc.nextInt();
        int count = sc.nextInt();
        list = new ArrayList<>();

        for(int i=0; i<count; i++) {
            int length = sc.nextInt();
            int weight = sc.nextInt();
            list.add(new Pipe(length, weight));
        }
        size = list.size();
        Collections.sort(list);
        check = new boolean[size];
        DFS(0, 0, Integer.MAX_VALUE);
        System.out.println(result);
    }

    public static void DFS(int idx, int length, int min) {
        if(length == d) {
            result = Math.max(result, min);
            return;
        }
        if(length > d) return;

        for (int i = idx; i < size; i++) {
            length += list.get(idx).length;
            DFS(idx + 1, length, Math.min(min, list.get(i).weight));
        }
    }

    static class Pipe implements Comparable<Pipe> {
        int length;
        int weight;
        public Pipe(int length, int weight) {
            this.length = length;
            this.weight = weight;
        }

        @Override
        public int compareTo(Pipe o) {
            return this.length - o.length;
        }
    }

}
