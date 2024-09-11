package main.java.codingtest.inflearn2.section1;

import java.util.HashMap;
import java.util.Map;

public class Q07 {
    public int solution(int[] keypad, String password){
        int answer = 0;
        int currentX = 1;
        int currentY = 1;
        Map<Integer, Location> map = new HashMap<>();

        for (int value : keypad) {
            map.put(value, new Location(currentX, currentY));
            if (currentX % 3 == 0) {
                currentX = 1;
                currentY++;
            }
            else {
                currentX++;
            }
        }

        char[] numbers = password.toCharArray();
        Location location = map.get(numbers[0] - 48);
        currentX = location.x;
        currentY = location.y;

        for(int i=1; i<numbers.length; i++){
            Location nextLocation = map.get(numbers[i] - 48);
            if (nextLocation.x == currentX && nextLocation.y == currentY) {
                continue;
            }
            if(Math.abs(nextLocation.x - currentX) <= 1 && Math.abs(nextLocation.y - currentY) <= 1){
                answer++;
            }
            else {
                answer += 2;
            }
            currentX = nextLocation.x;
            currentY = nextLocation.y;
        }
        return answer;
    }

    static class Location {
        public int x;
        public int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args){
        Q07 T = new Q07();
        System.out.println(T.solution(new int[]{2, 5, 3, 7, 1, 6, 4, 9, 8}, "7596218"));
        System.out.println(T.solution(new int[]{1, 5, 7, 3, 2, 8, 9, 4, 6}, "63855526592"));
        System.out.println(T.solution(new int[]{2, 9, 3, 7, 8, 6, 4, 5, 1}, "323254677"));
        System.out.println(T.solution(new int[]{1, 6, 7, 3, 8, 9, 4, 5, 2}, "3337772122"));
    }
}
