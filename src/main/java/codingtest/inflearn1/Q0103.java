package codingtest.inflearn1;

import java.util.Scanner;

public class Q0103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] split = line.split(" ");
        String result = "";
        int maxCount = 0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() > maxCount) {
                result = split[i];
                maxCount = split[i].length();
            }
        }
        System.out.println(result);
    }
}
