package LinkedList.Simply;

public class Insertion {
    static class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }
    Node insertAtBeginning(Node head, int x){
        Node newNode=new Node(x);
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
        return head;
    }

    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x){
        Node newNode=new Node(x);
        if(head==null){
            head=newNode;
            return head;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }
}
