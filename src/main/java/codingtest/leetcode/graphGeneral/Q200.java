package main.java.codingtest.leetcode.graphGeneral;

import java.util.LinkedList;
import java.util.Queue;

public class Q200 {
    public int numIslands(char[][] grid) {
        int rowLength = grid.length;
        int columnLength = grid[0].length;
        int result = 0;

        Queue<Point> queue = new LinkedList<>();
        for(int i=0; i<rowLength; i++) {
            for(int j=0; j<columnLength; j++) {
                if(grid[i][j] == '1') {
                    queue.add(new Point(i, j));
                    while(!queue.isEmpty()) {
                        Point point = queue.poll();
                        int x = point.x;
                        int y = point.y;
                        if(x<0 || y<0 || x>=rowLength || y>=columnLength || grid[x][y] == '0') {
                            continue;
                        }
                        grid[x][y] = '0';
                        queue.add(new Point(x+1, y));
                        queue.add(new Point(x-1, y));
                        queue.add(new Point(x, y+1));
                        queue.add(new Point(x, y-1));
                    }
                    result++;
                }
            }
        }
        return result;
    }

    class Point {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
