package main.java.codingtest.inflearn1.section10;

import java.util.Scanner;

public class Q01 {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;
        System.out.print(calculate(n));
    }

    public static int calculate(int n) {
        for(int i=3; i<=n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }

}
