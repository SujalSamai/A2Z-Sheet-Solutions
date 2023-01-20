package LinkedList.Doubly;

public class ReverseDLL {
    static class Node {
        int data;
        Node next, prev;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node reverseDLL(Node  head) {
        if(head.next == null)return head;
        Node temp=null;
        Node curr=head;
        /* swap next and prev for all nodes of doubly linked list */
        while (curr!=null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;
        }

        if(temp!=null) head=temp.prev;
        return head;
    }
}
