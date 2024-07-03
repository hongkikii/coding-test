package main.java.codingtest.camp;

public class Q6_1 {
    public boolean solution(String[] phone_book) {
        for(int i=0; i<phone_book.length; i++) {
            for(int j=i+1; j<phone_book.length; j++) {
                if(i == j) continue;
                if(phone_book[j].startsWith(phone_book[i])) return false;
                if(phone_book[i].startsWith(phone_book[j])) return false;
            }
        }
        return true;
    }
}
