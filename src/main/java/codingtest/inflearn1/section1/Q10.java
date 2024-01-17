package codingtest.inflearn1.section1;

import java.util.Scanner;

public class Q10 {
    static char[] chars;
    static int[] lengths;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        chars = sc.next().toCharArray();
        char target = sc.next().charAt(0);
        lengths = new int[chars.length];

        for (int i = 0; i < lengths.length; i++) {
            lengths[i] = 1000;
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == target) {
                compare(i);
            }
        }

        for (int v : lengths) {
            System.out.print(v + " ");
        }
    }

    private static void compare(int index) {
        for (int i = 0; i < chars.length; i++) {
            int newLength = Math.abs(index - i);
            if (newLength < lengths[i]) {
                lengths[i] = newLength;
            }
        }
    }
}
