package main.java.codingtest.inflearn1.section4;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Set<Integer> sum = new TreeSet<>(Comparator.reverseOrder());
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    sum.add(A[i] + A[j] + A[k]);
                }
            }
        }

        int count = 0;
        for (int v : sum) {
            count++;
            if (count == K) {
                System.out.println(v);
                return;
            }
        }
        System.out.println(-1);
    }
}
