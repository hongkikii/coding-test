package main.java.codingtest.camp;

import java.util.*;

public class Q5_2 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<progresses.length; i++) {
            int rest = 100-progresses[i];
            int day = rest/speeds[i];
            if(rest % speeds[i] > 0) day++;
            queue.offer(day);
        }

        while(!queue.isEmpty()) {
            int currentDay = queue.poll();
            int value = 1;
            if(queue.isEmpty()) {
                answer.add(value);
                break;
            }
            while(!queue.isEmpty() && queue.peek() <= currentDay) {
                queue.poll();
                value++;
            }
            answer.add(value);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
