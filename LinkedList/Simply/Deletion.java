package LinkedList.Simply;

public class Deletion {
    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
//    public void deleteNode(ListNode node) {
//        node.val=node.next.val;
//        node.next= node.next.next;
//    }
    Node deleteNode(Node head, int x) {
        if(head==null || head.next==null) return null;
        Node temp=head;
        if(x==1){
            return head=temp.next;
        }
        for (int i = 1; i < x-1; i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}
