package main.java.codingtest.inflearn1.section6;

import java.util.Arrays;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        int[] B = new int[N+1];
        int tall = -1;
        int small = -1;

        for(int i=1; i<=N; i++) {
            A[i] = sc.nextInt();
            B[i] = A[i];
        }

        Arrays.sort(B);

        for(int i=1; i<=N; i++) {
            if(A[i] != B[i]) {
                if(B[i] > A[i]) {
                    tall = i;
                }
                if(B[i] < A[i]) {
                    small = i;
                }
            }
        }
        System.out.println(small + " " + tall);
    }

}
