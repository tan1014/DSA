class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // Bug 1 fix: edge case check
        if (head == null || head.next == null || k == 0) return head;

        // Find length and tail node
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Bug 2 fix: reduce k to effective rotations
        k = k % length;
        if (k == 0) return head;

        // Make circular
        tail.next = head;

        // Find new tail: (length - k - 1) steps from head
        int stepsToNewTail = length - k - 1;
        ListNode newTail = head;
        for (int i = 0; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}