package main.java.codingtest.leetcode.bitManipulation;

public class Q67 {
    public String addBinary(String a, String b) {
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        int aInt = toInt(aChars);
        int bInt = toInt(bChars);
        int sum = aInt + bInt;
        return toBinaryString(sum);
    }

    private int toInt(char[] binaryCharArray) {
        int digit = 1;
        int result = 0;
        for(int i=binaryCharArray.length-1; i>=0; i--) {
            result += (binaryCharArray[i] - 48) * digit;
            digit *= 2;
        }
        return result;
    }

    private String toBinaryString(int num) {
        if(num == 0) return String.valueOf(0);
        StringBuilder sb = new StringBuilder();
        while(num > 0) {
            sb.append(String.valueOf(num%2));
            num /= 2;
        }
        return sb.reverse().toString();
    }
}
