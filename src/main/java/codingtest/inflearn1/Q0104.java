package codingtest.inflearn1;

import java.util.Scanner;

public class Q0104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt(); // 공백이나 개행 전까지 읽음, 개행 문자를 읽지 않음 = 남아 있음
        sc.nextLine(); // 개행 문자 소비
        for (int i = 0; i < loop; i++) {
            String str = sc.nextLine();
            StringBuilder stringBuilder = new StringBuilder(str).reverse();
            System.out.println(stringBuilder); // 객체의 toString() 메소드 자동으로 호출
        }
    }
}
