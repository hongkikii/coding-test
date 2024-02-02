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
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < K - 1; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        int p1 = 0;
        for (int p2 = K - 1; p2 < N; p2++) {
            map.put(A[p2], map.getOrDefault(A[p2], 0) + 1);
            System.out.print(map.size() + " ");

            map.put(A[p1], map.get(A[p1]) - 1);
            if (map.get(A[p1]) == 0) {
                map.remove(A[p1]);
            }
            p1++;
        }
    }
}
