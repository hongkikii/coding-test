package main.java.codingtest.inflearn1.section1;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        // 4개씩 끊기, 저장
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        String[] byteAlphabets = new String[index];
        int[] asciiAlphabets = new int[index];

        for (int i = 0; i < byteAlphabets.length; i++) {
            String encrypt = line.substring(0, 7);
            byteAlphabets[i] = encrypt;
            line = line.substring(7, line.length());
        }

        // 해독 1, 0
        for (int i = 0; i < byteAlphabets.length; i++) {
            String encrypt = byteAlphabets[i];
            String decrypt = "";
            for (int j = 0; j < encrypt.length(); j++) {
                if (encrypt.charAt(j) == '#') {
                    decrypt += "1";
                }
                if (encrypt.charAt(j) == '*') {
                    decrypt += "0";
                }
            }
            byteAlphabets[i] = decrypt;
        }
        
        // 대입, 출력
        for (int i = 0; i < byteAlphabets.length; i++) {
            String bytes = byteAlphabets[i];
            int ascii = 0;
            int square = 6; // 중요
            for (int j = 0; j < bytes.length(); j++) {
                if (bytes.charAt(j) == '1') {
                    ascii += Math.pow(2, square);
                }
                square--;
            }
            asciiAlphabets[i] = ascii;
        }

        for (int ascii : asciiAlphabets) {
            System.out.print((char) ascii);
        }
    }
}
