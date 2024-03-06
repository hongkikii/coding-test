package main.java.codingtest.inflearn1.section6;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        int tall = -1;
        int small = -1;

        for(int i=1; i<=N; i++) {
            A[i] = sc.nextInt();
        }

        for(int i=2; i<N; i++) {
            if(A[i] < A[i-1]) {
                small = i;
            }
            if(tall == -1 && A[i] >= A[i+1]) {
                tall = i;
            }
        }
        System.out.println(tall  + " " + small);
    }
}
