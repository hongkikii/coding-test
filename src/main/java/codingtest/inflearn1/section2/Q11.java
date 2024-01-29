package main.java.codingtest.inflearn1.section2;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N + 1][6];
        int max = 0;
        int count = 0;
        int result = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= 5; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (A[i][k] == A[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (count > max) {
                result = i;
                max = count;
            }
            count = 0;
        }
        System.out.println(result);
    }
}
