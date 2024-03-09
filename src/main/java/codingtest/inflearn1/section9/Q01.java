package main.java.codingtest.inflearn1.section9;

import java.util.ArrayList;
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

        int result = N;
        for(Person person : list) {
            for(Person compare : list) {
                if(person == compare){
                    continue;
                }
                if(person.tall < compare.tall && person.weight < compare.weight) {
                    result--;
                    break;
                }
            }
        }
        System.out.println(result);
    }

    static class Person{
        int tall;
        int weight;

        public Person(int tall, int weight) {
            this.tall = tall;
            this.weight = weight;
        }
    }
}
