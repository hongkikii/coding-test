package main.java.codingtest.inflearn1.section10;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] result = new int[N];

        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        int answer = 1;
        result[0] = 1;

        for(int i=1; i<N; i++) {
            int max = 0;
            for(int j=i-1; j>=0; j--) {
                if(A[i] > A[j] && max < result[j]) {
                    max = result[j];
                }
            }
            result[i] = max + 1;
            answer = Math.max(answer, result[i]);
        }
        System.out.print(answer);
    }

}
