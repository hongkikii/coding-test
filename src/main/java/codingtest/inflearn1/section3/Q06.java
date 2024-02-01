package main.java.codingtest.inflearn1.section3;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int p1 = 0;
        int count = 0; // 1로 바꾼 횟수
        int length = 0;

        for (int p2 = 0; p2 < N; p2++) {
            if (A[p2] == 0) {
                count++;
            }
            while (count > K) {
                if (A[p1] == 0) {
                    count--;
                }
                p1++;
            }
            length = Math.max(p2 - p1 + 1, length);
        }
        System.out.println(length);
    }
}
