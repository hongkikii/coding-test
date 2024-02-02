package main.java.codingtest.inflearn1.section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N - K + 1; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < K; j++) {
                map.put(A[i + j], map.getOrDefault(A[i + j], 0) + 1);
            }
            System.out.print(map.size() + " ");
        }
    }
}
