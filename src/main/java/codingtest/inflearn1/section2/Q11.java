package main.java.codingtest.inflearn1.section2;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N + 1][6];
        int[][] school = new int[N + 1][6];
        int max = 0;
        int idx = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= 5; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int row = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= N; j++) {
                if (j == row) {
                    continue;
                }
                if (A[j][i] == A[row][i]) {
                    school[row][i]++;
                }
            }
            row++;
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= 5; j++) {
                if (school[i][j] > 0) {
                    count++;
                }
            }
            if (count > max) {
                idx = i;
            }
            count = 0;
        }
        System.out.println(idx);
    }
}
