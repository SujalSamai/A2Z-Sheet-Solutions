package LinkedList.Simply;

public class ArrToLL {
    static class Node {
        int data;
        Node next;

        Node() { data = 0; }
        Node(int d) { data = d; }  //constructor to create a new node
    }
    static Node constructLL(int arr[]) {
        Node head=null;
        Node last=null;
        for(int i=0; i<arr.length; i++){
            if(head==null){
                head= new Node(arr[i]);
                last=head;
            }else{
                last.next= new Node(arr[i]);
                last=last.next;
            }
        }
        return head;
    }
}
