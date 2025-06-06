package Lesson_01_Stacks;
import java.util.Iterator;
import java.util.Stack;

public class Stacks_Lesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Stack = LIFO Datenstruktur. Last In First Out
				it stores Objects into a sort of "vertical Tower"
				push() to add to the Top
				pop() to remove from the Top
		*/
		
		Stack <String> stack = new Stack <String>();
		
		System.out.println(stack.isEmpty());				// true
		
		stack.push("One");
		stack.push("Two");
		stack.push("Three");
		stack.push("Four");
		
		System.out.println(stack.toString());				// print the whole Array
		for (String test : stack) {							// ürint them in a for each loop
			System.out.println(test);
		}
		System.out.println();
				
		System.out.println(stack.peek());					// Four
//		stack.pop();										// pop the Element Four from the Stack, the last one
															// when u pop an Empty Stack it will throw an EmptyStack Exception
		
		String myNumber = stack.pop();						// remove the last Element from the Stack and assign it to a String
		
		System.out.println(stack.peek());					// peek to see what is the last Element
		System.out.println();
		System.out.println(stack.search(myNumber));			// Flase = -1
		System.out.println(stack.search("Three"));			// True = 1
		System.out.println();
		
		System.out.println(stack.isEmpty());				// False
		stack.push("pushed Element");
		
		for(String test : stack) {
			System.out.print(test + ", ");
			
		}
		
//		for(int i = 0; i < 1000000000; i++) {				// main" java.lang.OutOfMemoryError: Java heap space
//			stack.push("Fallout76");
//		}
		
//		uses of stacks?
//		1. undo/redo features in text editors
//		2. moving back/forward through browser history
//		3. backtracking algorithms (maze, file directories)
//		4. calling functions(call stack)
		
		
		
		
	}

}
