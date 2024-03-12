package main.java.codingtest.inflearn1.section10;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n+2];
        A[1] = 1;
        A[2] = 2;

        for(int i=3; i<=n+1; i++) {
            A[i] = A[i-1] + A[i-2];
        }

        System.out.print(A[n+1]);
    }

}
