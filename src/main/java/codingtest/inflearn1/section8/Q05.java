package main.java.codingtest.inflearn1.section8;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {
    static int answer = Integer.MAX_VALUE;
    static int M;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] A = new int[N];

        for(int i=0; i<A.length; i++) {
            A[i] = sc.nextInt();
        }

        M = sc.nextInt();
        Arrays.sort(A);
        DFS(A, 0, 0);

        System.out.println(answer);
    }

    public static void DFS(int[] A, int sum, int count) {
        if(sum > M) return;
        if(answer <= count) return;
        if(sum == M) answer = Math.min(count, answer);
        else {
            for(int i=N-1; i>=0; i--) {
                DFS(A, sum + A[i], count + 1);
            }
        }
    }
}
