package codingtest.inflearn1;

import java.util.Scanner;

public class Q0104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt(); // 공백이나 개행 전까지 읽음, 개행 문자를 읽지 않음 = 남아 있음
        for (int i = 0; i < loop; i++) {
            String str = sc.next(); // 공백 문자를 기준으로 다음 토큰 읽음
            int left = 0;
            int right = str.length() - 1;
            char[] chars = str.toCharArray();
            while (left < right) {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
            System.out.println(String.valueOf(chars));
        }
    }
}
