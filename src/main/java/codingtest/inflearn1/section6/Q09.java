package main.java.codingtest.inflearn1.section6;

import java.util.Arrays;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];

        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        int start = Arrays.stream(A).max().getAsInt();
        int end = Arrays.stream(A).sum();

        int result = -1;
        while(start<=end) {
            int mid = (start + end) / 2;
            if (count(A, mid) <= M) {
                end = mid - 1;
                result = mid;
            }
            else {
                start = mid + 1;
            }
        }
        System.out.println(result);
    }

    public static int count(int[] A, int size) {
        int count = 1;
        int sum = 0;
        for (int x : A) {
            if (x + sum > size) {
                count++;
                sum = x;
            }
            else {
                sum += x;
            }
        }
        return count;
    }
}
