package LinkedList.Medium;

public class Middle {
    static public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //till fast reaches the end, slow will be able to only reach the middle
        return slow;
    }
}
