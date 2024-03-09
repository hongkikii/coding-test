package main.java.codingtest.inflearn1.section9;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] S = new int[73];
        int[] E = new int[73];

        for(int i=0; i<N; i++){
            S[sc.nextInt()] += 1;
            E[sc.nextInt()] += 1;
        }

        int count = 0;
        int result = 0;

        for(int i=0; i<=72; i++) {
            count += S[i];
            count -= E[i];
            result = Math.max(result, count);
        }
        System.out.println(result);
    }
}
