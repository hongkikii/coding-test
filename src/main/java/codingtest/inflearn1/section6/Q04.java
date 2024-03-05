package main.java.codingtest.inflearn1.section6;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int N = sc.nextInt();
        int[] cache = new int[S];

        for(int i=0; i<N; i++) {
            int value = sc.nextInt();
            for(int j = 0; j<S; j++) {
                if(value == cache[j]) {
                    for(int k=j; k>0; k--) {
                        cache[k] = cache[k-1];
                    }
                    cache[0] = value;
                    break;
                }
                else {
                    if(j == S-1) {
                        for(int l=j; l>0; l--) {
                            cache[l] = cache[l-1];
                        }
                        cache[0] = value;
                    }
                }
            }
        }

        for (int v : cache) {
            System.out.print(v + " ");
        }
    }
}
