package main.java.codingtest.inflearn1.section2;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] A = new int[M + 1][N + 1];
        int count = 0;
        int result = 0;

        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                count = 0;
                for (int k = 1; k <= M; k++) {
                    int ix = 0;
                    int iy = 0;
                    for (int l = 1; l <= N; l++) {
                        if (A[k][l] == i) {
                            ix = l;
                        }
                        if (A[k][l] == j) {
                            iy = l;
                        }
                    }
                    if (ix < iy) {
                        count++;
                    }
                }
                if (count == M) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
