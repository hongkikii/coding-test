package main.java.codingtest.inflearn1.section6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        List<Integer> list = new ArrayList<>();

        for(int i=1; i<=N; i++) {
            A[i] = sc.nextInt();
        }

        int[] B = A.clone();
        Arrays.sort(B);

        for(int i=1; i<=N; i++) {
            if(A[i] != B[i]) {
                list.add(i);
            }
        }

        for (int v : list) {
            System.out.print(v + " ");
        }
    }
}
