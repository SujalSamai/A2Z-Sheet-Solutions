package Stacks.Basics;

public class StackUsingLL {
     static class StackNode {
         int data;
         StackNode next;
         StackNode(int a) {
             data = a;
             next = null;
         }
     }
    StackNode top;

    //Function to push an integer into the stack.
    void push(int a) {
        StackNode newNode=new StackNode(a);
        if (top != null) {
            newNode.next = top;
        }
        top=newNode;
    }

    //Function to remove an item from top of the stack.
    int pop() {
        if(top==null) return -1;
        StackNode temp=top;
        top=top.next;
        return temp.data;
    }

}
