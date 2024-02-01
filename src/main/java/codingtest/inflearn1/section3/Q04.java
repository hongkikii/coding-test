package main.java.codingtest.inflearn1.section3;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int p1 = 0;
        int p2 = 0;
        int count = 0;
        int sum = 0;

        for (p2 = 0; p2 < N; p2++) {
            sum += A[p2];
            if (sum == M) {
                count++;
            }
            if (sum > M) {
                while (sum > M) {
                    sum -= A[p1++];
                    if (sum == M) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
