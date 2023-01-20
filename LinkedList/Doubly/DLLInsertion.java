package LinkedList.Doubly;

public class DLLInsertion {
    static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
            next = prev = null;
        }
    }

    static void addNode(Node head_ref, int pos, int data) {
        Node temp=head_ref;
        Node newNode=new Node(data);
        if(head_ref==null){
            head_ref=newNode;
            return;
        }
        for (int i=0; i<pos; i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        newNode.prev=temp;
        temp.next=newNode;
    }
}
