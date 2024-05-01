package main.java.codingtest.leetcode.LinkedLIst;

import java.math.BigInteger;

public class Q2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder node1 = new StringBuilder();
        StringBuilder node2 = new StringBuilder();

        while(l1 != null) {
            node1.append(String.valueOf(l1.val));
            l1 = l1.next;
        }

        while(l2 != null) {
            node2.append(String.valueOf(l2.val));
            l2 = l2.next;
        }

        node1 = node1.reverse();
        node2 = node2.reverse();

        BigInteger node1Num = new BigInteger(node1.toString());
        BigInteger node2Num = new BigInteger(node2.toString());

        BigInteger resultNum = node1Num.add(node2Num);

        if(resultNum.divide(BigInteger.TEN).equals(BigInteger.ZERO)) {
            ListNode result = new ListNode(resultNum.mod(BigInteger.TEN).intValue());
            return result;
        }
        ListNode next = new ListNode();
        ListNode result = new ListNode(resultNum.mod(BigInteger.TEN).intValue(), next);
        resultNum = resultNum.divide(BigInteger.TEN);

        while(true) {
            next.val = resultNum.mod(BigInteger.TEN).intValue();
            resultNum = resultNum.divide(BigInteger.TEN);
            if(resultNum.equals(BigInteger.ZERO)) break;
            ListNode newNode = new ListNode();
            next.next = newNode;
            next = newNode;
        }

        return result;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
