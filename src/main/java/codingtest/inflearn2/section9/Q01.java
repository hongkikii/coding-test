package main.java.codingtest.inflearn2.section9;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int money = (int) Math.round(sc.nextDouble() * 100);

        while(!(count ==  0 && money == 0)) {
            int[] max = new int[money+1];
            for(int i=0; i<count; i++) {
                int kcal = sc.nextInt();
                int price = (int) Math.round(sc.nextDouble() * 100);

                for(int j=price; j<=money; j++) {
                    max[j] = Math.max(max[j], max[j-price]+kcal);
                }
            }
            System.out.println(max[money]);
            count = sc.nextInt();
            money = (int) Math.round(sc.nextDouble() * 100);

        }
    }
}
