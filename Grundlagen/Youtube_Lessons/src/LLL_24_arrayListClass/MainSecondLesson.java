package LLL_24_arrayListClass;

import java.util.ArrayList;		// import class ArrayList
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;			// import interface List

public class MainSecondLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("list 1 - 7: \n");
//		ArrayList list = new ArrayList();					// ArrayList accepts just Objects, by default there
															// is a capacity of 10 elements
		ArrayList <Integer> list1 = new ArrayList();		// in ArrayList we have more control (Methods, Variables ..etc)
		ArrayList <Integer> list2 = new ArrayList<>();
		ArrayList <Integer> list3 = new ArrayList<Integer>();
		
		List list4 = new ArrayList();						// List accepts just Objects
//		List list4 = new List();					// List is an interface, i can't create an interface from interface
		List<Integer> list5 = new ArrayList();				
		List<Integer> list6 = new ArrayList<>();
		List<Integer> list7 = new ArrayList<Integer>();
		
		list1.add(10);		// adds elements in the same order
		list1.add(20);
		list1.add(30);
		System.out.println("Lists1 = " + list1);
		
		int x = list1.get(1);
		System.out.println("List 1 = " + x);
		
//		int s = list.size();			// i can do it like that
		
		for (int i = 0; i < list1.size(); i++) {
//			System.out.println(list[i]);		// it was like that in the Array but it doesn't work here (Random Access)
			
			System.out.println("list1.get(i): " + list1.get(i));				// Random Access in the ArrayList muss so imolementiert werden 
	
		}

		for(int num : list1) {				// for each
			System.out.println("num: " + num);
		}
		
		System.out.println();
		//////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("list 8: \n");
		
		ArrayList <Integer> list8 = new ArrayList();
		list8.add(10);				// // boolean add(Object obj): fügt obj ein
		list8.add(20);			
		list8.add(30);
		
		

		// 0	1	2	3
		// 1	10	20	30
		
		list8.add(0, 1);	// add  0	1	2	3		// void add(int i, Object obj): fügt obj an der Position i ein.
						// add  1	10	20	30
		
		list8.add(list8.size(), 40);	// 0	1	2	3	add 4	// adjusts the list size then add 40 in the last place
									// 1	10	20	30	add 40
		try {
		list8.add(list8.size() + 1, 50);	// 0	1	2	3	4	5		add 6		passing the 5th place to the sixth
										// 1	10	20	30	40	[ ] 	 	50		adding 50 in the sixth place
											// ---> it will result Exception ( IndexOutOfBoundsException )
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		System.out.println("list8: " + list8);
		
		System.out.println();
		//////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("list9 - 10: \n");
		
		ArrayList <Integer> list9 = new ArrayList<>();
		list9.add(10);
		list9.add(20);
		list9.add(30);
		
		ArrayList <Integer> list10 = new ArrayList<>();
		list10.add(1);
		
		list10.addAll(list9);	// --- addAll(Collection<? extends Integer> c) : add list 9 to list10
		System.out.println("list10 after addAll(1);: " + list10);	// it will give the new list 10: [1, 10, 20, 30]
		
		list10.addAll(Arrays.asList(50,60,70));	// 1 10 20 30 and then asList 50 60 70: adding a list to a existing list
		System.out.println("list10 after addAll(Arrays.asList(50,60,70);: " + list10);
		
		list10.addAll(4,Arrays.asList(40));	//here we will add a number or more in a certain position which is 4th position
											// addAll(Collection<? extends Integer> c): collection is a list
		System.out.println("list10 after addAll(4, Arrays.asList(40);: " + list10);
		
		
		System.out.println();
		////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("list11: \n");
		
		ArrayList <Integer> list11 = new ArrayList();
		list11.add(10);
		list11.add(50);
//			0	1
//			10	50	to add elements after the zero, how could we do that? Answer:
		list11.addAll(1, Arrays.asList(20,30,40));	
//			0	1	2	3	4
//			10	20	30	40	50
		System.out.println("list11.addAll(1, Arrays.asList(20,30,40));: " + list11);
		
		System.out.println();
		//////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("list12 - 15: \n");
		
		ArrayList<Integer> list12 = new ArrayList(Arrays.asList(10, 20, 30)); // copy constructor ArrayList(Collection<? extends E> c)
		System.out.println("new ArrayList(Arrays.asList(10, 20, 30));: " + list12);
		ArrayList<Integer> list13 = new ArrayList(list12);
		System.out.println("new ArrayList(list12);: " + list13);
		System.out.println();
		
		{
		ArrayList<Integer> list14 = new ArrayList(Arrays.asList(60, 70, 80));
		ArrayList<Integer> list15;
		
		ArrayList<Integer> list144 = new ArrayList(Arrays.asList(60, 70, 80));
		ArrayList<Integer> list155= new ArrayList(list144);
		list155 .add(5);
		System.out.println("list155 = new ArrayList(list144);:\n\tand then list155 .add(5);: " + list155);
		System.out.println("list144 = new ArrayList(Arrays.asList(60, 70, 80));: " + list144);
		
		System.out.println();
		
//		list15 = list14.clone();		// an Object can't be converted to ArrayList, it will not work
		list15 = (ArrayList) list14.clone();	//	we will cast list14, copy the list ( Shallow Copy ), it has it's own Address
		list15.add(2);
		
//		list14 = list15;		// both of the lists will have the same address so every adjustment on one of them will effect
								// the other, when we use the clone, then each one of them will have it's own address
							
		
		System.out.println("new ArrayList(Arrays.asList(60, 70, 80));: " + list14);
		System.out.println("list15 = (ArrayList) list14.clone();\n\tand we added a method list15.add(2);: " + list15);
		}
		System.out.println();
		/////////////////////////////////////////////////////////////////
		System.out.println();
//		{
		ArrayList<Integer> list16 = new ArrayList(Arrays.asList(10, 20, 30));
		ArrayList<Integer> list17 = new ArrayList(list16);
		
		list17 = list16;
		// reference copy, if a change is done in a variable here, it will effect the whole series, 
		// it has the same address
		// that is why we use the clone method, because it copies the list in it's own dimension
		list17.add(2);
		
		System.out.println(list16);		// it will effect bith of them
		System.out.println(list17);
//		}
		
		System.out.println();
		
		
		
		ArrayList<Integer> list18 = new ArrayList<>(Arrays.asList(10, 20, 30));
		ArrayList<Integer> list19 = new ArrayList<>(list18);
		list19.add(2);		// it will not effect both because we don't have reference copy
		System.out.println(list18);
		System.out.println("list 9: " + list19);
		
		
		
		
		
		
		
		
		
		

	}

}
