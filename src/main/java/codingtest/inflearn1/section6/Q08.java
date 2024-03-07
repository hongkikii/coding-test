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

        int idx = -1;
        int start = 0;
        int end = A.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (A[mid] == V) {
                idx = mid;
                break;
            }
            else if (A[mid] > V) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        System.out.println(idx+1);
    }
}
