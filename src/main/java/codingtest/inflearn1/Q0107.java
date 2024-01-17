package codingtest.inflearn1;

import java.util.Scanner;

public class Q0107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().toLowerCase();
        int length = line.length();
        for (int i = 0; i < length / 2; i++) {
            if (line.charAt(i) != line.charAt(length - 1 - i)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
