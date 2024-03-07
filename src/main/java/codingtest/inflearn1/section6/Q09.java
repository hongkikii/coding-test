package main.java.codingtest.inflearn1.section6;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];

        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        int size = 0;
        int result = -1;
        for(int i=A.length-1; i>=0; i--) {
            size += A[i];
            result = findSize(A, size, M);
            if(result != -1) break;
        }

        System.out.println(result);
    }

    public static int findSize(int[] A, int size, int M) {
        int[] dvd = new int[M];
        int idx = 0;

        for(int i=0; i<A.length; i++) {
            if(dvd[idx] + A[i] <= size) {
                dvd[idx] += A[i];
            }
            else {
                idx++;
                if(idx > M-1) {
                    return -1;
                }
            }
        }
        return size;
    }

}
