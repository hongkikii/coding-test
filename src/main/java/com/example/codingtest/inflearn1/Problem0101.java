package com.example.codingtest;

import java.util.Scanner;

public class Problem0101 {
    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        Character condition = sc.nextLine().toLowerCase().charAt(0);
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == condition) {
                result++;
            }
        }
        System.out.println(result);
    }
}
