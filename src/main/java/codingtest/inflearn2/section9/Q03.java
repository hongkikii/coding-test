package main.java.codingtest.inflearn2.section9;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n+1];
        int[] score = new int[n+1];
        for(int i=1; i<=n; i++) {
            A[i] = sc.nextInt();
        }
        if(n==1) {
            System.out.println(A[1]);
            return;
        }
        score[1] = A[1];
        score[2] = A[1] + A[2];
        for(int i=3; i<=n; i++) {
            score[i] = Math.max(score[i-2] + A[i], score[i-3]+A[i-1]+A[i]);
        }
        System.out.print(score[n]);
    }

}
