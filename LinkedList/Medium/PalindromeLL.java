package LinkedList.Medium;

public class PalindromeLL {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static boolean isPalindrome(ListNode head) {
        ListNode mid=middle(head);
        ListNode headSecond=reverseList(mid);
        while (head!=null && headSecond!=null){
            if(head.val!= headSecond.val){
                return false;
            }
            head=head.next;
            headSecond=headSecond.next;
        }
        return true;
    }

    static ListNode reverseList(ListNode head){
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

    static ListNode middle(ListNode head){
        ListNode fastPointer=head;
        ListNode slowPointer=head;
        int index=0;

        while (fastPointer!=null && fastPointer.next!=null){
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
        }
        return slowPointer;
    }
}
