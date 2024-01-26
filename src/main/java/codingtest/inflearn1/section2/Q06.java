package main.java.codingtest.inflearn1.section2;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            String token = sc.next();
            StringBuilder reverse = new StringBuilder(token).reverse();
            numbers[i] = Integer.parseInt(reverse.toString());
        }

        for (int i = 0; i < N; i++) {
            if (isPrimeNumber(numbers[i])) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

    private static boolean isPrimeNumber(int number) {
        if (number == 1) {
            return false;
        }
        int[] primeNumbers = new int[number + 1];

        for (int i = 2; i <= number-1; i++) {
            if (primeNumbers[i] == 0) {
                for (int j = i; j <= number; j = j + i) {
                    primeNumbers[j] = 1;
                }
                if (primeNumbers[number] == 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
