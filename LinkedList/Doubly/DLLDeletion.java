package LinkedList.Doubly;

public class DLLDeletion {
    static class Node {
        int data;
        Node next;
        Node prev;
        Node(int d) {
            data = d;
            next = prev = null;
        }
    }
    Node deleteNode(Node head,int x) {
        if(head==null || head.next==null) return null;
        Node curr=head;
        //1St node delete - just move head to next node
        if(x==1){
            head=curr.next;
        }

        //traverse till the required position
        for(int i=1;i<x;i++){
            curr=curr.next;
        }
        //last node delete - make its prev node's next null
        if(curr.next==null){
            curr.prev.next=null;
            return head;
        }

        //for General
        if(x!=1) {
            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;
        }
        return head;
    }
}
