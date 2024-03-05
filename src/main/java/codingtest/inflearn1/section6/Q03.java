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
            int tmp = A[i];
            for (int j = i - 1; j >= 0; j--) {
                if (A[j] > tmp) {
                    A[j + 1] = A[j];
                    A[j] = tmp;
                }
                else {
                    break;
                }
            }
        }

        for(int v : A) {
            System.out.print(v + " ");
        }
    }

}
