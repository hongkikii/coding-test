package main.java.codingtest.inflearn1.section2;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] students = new int[length];
        for (int i = 0; i < length; i++) {
            students[i] = sc.nextInt();
        }

        int max = students[0];
        int number = 1;

        for (int i = 1; i < length; i++) {
            if (students[i] > max) {
                number++;
                max = students[i];
            }
        }
        System.out.println(number);
    }
}
