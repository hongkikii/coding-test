package main.java.codingtest.inflearn1.section1;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String line = sc.next();

        for (int i = 0; i < length; i++) {
            String bytes = line.substring(0, 7).replace('#', '1').replace('*', '0');
            System.out.print((char) Integer.parseInt(bytes, 2));
            line = line.substring(7);
        }
    }
}
