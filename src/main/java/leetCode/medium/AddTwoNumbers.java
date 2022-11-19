package leetCode.medium;

import java.math.BigDecimal;

public class AddTwoNumbers {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
    }

    //Input: l1 = [2,4,3], l2 = [5,6,4]
    //Output: [7,0,8]
    //Explanation: 342 + 465 = 807.

    private static String reverse(ListNode node) {
        StringBuilder l1String = new StringBuilder();
        while (node != null) {
            var value = node.val;
            l1String.append(value);
            node = node.next;
        }
        return l1String.reverse().toString();
    }

    public static ListNode addTwoNumbersBadSolution(ListNode l1, ListNode l2) {
        var sum1 = new BigDecimal(reverse(l1));
        var sum2 = new BigDecimal(reverse(l2));
        var total = sum1.add(sum2);

        var newStr = new StringBuilder(total.toString()).reverse().toString();

        var reversedStr = newStr.split("");

        ListNode head = null;
        ListNode tail = null;

        for (String s : reversedStr) {
            ListNode node = new ListNode();
            node.val = Integer.parseInt(s);

            if (head == null) {
                head = node;
            } else {
                tail.next = node;
            }
            tail = node;
        }
        return head;
    }

    public static ListNode addTwoNumbersGoodSolution(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return dummyHead.next;
    }


    public static void main(String[] args) {

        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;

        ListNode x = new ListNode(5);
        ListNode y = new ListNode(6);
        ListNode z = new ListNode(4);
        x.next = y;
        y.next = z;

        var goodSolution = addTwoNumbersGoodSolution(a, x);
        var badSolution = addTwoNumbersBadSolution(a, x);

        System.out.println(goodSolution);
        System.out.println(badSolution);

    }
}