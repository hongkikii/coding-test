package main.java.codingtest.inflearn1.section1;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String result = "";

        for (int i = 0; i < line.length(); i++) {
            char alphabet = line.charAt(i);
            if (i == 0) {
                result += alphabet;
                continue;
            }
            if (alphabet == line.charAt(i - 1)) {
                char lastCharacter = result.charAt(result.length() - 1);
                if (lastCharacter >= 48 && lastCharacter <= 57) {
                    int newCount = Integer.parseInt(String.valueOf(lastCharacter)) + 1;
                    result = result.substring(0, result.length() - 1) + newCount;
                }
                else {
                    result += 2;
                }
            }
            if (alphabet != line.charAt(i - 1)) {
                result += alphabet;
            }
        }
        System.out.println(result);
    }
}
