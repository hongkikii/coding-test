package main.java.codingtest.inflearn1.section8;

import java.util.Scanner;

public class Q04 {
    static int M;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int[] A = new int[M];

        DFS(A, 0);
    }

    public static void DFS(int[] A, int p) {
        if(p == M) {
            print(A);
        }
        else {
            for(int i=1; i<=N; i++) {
                A[p] = i;
                DFS(A, p+1);
            }
        }
    }

    public static void print(int[] A) {
        for(int v: A) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

}
