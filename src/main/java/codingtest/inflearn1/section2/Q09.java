package main.java.codingtest.inflearn1.section2;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        for (int i = 1; i <= N; i++) {
            int row = 0;
            int column = 0;
            for (int j = 1; j <= N; j++) {
                row += A[i][j];
                column += A[j][i];
            }
            max = Math.max(max, row);
            max = Math.max(max, column);
        }

        int leftDiagonal = 0;
        int rightDiagonal = 0;

        for (int i = 1; i <= N; i++) {
            leftDiagonal += A[i][i];
            rightDiagonal += A[i][N - i + 1];
        }
        max = Math.max(max, leftDiagonal);
        max = Math.max(max, rightDiagonal);

        System.out.println(max);
    }
}
