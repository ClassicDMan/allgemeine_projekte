package ABroCode_01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class UserLinkedList{
	Node head;
	
	void printLinkedList() {
		Node curr = this.head;
		while(curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	
}

public class Linked_Lists_Lesson {
	
//	static void printLinkedList(Node head) {
//		Node curr = head;
//		while(curr != null) {
//			System.out.println(curr.data);
//			curr = curr.next;
//		}
//	}
	
	public static void main(String[] args) {
		
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.push("A");
		linkedList.push("B");
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("F");
		// Last in First out
		linkedList.pop();			// removes the last Element added in the List, First Element in the List (LIFO)
		
		System.out.println(linkedList);
		
		UserLinkedList l1 = new UserLinkedList();
		
		Node p1 = new Node(10);
		Node p2 = new Node(20);
		Node p3 = new Node(30);
		Node p4 = new Node(40);
		
		System.out.println(p1.next);
		p1.next = p2;
		p2.next = p3;
		p3.next = p4;
		System.out.println();
		
		l1.head = p1;
		l1.printLinkedList();
		

		
		
		
		
		
		
		
		
		
	}

}
