package main.java.codingtest.inflearn2.section8;

import java.util.*;

// map : 키 - 역, 값 - 호선
// queue add => 역 다 집어넣기(한 호선 다 간거니), 방문한 호선 체크
class Q02 {
    public int solution(int[][] routes, int s, int e){
        Map<Integer, Set<Integer>> map = new HashMap<>();
        boolean[] check = new boolean[routes.length];
        for(int i=0; i<routes.length; i++) {
            for(int x : routes[i]) {
                map.putIfAbsent(x, new HashSet<>());
                map.get(x).add(i);
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        int level = 0;
        queue.add(s);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size; i++) {
                int poll = queue.poll();
                for (int line : map.get(poll)) {
                    if(check[line]) continue;
                    check[line] = true;
                    for (int stop : routes[line]) {
                        if(stop == e) return level;
                        queue.add(stop);
                    }
                }
            }
            level++;
        }

        return -1;
    }

    public static void main(String[] args){
        Q02 T = new Q02();
        System.out.println(T.solution(new int[][]{{1, 2, 3, 4, 5, 6, 19}, {2, 7, 8, 13}, {5, 9, 10}, {9, 11, 12, 18}, {13, 14, 15}, {14, 12, 16, 17}}, 1, 12));
        System.out.println(T.solution(new int[][]{{1, 3, 5, 7}, {9, 3, 12}, {6, 5, 8}, {2, 8, 14, 15}, {2, 14, 16}}, 1, 14));
        System.out.println(T.solution(new int[][]{{7, 12},{5, 19},{7, 19},{9, 12, 13},{9, 5, 15}}, 9, 19));
        System.out.println(T.solution(new int[][]{{1, 2, 3, 4, 5},{9, 7, 10},{7, 6, 3, 8}, {5, 11, 8, 12}}, 1, 10));
    }
}

