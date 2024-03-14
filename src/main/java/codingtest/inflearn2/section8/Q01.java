package main.java.codingtest.inflearn2.section8;

import java.util.*;
class Q01 {
    public int solution(int n, int[][] flights, int s, int e, int k){
        int[] cost = new int[n];
        Arrays.fill(cost, Integer.MAX_VALUE);
        List<List<City>> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(new ArrayList<>());
        }
        for(int i=0; i<flights.length; i++) {
            list.get(flights[i][0]).add(new City(flights[i][1], flights[i][2]));
        }
        Queue<City> queue = new LinkedList<>();
        queue.add(new City(s, 0));
        cost[s] = 0;
        int level = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size; i++) {
                City poll = queue.poll();
                int now = poll.end;
                int nowCost = poll.cost;
                for(City c : list.get(now)) {
                    int next = c.end;
                    int nextCost = c.cost;
                    if(nowCost + nextCost < cost[next]) {
                        cost[next] = nowCost + nextCost;
                        queue.add(new City(next, cost[next]));
                    }
                }
            }
            level++;
            if(level > k) break;
        }

        if(cost[e] == Integer.MAX_VALUE) return -1;
        return cost[e];
    }

    class City {
        int end;
        int cost;
        public City(int end, int cost) {
            this.end = end;
            this.cost = cost;
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

