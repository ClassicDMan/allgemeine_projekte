package LLL_24_arrayListClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainFourthLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list1 = new ArrayList(Arrays.asList(10, 20, 30, 40));
		
		System.out.println(list1.contains(10));		// does it contains 10	true
		System.out.println(list1.contains(50));		// does it contains 50	false
		
		////////////////////////////////////////////////////////////////////
		
		ArrayList list2 = new ArrayList(Arrays.asList(1, 2));
		
		ArrayList list3 = new ArrayList(Arrays.asList(1, 1, 1, 2, 2, 3, 4));
		
//		list3.retainAll(list2);			// save the elements that exists in list1 in list 2
//		System.out.println(list3);		// print them
		
//		list3.retainAll(Arrays.asList(0, 3, -1));
//		System.out.println(list3);
		
		list3.retainAll(Collections.singleton(2));		// if there is elemeents that matches the number 2,
														// save them in list3
			
		System.out.println(list3);
		
		//////////////////////////////////////////////////////////
//													// 0  1  2  3  4  5  6  7
		ArrayList list4 = new ArrayList(Arrays.asList(10,20,30,40,50,60,70,80));
		ArrayList list5 = new ArrayList(list4.subList(0, 3));	// from 0 --> before third index
		
		System.out.println(list5);	// print index from .. to ... in subList methode of a list
		
		//////////////////////////////////////////////////////////////
		
		ArrayList list6 = new ArrayList(Arrays.asList(10,20,30,40,50,60,70,80));
		list6.isEmpty();	// true
//		list6.clear();
		
		System.out.println(list6);
		
		////////////////////////////////////////////////////////////////

		ArrayList list7 = new ArrayList(200);
//		list7.ensureCapacity(1000);	// list7 will have 150 places reserved
									// if u remember by default the ArrayList was 10, here will adjust it at 150
									// during the run, it could be that u need methods withen the run time
		list7.trimToSize();	// shrank the size of the Array th the actual used capacity, it will tirm the size of the array
		
		////////////////////////////////////////////////////////////////
		
		ArrayList list8 = new ArrayList(Arrays.asList(10,20,30,40,50,60,70,80));
		
		list8.forEach(el -> System.out.println(el + " - "));
		
		////////////////////////////////////////////////////////////////
		
		ArrayList list9 = new ArrayList(Arrays.asList(20,10,30,50,40,30,70,60));
		
//		Collections.sort(list9);
//		Collections.sort(list9, Collections.reverseOrder());
//		Collections.reverse(list9);
//		System.out.println(list9);
		
		System.out.println(Collections.min(list9));
		System.out.println(Collections.max(list9));
		
		
		
		
		////////////////////////////////////////////////////////////////
		
//		Ex 1 : Create a list of distinct elements taken from the user, and print this elements ?

//		ArrayList<Integer> list = new ArrayList();
//		
//		Scanner in = new Scanner(System.in);
//		
//		for (int i = 0; i < 5; i++) {	// 1 
//			
//			int temp = in.nextInt();
//			if(!list.contains(temp))
//			list.add(temp);
//		}
//		System.out.println(list);
		
		////////////////////////////////////////////////////////////////
		
//		EX 2: 	create a menu Program with the following Options :
//			 	1 Add Element
//				2 Remove Element
//				3 Print Element
//				4 Exit

		ArrayList<Integer> list = new ArrayList();

		Scanner in = new Scanner(System.in);

		while (true) {
			displayMenu();

			int choice = in.nextInt();

			switch (choice) {
			case 1:
				// Add
				System.out.println("Enter an Integer : ");
				list.add(in.nextInt());
				System.out.println("Element added");
				break;

			case 2:
				// Remove
				System.out.println("Enter a Number to be deleted : ");
				int element = in.nextInt();
				if (list.contains(element)) {
					list.remove((Integer) element);
					System.out.println("Element removed");

				} else
					System.out.println("Element not found");
				break;

			case 3:
				// Print
				System.out.println(list);
				break;

			case 4:
				// Exit
				return;

			}

		}

	}

	static void displayMenu() {
		System.out.println();
		System.out.println("1. Add Element \n" + "2. Remove Element \n" + "3. Print Element \n" + "4. Exit");
		System.out.println();

	}

}
