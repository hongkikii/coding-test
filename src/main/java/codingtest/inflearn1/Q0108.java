package codingtest.inflearn1;

import java.util.Scanner;

public class Q0108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().toLowerCase().replaceAll("[^a-z]", "");
        String reverse = new StringBuilder(line).reverse().toString();
        if (line.equals(reverse)) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
