package projekts;

import java.util.Stack;

import javax.annotation.processing.AbstractProcessor;

public class StacksAndQueue_Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> tower = new Stack<String>();
		
		tower.add("Red");
		tower.add("Blue");
		tower.add("Yellow");
		tower.add("Purple");
		tower.add("Black");
		
		System.out.println("what's on the top? " + tower.peek());			// what is on top of the Stack
		System.out.println("take out the item on the top : " + tower.pop());			// it picks the object on the top, off the equation
//		tower.pop();		// u could use all the inventory in a print statement or solo (like that or like up there)
		System.out.println("push green on the top of the tower : " + tower.push("Green"));	// it pushes a new item on the top of the stack
//		tower.push("Green");			// another example
//		so we have now the following tower from the bottom to the top: 5 Colors( Red Blue Yellow Purple Green )
		System.out.println("what is the size of the tower: " + tower.size());			// it returns the number of components in the vector
		System.out.println(tower);
		System.out.println("is the tower empty ? " + tower.empty());			// it looks if the vector is empty or not, so here it is false
		System.out.println("does it contains the color Brown? " + tower.contains("Brown"));//it looks if it contains this Color
		System.out.println("does it contains the color Red? " + tower.contains("Red"));
		System.out.println("the capacity of the data array(it is 10 by default) : " + tower.capacity());		// it gives the capacity of the data Array, by default it is 10
		System.out.println();
		System.out.println(tower);
		System.out.println("take the item the place number 1 and change it with Black again : " + tower.set(1,"Black"));
		System.out.println("Blue is out and now is it black ? : " + tower.get(1));
		System.out.println(tower);
		
		
		
		
		System.out.println();
		Stack<Character> Alphabets = new Stack<Character>();	// we can make stacks of the all data types here
		Alphabets.add('A');
		Alphabets.add('B');
		Alphabets.add('C');
		Alphabets.add('D');
		Alphabets.add('E');
		
		System.out.println(Alphabets.contains('O'));		
		System.out.println(Alphabets.contains('A'));
		
		

	}

}
