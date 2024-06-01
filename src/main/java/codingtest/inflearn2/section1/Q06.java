package main.java.codingtest.inflearn2.section1;

class Q06 {
    public int solution(int[][] fruit) {
        int answer = 0;
        int studentNum = fruit.length;
        boolean[] isTranslated = new boolean[studentNum];
        int[][] minFruits = new int[studentNum][2];
        for (int i = 0; i < studentNum; i++) {
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for (int j = 0; j < 3; j++) {
                if (min > fruit[i][j]) {
                    min = fruit[i][j];
                    idx = j;
                }
            }
            minFruits[i][0] = idx;
            minFruits[i][1] = min;
        }
        for (int i = 0; i < studentNum - 1; i++) {
            if (!isTranslated[i]) {
                for (int j = i + 1; j < studentNum; j++) {
                    if(!isTranslated[j]) {
                        int iIdx = minFruits[i][0];
                        int jIdx = minFruits[j][0];
                        if (iIdx != jIdx && fruit[i][jIdx] > 0 && fruit[j][iIdx] > 0) {
                            if(minFruits[i][1]+1 < fruit[i][jIdx] && minFruits[j][1]+1 < fruit[j][iIdx]) {
                                minFruits[i][1] += 1;
                                minFruits[j][1] += 1;
                                isTranslated[i] = true;
                                isTranslated[j] = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < studentNum; i++) {
            answer += minFruits[i][1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Q06 T = new Q06();
        System.out.println(
                T.solution(new int[][]{{10, 20, 30}, {12, 15, 20}, {20, 12, 15}, {15, 20, 10}, {10, 15, 10}}));
        System.out.println(
                T.solution(new int[][]{{10, 9, 11}, {15, 20, 25}}));
        System.out.println(
                T.solution(new int[][]{{0, 3, 27}, {20, 5, 5}, {19, 5, 6}, {10, 10, 10}, {15, 10, 5}, {3, 7, 20}}));
        System.out.println(
                T.solution(new int[][]{{3, 7, 20}, {10, 15, 5}, {19, 5, 6}, {10, 10, 10}, {15, 10, 5}, {3, 7, 20}, {12, 12, 6}, {10, 20, 0}, {5, 10, 15}}));
    }
}
