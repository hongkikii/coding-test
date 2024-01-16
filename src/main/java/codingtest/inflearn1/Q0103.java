package codingtest.inflearn1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q0103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] split = line.split(" ");
        String result = Arrays.stream(split)
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println(result);
    }
}
