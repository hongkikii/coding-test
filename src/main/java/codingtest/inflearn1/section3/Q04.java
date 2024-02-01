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
        int sum = A[0];

        while (p1 < N && p2 < N) {
            if (sum == M) {
                count++;
                sum -= A[p1];
                p1++;
                p2++;
                if (p1 < N && p2 < N) {
                    sum += A[p2];
                }
            } else if (sum < M) {
                p2++;
                if (p2 < N) {
                    sum += A[p2];
                }
            } else if (sum > M) {
                sum -= A[p1];
                p1++;
                if (p1 > p2) {
                    p2 = p1;
                }
            }
        }

        System.out.println(count);
    }
}
