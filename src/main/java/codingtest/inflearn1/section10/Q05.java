package main.java.codingtest.inflearn1.section10;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] coin = new int[N];
        for(int i=0; i<N; i++) {
            coin[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] count = new int[M+1];
        Arrays.fill(count, Integer.MAX_VALUE);
        count[0] = 0;

        for(int i=0; i<N; i++) {
            for(int j=coin[i]; j<=M; j++) {
                count[j] = Math.min(count[j], count[j-coin[i]]+1);
            }
        }

        System.out.print(count[M]);
    }

}
