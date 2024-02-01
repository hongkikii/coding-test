package main.java.codingtest.inflearn1.section3;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        int[] A = new int[1001];
        for (int i = 1; i < A.length; i++) {
            A[i] = i;
        }

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int p1 = 0;
        int p2 = 0;
        int sum = 0;
        int count = 0;
        for (p2 = 1; p2 < N; p2++) {
            sum += A[p2];
            if (sum == N) {
                count++;
            }
            if (sum > N) {
                while (sum > N) {
                    sum -= A[p1];
                    p1++;
                    if (sum == N) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
