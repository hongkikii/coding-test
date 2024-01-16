package codingtest.inflearn1;

import java.util.Scanner;

public class Q0106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String readLine = sc.nextLine();
        String result = "";
        for (int i = 0; i < readLine.length(); i++) {
            if (readLine.indexOf(readLine.charAt(i)) == i) {
                result += readLine.charAt(i);
            }
        }
        System.out.println(result);
    }
}
