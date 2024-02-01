package main.java.codingtest.inflearn1.section3;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        int max = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < K; i++) {
            sum += A[i];
        }
        max = sum;

        for (int i = K; i < N; i++) {
            sum -= A[i - K];
            sum += A[i];
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
