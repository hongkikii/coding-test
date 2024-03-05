package main.java.codingtest.inflearn1.section6;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int N = sc.nextInt();
        int[] cache = new int[S];
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int v : A) {
            int idx = -1;
            for (int j = 0; j < S; j++) {
                if (cache[j] == v) {
                    idx = j;
                    break;
                }
            }
            if (idx == -1) {
                for (int k = S - 1; k > 0; k--) {
                    cache[k] = cache[k - 1];
                }
                cache[0] = v;
            }
            else {
                for (int k = idx; k > 0; k--) {
                    cache[k] = cache[k - 1];
                }
                cache[0] = v;
            }
        }

        for (int v : cache) {
            System.out.print(v + " ");
        }
    }
}
