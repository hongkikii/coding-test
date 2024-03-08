package main.java.codingtest.inflearn1.section8;

import java.util.Scanner;

public class Q07 {
    static int[][] memo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        memo = new int[n + 1][r + 1];

        int answer = DFS(n, r);

        System.out.println(answer);
    }

    public static int DFS(int n, int r) {
        if(memo[n][r] != 0) return memo[n][r];
        if(n == r || r == 0) return 1;
        else {
            return memo[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
        }
    }
}
