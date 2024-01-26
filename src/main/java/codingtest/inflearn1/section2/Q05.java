package main.java.codingtest.inflearn1.section2;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] primeNumbers = new int[N+1];
        primeNumbers[0] = -1;
        primeNumbers[1] = -1;

        for (int i = 2; i <= N; i++) {
            int count = 2;
            int multiple = i * count;
            while (multiple <= N) {
                primeNumbers[multiple] = -1;
                count++;
                multiple = i * count;
            }
        }
        int result = 0;
        for (int v : primeNumbers) {
            if (v != -1) {
                result++;
            }
        }

        System.out.println(result);
    }
}
