package ABroCode_01;

import java.util.HashMap;
import java.util.Stack;

public class Stacks_Lesson {

	public static void main(String[] args) {
//		Stack<String> stack = new Stack<>();
//		System.out.println(stack.isEmpty());
//
//		stack.push("1");
//		stack.push("2");
//		stack.push("3");
//		stack.push("4");
//		stack.push("5");
//
//		for (int i = 0; i < stack.size(); i++) {
//
//		}
		int a = 17;
		double b = 9.0;
		int c = 3;
		
		a = c % (int) ( b - 3.0/2.0);
		c = (int)++b;
		System.out.println(!( b >= 9 || a < 8.5));

		System.out.println(a + " ---- " + c);
        		
		
	}

}
