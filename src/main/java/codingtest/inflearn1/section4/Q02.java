package main.java.codingtest.inflearn1.section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] A = sc.next().toCharArray();
        char[] B = sc.next().toCharArray();
        boolean result = true;

        Map<Character, Integer> AMap = new HashMap<>();

        for (char c : A) {
            AMap.put(c, AMap.getOrDefault(c, 0) + 1);
        }

        for (char c : B) {
            if (!AMap.containsKey(c) || AMap.get(c) == 0) {
                result = false;
                break;
            }
            else {
                AMap.put(c, AMap.get(c) - 1);
            }
        }

        if (result) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
