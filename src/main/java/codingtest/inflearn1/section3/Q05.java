package main.java.codingtest.inflearn1.section3;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        int count = 1;
        N--;

        while (N > 0) {
            count++;
            N -= count;
            if (N % count == 0) {
                result++;
            }
        }
        System.out.println(result);
    }
}
