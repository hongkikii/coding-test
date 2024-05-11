package main.java.codingtest.leetcode.graphGeneral;

public class Q200 {
    int rowLength;
    int columnLength;
    public int numIslands(char[][] grid) {
        rowLength = grid.length;
        columnLength = grid[0].length;
        int result = 0;

        for(int i=0; i<rowLength; i++) {
            for(int j=0; j<columnLength; j++) {
                if(grid[i][j] == '1') {
                    result++;
                    DFS(grid, i, j);
                }
            }
        }
        return result;
    }

    private void DFS(char[][] grid, int r, int c) {
        if(r < 0 || c < 0 || r >= rowLength || c >= columnLength || grid[r][c] == '0') return;
        grid[r][c] = '0';
        DFS(grid, r+1, c);
        DFS(grid, r-1, c);
        DFS(grid, r, c+1);
        DFS(grid, r, c-1);
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
