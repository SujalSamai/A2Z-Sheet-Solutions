package LinkedList.Medium;

public class ReverseLL {
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode prev= null;
        ListNode present= head;
        ListNode nextEl= present.next;

        while (present!=null){
            present.next=prev;
            prev=present;
            present=nextEl;
            if(nextEl!=null){
                nextEl=nextEl.next;
            }
        }
        head=prev;
        return head;
    }
}
