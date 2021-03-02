package com.demo;

import java.util.HashSet;
import java.util.Stack;
class Node{
	int data;
	Node next;
}

public class RemoveLoop {
	
	public static void removeLoop(Node head){
        // code here
        HashSet<Node> hm = new HashSet<>();
        Stack<Node> st = new Stack<>();
        hm.add(head);
        while(head!=null){
            
            if(hm.contains(head.next)) {
                head.next=null;
                break;
            }
            else{
                hm.add(head.next);
                head = head.next;
            }
        }
        
    }

}
