package com.example.codingtest.inflearn1;

import java.util.Scanner;

public class Q0101 {
    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        Character condition = sc.nextLine().toLowerCase().charAt(0);
        int result = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == condition) {
//                result++;
//            }
//        }
        for (char x : str.toCharArray()) {
            if(x == condition) {
                result++;
            }
        }
        System.out.println(result);
    }
}
