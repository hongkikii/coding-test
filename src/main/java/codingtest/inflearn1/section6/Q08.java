package main.java.codingtest.inflearn1.section6;

import java.util.Arrays;
import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int V = sc.nextInt();
        int[] A = new int[N];

        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        int idx = findIdx(A, V, A.length / 2);

        System.out.println(idx+1);
    }

    public static int findIdx(int[] A, int V, int idx) {
        if(A[idx] == V) {
            return idx;
        }
        else if(A[idx] > V) {
            return findIdx(A, V, idx/2);
        }
        else {
            return findIdx(A, V, (A.length-idx)/2);
        }
    }
}
