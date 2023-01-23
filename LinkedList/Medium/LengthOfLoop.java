package LinkedList.Medium;

public class LengthOfLoop {
    class Node {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    static int countNodesinLoop(Node head) {
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return counting(slow);
            }
        }
        return 0;
    }

    private static int counting(Node curNode) {
        int c=1;
        Node temp=curNode;
        while (temp.next!=curNode){
            c++;
            temp=temp.next;
        }
        return c;
    }
}
