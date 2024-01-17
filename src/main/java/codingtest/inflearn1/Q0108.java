package codingtest.inflearn1;

import java.util.Scanner;

public class Q0108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().toLowerCase();
        int left = 0;
        int right = line.length() - 1;

        while (left < right) {
            if (!isLowerCase(line.charAt(left))) {
                left++;
            }
            if (!isLowerCase(line.charAt(right))) {
                right--;
                continue;
            }
            if (line.charAt(left) != line.charAt(right)) {
                System.out.println("NO");
                return;
            }
            left++;
            right--;
        }

        System.out.println("YES");
    }

    private static boolean isLowerCase(char c) {
        return c >= 97 && c <= 122;
    }
}
