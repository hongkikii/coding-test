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

        int idx = N/2;
        while(true) {
            if(A[idx] == V) {
                break;
            }
            else if(V < A[idx]) {
                idx = idx/2;
            }
            else {
                idx = (N-idx)/2;
            }
        }

        System.out.println(idx+1);
    }

}
