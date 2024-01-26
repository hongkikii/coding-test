package main.java.codingtest.inflearn1.section2;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] primeNumbers = new int[N+1];
        int result = 0;

        for (int i = 2; i <= N; i++) {
            if (primeNumbers[i] == 0) {
                result++;
                for (int j = i; j <= N; j = j + i) {
                    primeNumbers[j] = 1;
                }
            }
        }
        System.out.println(result);
    }
}
