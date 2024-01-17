package codingtest.inflearn1.section1;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String readLine = sc.nextLine();
        String result = "";
        for (char c : readLine.toCharArray()) {
            if (Character.isDigit(c)) {
                result += c;
            }
        }
        System.out.println(Integer.parseInt(result));
    }
}
