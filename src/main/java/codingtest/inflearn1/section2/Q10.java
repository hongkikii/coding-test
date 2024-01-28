package main.java.codingtest.inflearn1.section2;

import java.util.Scanner;

public class Q10 {
    static int[][] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        A = new int[N + 2][N + 2];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (isMax(i, j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static boolean isMax(int i, int j) {
        if (A[i][j - 1] >= A[i][j]) {
            return false;
        }
        if (A[i - 1][j] >= A[i][j]) {
            return false;
        }
        if (A[i + 1][j] >= A[i][j]) {
            return false;
        }
        if (A[i][j + 1] >= A[i][j]) {
            return false;
        }
        return true;
    }
}
