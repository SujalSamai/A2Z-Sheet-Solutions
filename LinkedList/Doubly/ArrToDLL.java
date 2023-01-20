package LinkedList.Doubly;

public class ArrToDLL {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int x) {
            data = x;
            next = null;
            prev= null;
        }
    }
    Node constructDLL(int arr[]) {
        Node head=null;
        Node last=null;
        for (int i=0; i<arr.length; i++){
            if(head==null){
                head=new Node(arr[i]);
                head.prev=null;
                head.next=null;
                last=head;
            }else{
                last.next=new Node(arr[i]);
                last.next.prev=last;
                last=last.next;
            }
        }
        return head;
    }
}
