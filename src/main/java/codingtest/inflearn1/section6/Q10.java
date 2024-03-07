package main.java.codingtest.inflearn1.section6;

import java.util.Arrays;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] A = new int[N];

        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        int start = 1;
        int end = Arrays.stream(A).max().getAsInt() - Arrays.stream(A).min().getAsInt();
        int result = -1;

        while(start <= end) {
            int mid = (start + end) / 2;
            int count = count(A, mid);
            if(count >= C) {
                result = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        System.out.println(result);
    }

    public static int count(int[] A, int mid) {
        int count = 1;
        int endPoint = 0;
        for(int i=1; i<A.length; i++) {
            if(A[i] - A[endPoint] >= mid) {
                endPoint = i;
                count++;
            }
        }
        return count;
    }

}
