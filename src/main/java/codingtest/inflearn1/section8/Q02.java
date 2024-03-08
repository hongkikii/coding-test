package main.java.codingtest.inflearn1.section8;

import java.util.Scanner;

public class Q02 {
    static int C;
    static int N;
    static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C = sc.nextInt();
        N = sc.nextInt();
        int[] A = new int[N];

        for(int i=0; i<A.length; i++) {
            A[i] = sc.nextInt();
        }

        DFS(A, 0, 0);

        System.out.println(answer);
    }

    public static void DFS(int[] A, int sum, int level) {
        if(sum > C) {
            return;
        }
        if(level == N) {
            answer = Math.max(sum, answer);
        }
        else {
            DFS(A, sum+A[level], level+1);
            DFS(A, sum, level+1);
        }
    }

}
