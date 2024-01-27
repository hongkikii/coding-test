package main.java.codingtest.inflearn1.section1;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine() + " ";
        String result = "";
        int count = 1;

        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) == line.charAt(i + 1)) {
                count++;
            }
            else {
                result += line.charAt(i);
                if (count > 1) {
                    result += count;
                    count = 1;
                }
            }
        }
        System.out.println(result);
    }
}
