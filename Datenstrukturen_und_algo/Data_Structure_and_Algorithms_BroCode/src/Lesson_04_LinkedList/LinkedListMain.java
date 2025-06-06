package Lesson_04_LinkedList;

import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * LinkedList = 	Stores node in two parts (data + address)
							Nodes are in non-consecutive memory locations
							Elements are linked using pointers
							
							Singly Linked List
        			Node		 	Node		      	Node
			[data | address] -> [data | address] -> [data | address]
			
							Doubly Linked List
	     			Node			    		Node				  			Node
		[address | data | address] <-> [address | data | address] <-> [address | data | address]
		
	Advantages:
		1.	dynamic data structure (allocates needed memory while running)
		2.	insertion and deletion of node is easy. 0(1)
		3.	No/Low memory waste.

	Disadvantages:
		1.	greater memory usage (additional pointer)
		2.	no random access of elements (no index[i])
		3.	accessing/searching elements is more time consuming. O(n)

	Uses:
		1.	implement Stacks/Queues.
		2.	GPS navigation.
		3.	Music Play list.

		 */

		LinkedList<String> linkedList = new LinkedList<>();
		
		/*
		linkedList.push("A");
		linkedList.push("B");
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("F");
		linkedList.pop();
		*/
		
		linkedList.offer("A");
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("F");
//		linkedList.poll();
		
		linkedList.add(4, "E");
		linkedList.remove("E");
		System.out.println(linkedList.indexOf("F"));
		
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		linkedList.addFirst("0");
		linkedList.addLast("G");
		linkedList.removeFirst();
		linkedList.removeLast();
		
		String first = linkedList.removeFirst();
		System.out.println(first);
		
		String last = linkedList.removeLast();
		System.out.println(last);
		
		
		
		
		
		
		
		System.out.println(linkedList);
		
		
		
		
		
		
		

	}

}
