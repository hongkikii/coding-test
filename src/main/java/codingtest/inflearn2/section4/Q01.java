package main.java.codingtest.inflearn2.section4;

import java.util.Arrays;

class Q01 {
    public int[] solution(int[] nums){
        int[] answer = new int[nums.length];
        Binary[] binarys = new Binary[nums.length];

        for(int i=0; i<nums.length; i++) {
            int tmp = nums[i];
            int count = 0;
            while(tmp >0) {
                int r = tmp % 2;
                if(r == 1) count++;
                tmp /= 2;
            }
            binarys[i] = new Binary(nums[i], count);
        }

        Arrays.sort(binarys);
        for(int i=0; i<nums.length; i++) {
            answer[i] = binarys[i].num;
        }
        return answer;
    }

    public static void main(String[] args){
        Q01 T = new Q01();
        System.out.println(Arrays.toString(T.solution(new int[]{5, 6, 7, 8, 9})));
        System.out.println(Arrays.toString(T.solution(new int[]{5, 4, 3, 2, 1})));
        System.out.println(Arrays.toString(T.solution(new int[]{12, 5, 7, 23, 45, 21, 17})));
    }

    class Binary implements Comparable<Binary> {
        int num;
        int count;
        public Binary(int num, int count) {
            this.num = num;
            this.count = count;
        }
        @Override
        public int compareTo(Binary o) {
            if(this.count == o.count) return this.num - o.num;
            else return this.count - o.count;
        }
    }
}

