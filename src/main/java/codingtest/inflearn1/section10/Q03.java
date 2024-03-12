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

        int answer = Integer.MIN_VALUE;
        result[0] = 1;

        for(int i=1; i<N; i++) {
            for(int j=i; j>=0; j--) {
                if(A[i] >= A[j]) {
                    result[i] = Math.max(result[i], result[j] + 1);
                }
            }
            answer = Math.max(answer, result[i]);
        }
        System.out.print(answer);
    }

}
