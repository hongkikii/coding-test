package codingtest.inflearn1.section1;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String readLine = sc.nextLine();
        int result = 0;
        for (char c : readLine.toCharArray()) {
            if (c >= 48 && c <= 57) {
                result = result * 10 + (c - 48);
            }
        }
        System.out.println(result);
    }
}
