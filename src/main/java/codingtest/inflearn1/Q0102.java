package codingtest.inflearn1;

import java.util.Scanner;

public class Q0102 {
    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for (char c : str.toCharArray()) {
//            if (Character.isLowerCase(c)) {
//                result += Character.toUpperCase(c);
//            }
//            if (Character.isUpperCase(c)) {
//                result += Character.toLowerCase(c);
//            }
            if (c >= 97 && c <= 122) {
                result += (char)(c - 32);
            }
            if (c >= 65 && c <= 90) {
                result += (char)(c + 32);
            }
        }
        System.out.print(result);
    }
}
