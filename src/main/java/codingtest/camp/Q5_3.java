package main.java.codingtest.camp;

public class Q5_3 {
    public int[] solution(int[] prices) {
        int length = prices.length;
        int[] answer = new int[length];

        for(int i=0; i<length; i++) {
            int currentValue = prices[i];
            int day = length - 1 - i;
            for(int j=i+1; j<length; j++) {
                if(currentValue > prices[j]) {
                    day = j - i;
                    break;
                }
            }
            answer[i] = day;
        }
        return answer;
    }
}
