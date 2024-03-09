package main.java.codingtest.inflearn1.section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Person> list = new ArrayList<>();

        for(int i=0; i<N; i++) {
            int tall = sc.nextInt();
            int weight = sc.nextInt();
            list.add(new Person(tall, weight));
        }

        Collections.sort(list);

        int max = Integer.MIN_VALUE;
        int result = 0;
        for (Person person : list) {
            if (person.weight > max) {
                result++;
                max = person.weight;
            }
        }
        System.out.println(result);
    }

    static class Person implements Comparable<Person> {
        int tall;
        int weight;

        @Override
        public int compareTo(Person o) {
            return o.tall - this.tall;
        }

        public Person(int tall, int weight) {
            this.tall = tall;
            this.weight = weight;
        }
    }
}
