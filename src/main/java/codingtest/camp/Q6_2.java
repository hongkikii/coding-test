package main.java.codingtest.camp;

public class Q6_2 {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        for(char c : s.toLowerCase().toCharArray()) {
            if(c == 'p') pCount++;
            if(c == 'y') yCount++;
        }

        if(pCount == yCount) return true;
        return false;
    }
}
