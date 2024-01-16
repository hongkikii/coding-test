package codingtest.inflearn1;

import java.util.Scanner;

public class Q0103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String result = "";
        int maxCount = Integer.MIN_VALUE, pos;
        while ((pos=line.indexOf(" ")) != -1) {
            String tmp = line.substring(0, pos);
            int length = tmp.length();
            if (length > maxCount) {
                result = tmp;
                maxCount = length;
            }
            line = line.substring(pos + 1);
        }
        if (line.length() > maxCount) {
            result = line;
        }
        System.out.println(result);
    }
}
