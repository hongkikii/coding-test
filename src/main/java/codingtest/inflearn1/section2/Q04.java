package main.java.codingtest.inflearn1.section2;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] sequence = new int[count];
        sequence[0] = 1;
        sequence[1] = 1;

        for (int i = 2; i < count; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        for (int v : sequence) {
            System.out.print(v + " ");
        }
    }
}
