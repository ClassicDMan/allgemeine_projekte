package Lesson_02_Queues;

import java.util.LinkedList;
import java.util.Queue;
//import java.util.Collections;

public class Queues_Lesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Queue = FIFO data structure. First-In-First-Out(ex: a line of people)  --> it is a Linear Data Structure
		 * a collection designed for holding elements prior to processing linear data structure.
		 * 
		 * add = enqueue, offer() 
		 * remove = dequeue, poll()
		 * 
		 */
//																								 Queue is Interface 
		Queue<String> queue = new LinkedList<String>();		// Class Iterable --> Collection --> Queue --> AbstractQueue --> PriorityQueue
															// LinkedList --> Dequeue --> Queue 
															// watch Collections Tree
		System.out.println(queue.isEmpty());
		
		queue.offer("Juan");								// offer = enqueue element to the LinkedList
		queue.offer("Salar");
		queue.offer("Jotar");
		queue.offer("Dler");
		
		System.out.println(queue.peek());					// peek = take a look at the queue
															// (to see who is the first Element in the Queue)
		System.out.println();
		System.out.println(queue.poll());					// return the first element in the Queue
//		queue.poll();										// poll = remove element from the linkedList 
//		queue.poll();										// first in first out
//		queue.poll();
//		queue.poll();
//		queue.poll();									// poll will return here an empty array after polling for four times
//		queue.element();								// element will throw an exception ( NoSuchElementException ) 
		System.out.println();
		
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		System.out.println(queue.contains("Jotar"));		// true, Jotar is there but it will not return the position f the index
		System.out.println(queue.contains("Blend"));		// Blend is not there so it will return false
		System.out.println();
		
		System.out.println(queue);							// print the Elements in queue
		
//		Where are Queues useful?
//				1.	Keyboard buffer (letters should appear on the screen in the order they're pressed), shows the Buffer (what did u pressed)
//				2.	Printer Queues (print jobs should be completed in order), Printer will print first page 1, then page 2 ..etc
//				3.	used in LinkedLists, PriorityQueues, Breadth-first Search

		
		
		
		
	}

}
