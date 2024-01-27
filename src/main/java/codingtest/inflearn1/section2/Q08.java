package main.java.codingtest.inflearn1.section2;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] grades = new int[length];
        for (int i = 0; i < length; i++) {
            grades[i] = sc.nextInt();
        }

        for (int i = 0; i < length; i++) {
            int rank = 1;
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    continue;
                }
                if (grades[i] < grades[j]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}
