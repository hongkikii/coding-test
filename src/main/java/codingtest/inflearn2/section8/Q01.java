package main.java.codingtest.inflearn2.section8;

import java.util.*;
class Q01 {
    int min;
    int tmp;
    int end;
    int loop;
    boolean[] check;
    int[][] copyFlights;

    public int solution(int n, int[][] flights, int s, int e, int k){
        copyFlights = flights;
        end = e;
        loop = k;
        check = new boolean[n];
        min = Integer.MAX_VALUE;
        tmp = Integer.MAX_VALUE;
        DFS(s, 0,-1);
        if(min == Integer.MAX_VALUE) return -1;
        return min;
    }

    public void DFS(int idx, int sum, int level) {
        if(idx == end) {
            tmp = sum;
            return;
        }
        if(level == loop)  {
            tmp = Integer.MAX_VALUE;
        }
        else {
            for(int i=0; i<copyFlights.length; i++) {
                if(copyFlights[i][0] == idx) {
                    if (!check[copyFlights[i][1]]) {
                        check[copyFlights[i][1]] = true;
                        DFS(copyFlights[i][1], sum + copyFlights[i][2], level + 1);
                        min = Math.min(min, tmp);
                        check[copyFlights[i][1]] = false;
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        Q01 T = new Q01();
        System.out.println(T.solution(5, new int[][]{{0, 1, 10}, {1, 2, 20}, {0, 2, 70}, {0, 3, 100}, {1, 3, 80}, {2, 3, 10}, {2, 4, 30}, {3, 4, 10}}, 0, 3, 1));
        System.out.println(T.solution(4, new int[][]{{0, 1, 10}, {0, 2, 10}, {1, 3, 5}, {2, 3, 3}}, 0, 3, 0));
        System.out.println(T.solution(8, new int[][]{{0, 3, 10}, {1, 5, 10}, {1, 7, 100}, {0, 1, 10}, {0, 2, 10}, {5, 7, 30}, {3, 7, 10}, {1, 3, 5}, {2, 3, 3}}, 1, 7, 2));
        System.out.println(T.solution(10, new int[][]{{1, 8, 50}, {0, 8, 30}, {1, 0, 10}, {2, 8, 10}, {0, 3, 10}, {1, 5, 10}, {1, 7, 100}, {0, 1, 10}, {0, 2, 10}, {5, 7, 30}, {3, 7, 10}, {1, 3, 5}, {2, 3, 3}}, 1, 8, 2));
        System.out.println(T.solution(4, new int[][]{{0, 3, 59},{2, 0, 83}, {3, 1, 16}, {1, 3, 16}}, 3, 0, 3));
    }
}
