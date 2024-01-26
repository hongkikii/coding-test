package main.java.codingtest.inflearn1.section2;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();
            int reverse = 0;
            while (number > 0) {
                int r = number % 10;
                reverse = reverse * 10 + r;
                number /= 10;
            }
            numbers[i] = reverse;
        }

        for (int i = 0; i < N; i++) {
            if (isPrime(numbers[i])) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
