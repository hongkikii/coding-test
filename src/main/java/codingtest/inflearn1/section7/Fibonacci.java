package main.java.codingtest.inflearn1.section7;

public class Fibonacci {
    static int count = 1;
    public static void main(String[] args) {
        fibo(5);
    }

    public static int fibo(int n) {
        System.out.println(count + " : " + n);
        if(n == 1) {
            count++;
            return 1;
        }
        else if (n == 2){
            count++;
            return 1;
        }
        else {
            count++;
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    /**
     * 1 : 5
     * 2 : 4
     * 3 : 3
     * 4 : 2
     * 5 : 1
     * 6 : 2
     * 7 : 3
     * 8 : 2
     * 9 : 1
     */
}
