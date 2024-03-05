package main.java.codingtest.inflearn1.section6;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        for(int j=0; j<N-1; j++) {
            for(int i=1; i<N-j; i++) {
                if(A[i-1] > A[i]) {
                    int tmp = A[i];
                    A[i] = A[i-1];
                    A[i-1] = tmp;
                }
            }
        }

        for (int v : A) {
            System.out.print(v + " ");
        }
    }
}
