package LinkedList.Medium;

public class Cycle2 {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        // Finding meeting point, This will be LOOP_SIZE - k steps into the linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Collision
                break;
            }
        }

        // No meeting point, therefore no loop
        if (fast == null || fast.next == null) {
            return null;
        }

        // Move slow to head, Keep fast at meeting point.
        // Each are k steps from the loop start.
        // If they move at the same pace, they must meet at loop start
        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // both now point to the start of the loop
        return fast; // return slow
    }
}
