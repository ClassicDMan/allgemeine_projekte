package LLL_24_arrayListClass;

import java.util.ArrayList;	// --> ArrayList
import java.util.List;		// --> Lsit

public class MainFirstLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		i can define an Array List in two ways: ArrayList or List, each one of them has methods we can use in our Program
		ArrayList <String> list = new ArrayList(25);	// it depends which methods i want to use
		System.out.println(list);
		list.add("Serbest Salim");
		list.add("Dara salim");
		list.add("Nader Salim");
		System.out.println(list);
		ArrayList<Integer> list1 = new ArrayList();

		List list2 = new ArrayList();		// it depends which methods i want to use
		
//		Lsit list3 = new Lsit();			// it doesn't work because List is an interface, 
											// and interface can#t create instances or Objects
		
		
		/*				ArrayList functions
		 * 		- no limits
		 * 		- Automatically adjust its capacity when we add or remove elements from it.
		 * 
		 * 		is the ArrayList the best data structure ?
		 * 
		 * 		- Access	yes		in array	list[0]--> will take 1 second to get the first element in the array
		 * 									list[1000] --> will also take 1 second to get the first element in the array
		 * 									because we r dealing with Arrays
		 * 									
		 * 		- Add, Remove	no		it takes time to remove and add with the shifting process
		 * 								therefore there is another data structure called
		 * 					LinkedList is best data structure for:
		 * 
		 * 			- Access	no
		 * 			- Add, Remove 	yes	
		 */
		
	}

}
