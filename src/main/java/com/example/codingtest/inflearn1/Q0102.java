package com.example.codingtest.inflearn1;

import java.util.Scanner;

public class Q0102 {
    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            }
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            }
        }
        System.out.print(result);
    }
}
