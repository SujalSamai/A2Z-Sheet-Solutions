package LinkedList.Medium;

public class DetectCycle {
    class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
    }
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        //if a cycle exists, then definitely slow and fast pointer will meet at certain point
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
