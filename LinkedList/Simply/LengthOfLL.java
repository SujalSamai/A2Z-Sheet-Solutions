package LinkedList.Simply;

public class LengthOfLL {
    static class Node{
        int data;
        Node next;
        Node(int a){  data = a; next = null; }
    }
    public static int getCount(Node head) {
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}
