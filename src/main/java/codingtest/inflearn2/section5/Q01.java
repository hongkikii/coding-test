package main.java.codingtest.inflearn2.section5;

import java.util.Arrays;

class Q01 {
    public int solution(int[] nums, int m){
        int answer = 0;
        // 오름차순 정렬
        // left - right 가능?
        // ㅇㅇ => answer++; left++, right–
        // ㄴㄴ => answer++; right–
        // 언제까지 ? left<=right
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length -1;
        while(left< right)  {
            if(nums[left]+nums[right] <= m) {
                left++;
            }
            answer++;
            right--;
        }
        if(left == right) {
            answer++;
        }
        return answer;
    }

    public static void main(String[] args){
        Q01 T = new Q01();
        System.out.println(T.solution(new int[]{90, 50, 70, 100, 60}, 140));
        System.out.println(T.solution(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90}, 100));
        System.out.println(T.solution(new int[]{68, 72, 30, 105, 55, 115, 36, 67, 119, 111, 95, 24, 25, 80, 55, 85, 75, 83, 21, 81}, 120));
    }
}

