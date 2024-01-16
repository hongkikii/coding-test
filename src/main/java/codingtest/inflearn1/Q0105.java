package codingtest.inflearn1;

import java.util.Scanner;

public class Q0105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (!isAlphabet(chars[left])) {
                left++;
            }
            if (!isAlphabet(chars[right])) {
                right--;
            }
            if (isAlphabet(chars[left]) && isAlphabet(chars[right])) {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
        }
        System.out.print(chars);
    }

    private static boolean isAlphabet(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }
}
