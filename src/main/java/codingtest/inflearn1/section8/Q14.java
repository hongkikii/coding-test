package main.java.codingtest.inflearn1.section8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q14 {

    static int size;
    static int M;
    static int[] A;
    static List<Location> home;
    static List<Location> pizza;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        M = sc.nextInt();
        pizza = new ArrayList<>();
        home = new ArrayList<>();
        A = new int[M];

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                int num = sc.nextInt();
                if(num == 1){
                    home.add(new Location(i, j));
                }
                if(num == 2) {
                    pizza.add(new Location(i, j));
                }
            }
        }
        size = pizza.size();
        DFS(0, 0);
        System.out.println(result);
    }

    static int result = Integer.MAX_VALUE;

    public static void DFS(int l, int s) {
        if(l == M) {
            int sum = 0;
            for (Location hl : home) {
                int min = Integer.MAX_VALUE;
                for (int idx : A) {
                    Location pl = pizza.get(idx);
                    min = Math.min(Math.abs(hl.x - pl.x) + Math.abs(hl.y - pl.y), min);
                }
                sum += min;
            }
            result = Math.min(sum, result);
        }
        else {
            for(int i=s; i<size; i++) {
                A[l] = i;
                DFS(l+1, i+1);
            }
        }
    }

    static class Location {
        int x;
        int y;
        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
