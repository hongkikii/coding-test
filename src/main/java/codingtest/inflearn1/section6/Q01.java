package main.java.codingtest.inflearn1.section6;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++) {
            int minIdx = i;
            for(int j=i; j<N; j++) {
                if(A[j] < A[minIdx]) {
                    minIdx = j;
                }
            }
            int tmp = A[i];
            A[i] = A[minIdx];
            A[minIdx] = tmp;
        }

        for(int v : A) {
            System.out.print(v + " ");
        }
    }
}
