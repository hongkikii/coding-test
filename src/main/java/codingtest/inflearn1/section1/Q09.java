package codingtest.inflearn1.section1;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().replaceAll("[^0-9]", "");
        while (line.charAt(0) == '0') {
            line = line.substring(1);
        }
        System.out.println(line);
    }
}
