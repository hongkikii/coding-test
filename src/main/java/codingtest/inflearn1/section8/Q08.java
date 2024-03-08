package main.java.codingtest.inflearn1.section8;

import java.util.Scanner;

public class Q08 {
    static int[] A;
    static int[] check;
    static int[] C;
    static int[][] memo;
    static int N;
    static int F;
    static boolean flag;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        F = sc.nextInt();

        C = new int[N];
        memo = new int[N][N];
        A = new int[N];
        check = new int[N+1];

        for(int i=0; i<N; i++) {
            C[i] = makeC(N-1, i);
        }

        DFS(0, 0);
    }

    public static int makeC(int n, int r) {
        if(memo[n][r] != 0 ) return memo[n][r];
        if(n==r || r == 0) return 1;
        else {
            return memo[n][r] = makeC(n-1, r-1) + makeC(n-1, r);
        }
    }

    public static void DFS(int p, int sum) {
        if(flag) return;
        if(p == N) {
            if (sum == F) {
                for(int x : A) System.out.print(x + " ");
                flag = true;
            }
        }
        else {
            for(int i=1; i<=N; i++) {
                if(check[i] == 0) {
                    A[p] = i;
                    check[i] = 1;
                    DFS(p+1, sum+ (A[p] * C[p]));
                    check[i] = 0;
                }
            }
        }
    }
}
