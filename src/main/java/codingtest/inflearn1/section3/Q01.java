package main.java.codingtest.inflearn1.section3;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int[] A1 = new int[N1];
        for (int i = 0; i < N1; i++) {
            A1[i] = sc.nextInt();
        }

        int N2 = sc.nextInt();
        int[] A2 = new int[N2];
        for (int i = 0; i < N2; i++) {
            A2[i] = sc.nextInt();
        }

        int[] result = new int[N1 + N2];
        int p1 = 0;
        int p2 = 0;

        for (int i = 0; i < N1 + N2; i++) {
            if (p1 < N1 && p2 < N2) {
                if (A1[p1] < A2[p2]) {
                    result[i] = A1[p1];
                    p1++;
                }
                else {
                    result[i] = A2[p2];
                    p2++;
                }
            }
            else {
                if (p1 < N1) {
                    result[i] = A1[p1];
                    p1++;
                }
                if (p2 < N2) {
                    result[i] = A2[p2];
                    p2++;
                }
            }
        }

        for (int v : result) {
            System.out.print(v + " ");
        }
    }
}
