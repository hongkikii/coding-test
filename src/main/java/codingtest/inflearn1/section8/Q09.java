package main.java.codingtest.inflearn1.section8;

import java.util.Scanner;

public class Q09 {
    static int N;
    static int M;
    static int[] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[M];

        DFS(0, 1);
    }

    public static void DFS(int idx, int value) {
        if(idx == M) {
            for(int v: A) System.out.print(v + " ");
            System.out.println();
        }
        else {
            for(int i=value; i<=N; i++) {
                A[idx] = i;
                DFS(idx+1, i+1);
            }
        }
    }

}
