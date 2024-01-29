package main.java.codingtest.inflearn1.section2;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] A = new int[M + 1][N + 1];
        int result = 0;
        boolean isEqual;

        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= N - 1; i++) {
            int x = A[1][i];
            for (int j = i + 1; j <= N; j++) {
                int y = A[1][j];
                isEqual = true;
                for (int k = 2; k <= M; k++) {
                    int ix = 0;
                    int iy = 0;
                    for (int l = 1; l <= N; l++) {
                        if (A[k][l] == x) {
                            ix = l;
                        }
                        if (A[k][l] == y) {
                            iy = l;
                        }
                        if (ix != 0 && iy != 0) {
                            break;
                        }
                    }
                    if (ix > iy) {
                        isEqual = false;
                        break;
                    }
                }
                if (isEqual) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
