package main.java.codingtest.leetcode.bitManipulation;

public class Q67 {
    public String addBinary(String a, String b) {
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        long aNum = toNumber(aChars);
        long bNum = toNumber(bChars);
        long sum = aNum + bNum;
        return toBinaryString(sum);
    }

    private long toNumber(char[] binaryCharArray) {
        long digit = 1;
        long result = 0;
        for(int i=binaryCharArray.length-1; i>=0; i--) {
            result += (binaryCharArray[i] - 48) * digit;
            digit *= 2;
        }
        return result;
    }

    private String toBinaryString(long num) {
        if(num == 0) return String.valueOf(0);
        StringBuilder sb = new StringBuilder();
        while(num > 0) {
            sb.append(String.valueOf(num%2));
            num /= 2;
        }
        return sb.reverse().toString();
    }
}
