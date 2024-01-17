package codingtest.inflearn1.section1;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        char target = sc.next().charAt(0);
        int[] result = new int[line.length()];
        int min = 1000;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == target) {
                min = 0;
            } else {
                min++;
            }
            result[i] = min;
        }

        min = 1000;

        for (int i = line.length() - 1; i >= 0; i--) {
            if (line.charAt(i) == target) {
                min = 0;
            } else {
                min++;
                result[i] = Math.min(result[i], min);
            }
        }

        for (int v : result) {
            System.out.print(v + " ");
        }
    }
}
