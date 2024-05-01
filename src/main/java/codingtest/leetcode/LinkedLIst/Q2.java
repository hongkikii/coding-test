package main.java.codingtest.leetcode.LinkedLIst;

public class Q2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder node1 = new StringBuilder();
        StringBuilder node2 = new StringBuilder();

        while(l1 != null) {
            node1.append(l1.val);
            l1 = l1.next;
        }

        while(l2 != null) {
            node2.append(l2.val);
            l2 = l2.next;
        }

        node1 = node1.reverse();
        node2 = node2.reverse();

        int node1Num = Integer.parseInt(node1.toString());
        int node2Num = Integer.parseInt(node2.toString());

        int resultNum = node1Num + node2Num;

        ListNode next = new ListNode();
        ListNode result = new ListNode(resultNum % 10, next);
        resultNum /= 10;

        while(resultNum != 0) {
            next.val = resultNum % 10;
            ListNode newNode = new ListNode();
            next.next = newNode;
            next = newNode;
            resultNum /= 10;
        }
        return result;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
