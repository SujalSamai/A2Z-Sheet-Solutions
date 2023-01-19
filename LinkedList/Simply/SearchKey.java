package LinkedList.Simply;

public class SearchKey {
    static class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }
    static boolean searchKey(int n, Node head, int key) {
        if(head==null){
            return false;
        }
        if(head.data==key){
            return true;
        }
        Node curr=head;
        for(int i=1; i<n; i++){
            if(curr.data==key) return true;
            curr=curr.next;
        }
        return false;
    }
}
