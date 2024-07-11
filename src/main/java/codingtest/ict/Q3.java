package main.java.codingtest.ict;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static List<String> doesCircleExist(List<String> commands) {
        List<String> answer = new ArrayList<>();
        int x = 0;
        int y = 0;
        int d = 0; // 0 : 북, 1: 동, 2: 남, 3: 서
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int loop = 4;

        for(String command : commands) {
            for(int i=0; i<loop; i++) {
                for(char move : command.toCharArray()) {
                    if(move == 'G') {
                        x += dx[d];
                        y += dy[d];
                    }
                    if(move == 'L') {
                        d = (d+3) % 4;
                    }
                    if(move == 'R') {
                        d = (d+1) % 4;
                    }
                }
            }
            if(x == 0 && y == 0) {
                answer.add("YES");
            }
            else {
                answer.add("NO");
            }
            x = 0; y = 0; d = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("G");
        input.add("L");
        input.add("RGRG");
        List<String> strings = doesCircleExist(input);
        System.out.println(strings);
    }
}
