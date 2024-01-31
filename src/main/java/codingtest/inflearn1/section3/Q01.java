package main.java.codingtest.inflearn1.section3;

import java.util.Arrays;
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
        for (int i = 0; i < N1; i++) {
            result[i] = A1[i];
        }
        for (int i = 0; i < N2; i++) {
            result[N1 + i] = A2[i];
        }

        Arrays.sort(result);
        for (int v : result) {
            System.out.print(v + " ");
        }
    }
}
