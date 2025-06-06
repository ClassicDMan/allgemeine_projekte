package Lesson_03_PriorityQueues;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Priority Queue = A FIFO data structure that serves elements
				 with the highest priorities first before elements with lower priority
		*/
		
		Queue<Double> queue1 = new PriorityQueue<>(Collections.reverseOrder());
//		Queue<Double> queue1 = new PriorityQueue<>();
		Queue<Double> queue2 = new LinkedList<>();
		
		Queue<String> queue3 = new PriorityQueue<>();	// try with Collections.reverseOrder() a Comparator as a Parameter(see PriorityQueue doc)
		queue1.offer(3.0);
		queue1.offer(2.5);
		queue1.offer(4.0);
		queue1.offer(1.5);
		queue1.offer(2.0);
		
		queue2.offer(3.0);
		queue2.offer(2.5);
		queue2.offer(4.0);
		queue2.offer(1.5);
		queue2.offer(2.0);
		
		queue3.offer("C");
		queue3.offer("B");
		queue3.offer("A");
		queue3.offer("E");
		queue3.offer("D");
		
		
		while(!queue1.isEmpty()) {
			System.out.println(queue1.poll());
		}
		System.out.println();
		while(!queue2.isEmpty()) {
			System.out.println(queue2.poll());
		}
		System.out.println();
		while(!queue3.isEmpty()) {
			System.out.println(queue3.poll());
		}
	

		

	}

}
