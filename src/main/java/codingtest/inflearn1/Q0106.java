package codingtest.inflearn1;

import java.util.Scanner;

public class Q0106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String readLine = sc.nextLine();
        String result = "";
        for (char c : readLine.toCharArray()) {
            if (!result.contains(String.valueOf(c))) {
                result += c;
            }
        }
        System.out.println(result);
    }
}
