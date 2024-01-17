package codingtest.inflearn1.section1;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String reverseLine = new StringBuilder(line).reverse().toString();
        if (line.equalsIgnoreCase(reverseLine)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
