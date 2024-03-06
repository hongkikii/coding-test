package main.java.codingtest.inflearn1.section6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        String result = "U";

        for(int i=0; i<N; i++) {
            int tmp = sc.nextInt();
            if(set.contains(tmp)) {
                result = "D";
                break;
            }
            set.add(tmp);
        }

        System.out.println(result);
    }

}
