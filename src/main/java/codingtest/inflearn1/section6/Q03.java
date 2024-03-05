package main.java.codingtest.inflearn1.section6;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        for(int i=1; i<N; i++) {
            if(A[i-1] > A[i]) {
                int tmp1 = A[i];
                A[i] = A[i-1];
                A[i-1] = tmp1;
                int idx = i-1;
                while(idx > 0) {
                    if(A[idx] < A[idx-1]) {
                        int tmp2 = A[idx];
                        A[idx] = A[idx-1];
                        A[idx-1] = tmp2;
                    }
                    idx--;
                }
            }
        }

        for(int v : A) {
            System.out.print(v + " ");
        }
    }

}
