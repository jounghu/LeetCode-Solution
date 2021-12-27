package com.jeffrey.TwoSumAdd;

/**
 * Created at 2021-12-23
 *
 * @author jeffrey.hu
 **/


public class Solution {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }
        ListNode head = null, tail = null;

        Integer tenFlag = 0;
        while (l1 != null || l2 != null) {

            Integer l1Num = l1 == null ? 0 : l1.val;
            Integer l2Num = l2 == null ? 0 : l2.val;

            Integer sum = (l1Num + l2Num + tenFlag) % 10;

            tenFlag = (l1Num + l2Num + tenFlag) / 10;

            if (head == null) {
                head = tail = new ListNode(sum);
            } else {
                ListNode node = new ListNode(sum);
                tail.next = node;
                tail = node;
            }

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (tenFlag > 0) {
            tail.next = new ListNode(tenFlag);
        }

        return head;
    }

}
