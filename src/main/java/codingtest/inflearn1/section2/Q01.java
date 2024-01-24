package main.java.codingtest.inflearn1.section2;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print(numbers[0] + " ");

        for (int i = 1; i < length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
