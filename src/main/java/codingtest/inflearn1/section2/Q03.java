package main.java.codingtest.inflearn1.section2;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] A = new int[count];
        int[] B = new int[count];
        for (int i = 0; i < count; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < count; i++) {
            B[i] = sc.nextInt();
        }
        for (int i = 0; i < count; i++) {
            game(A[i], B[i]);
        }
    }

    private static void game(int a, int b) {
        if (a == b) { // 비기는 경우
            System.out.println("D");
        }
        else if (a - b == 1 || b - a == 2) { // A가 이기는 경우
            System.out.println("A");
        }
        else {
            System.out.println("B");
        }
    }
}
