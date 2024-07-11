package main.java.codingtest.ict;

import java.util.List;

public class Q5 {
//    public static int largestSubgrid(List<List<Integer>> grid, int maxSum) {
//        int row = grid.size();
//        int col = grid.get(0).size();
//        int[][] dp = new int[row][col];
//
//        int answer = 0;
//
//        for(int i=0; i<row; i++) {
//            dp[i][0] = grid.get(i).get(0) <= maxSum? 1:0;
//            answer = Math.max(answer, dp[i][0]);
//            dp[0][i] = grid.get(0).get(i) <= maxSum? 1:0;
//            answer = Math.max(answer, dp[0][i]);
//        }
//
//        for(int i=1; i<row; i++) {
//            for(int j=1; j<col; j++) {
//                if(grid.get(i).get(j) <= maxSum) {
//                    dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1])) + 1;
//                    int sum = 0;
//                    for(int k=0; k<dp[i][j]; k++) {
//                        for(int l = 0; l <dp[i][j]; l++) {
//                            sum += grid.get(i-k).get(j-l);
//                        }
//                    }
//                    if(sum > maxSum) dp[i][j]--;
//                    answer = Math.max(answer, dp[i][j]);
//                }
//            }
//        }
//        return answer;
//    }

    public static int largestSubgrid(List<List<Integer>> grid, int maxSum) {
        int n = grid.size();
        int[][] prefixSum = new int[n+1][n+1];

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                prefixSum[i][j] = prefixSum[i-1][j] + prefixSum[i][j-1] - prefixSum[i-1][j-1] + grid.get(i-1).get(j-1);
            }
        }

        int l = 0;
        int r = n;
        while(l <= r) {
            int mid = l + (r-l) / 2;
            if(isValid(prefixSum, mid, maxSum)) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return r;
    }

    private static boolean isValid(int[][] prefixSum, int size, int maxSum) {
        int n = prefixSum.length - 1;
        for(int i=size; i<=n; i++) {
            for(int j=size; j<=n; j++) {
                int sum = prefixSum[i][j] - prefixSum[i-size][j] - prefixSum[i][j-size] + prefixSum[i-size][j-size];
                if(sum > maxSum) {
                    return false;
                }
            }
        }
        return true;
    }
}
