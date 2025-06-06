package projekts;

import java.util.LinkedList;
import java.util.Queue;

public class StacksAndQueue_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Queue<String> bbqLine = new LinkedList<String>(); 
		
		bbqLine.add("Jackson");
		bbqLine.add("Juan");
		bbqLine.add("Susan");
		
		System.out.println(bbqLine);
		System.out.println();
		
		System.out.println(bbqLine.poll());
//		bbqLine.poll();
		System.out.println(bbqLine);
		System.out.println(bbqLine.peek());
		System.out.println();
		
		
		
		Queue<String> q = new LinkedList<String>(); 
		
		q.add("A");
		q.add("B");
		q.add("C");
		
		
		System.out.println(q.toArray()[1]);	// returns the contain of an array in a specific place
		
//		 the same principles of the Stack ------ have a good day
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
