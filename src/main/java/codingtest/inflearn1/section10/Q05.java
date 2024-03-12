package main.java.codingtest.inflearn1.section10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<count; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list, Collections.reverseOrder());

        int money = sc.nextInt();
        int result = 0;

        for(int i=0; i<count; i++) {
            result += money / list.get(i);
            money = money % list.get(i);
            if(money == 0) break;
        }

        System.out.print(result);
    }

}
