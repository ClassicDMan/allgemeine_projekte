package LLL_24_arrayListClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainThirdLesson extends ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("List1: ");
		
		ArrayList<Integer> list1 = new ArrayList(Arrays.asList(10, 20, 30));
		System.out.println("list1.get(0): " + list1.get(0));
		list1.set(0, 66);		// Override set( index, element)
		System.out.println("list1.set(index 0, element 66);: get(0) " + list1.get(0));
		
		System.out.println();
		///////////////////////////////////////////////
		System.out.println("List2 - 3: ");
		
		ArrayList<Integer> list2 = new ArrayList(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
		
		list2.remove(0);		// delete 10 and after that if
//		list2.remove(0);		// it will delete the new element in index 0
		list2.remove(1);		// delete 30
//		list2.remove(2);
		System.out.println("list2 after removing mprocess (1): " + list2);
		
//		list2.remove(10);		//it doesn't work, Exception IndexOutOfBoundException, it doesn't work like that by value,
				// 	 10 is not an Object
		//there r three methods to remove by value
		
		list2.remove(new Integer(50));		// Objectt Typ
		list2.remove((Integer)60);			// Casting
		list2.remove(Integer.valueOf(7));	// valueOf method
		System.out.println("list2 after removing process(2): " + list2);
		
		ArrayList<String> list3 = new ArrayList(Arrays.asList("10", "20", "30"));
		list3.remove("10");	// String is class ---> when we define a String --> so it is an Object already
		System.out.println("list3 after removing process with String: " + list3);
		
		System.out.println();
		////////////////////////////////////////////////////////////
		System.out.println("List4 - 5 ");
		
		ArrayList<String> list4 = new ArrayList(Arrays.asList("A", "B", "C", "A", "A"));
		
//		list4.removeAll((Arrays.asList("A", "C")));		// we can do it like that
		ArrayList<String> list5 = new ArrayList(Arrays.asList("A", "C"));	// or like that
		
//		list4.removeAll(Arrays.asList("A"));
//		list4.removeAll(Arrays.asList("A", "C"));	// passing to C
//		list4.removeAll(list5);	// B wiil remain, list4 has A and C so it will be removed in the list 3(Collection)
//		list4.removeAll(Collections.singleton("A"));	// it will take A out of the equasion	(Collections class)
		
		System.out.println("list 4 after removing with collection: " + list4);
		
		System.out.println();
		////////////////////////////////////////////////////////////////////
		System.out.println("List6 and arr: ");
		
		ArrayList<String> list6 = new ArrayList(Arrays.asList("A", "B", "C", "A", "A"));
//		list6.removeRange;		// it will not work, so u have to extends ArrayList
		
//		 u wanna use a method, that it is in the ArrayList Class but it has an access modifier from type protected
//		 so it can be seen but only in the package, where it is borned, so to access it we need to connect
//		 the MaiThirdLesson with the ArrayList Class through inheritance to see the method inside it
//		 we have don it now so we will create an object from Type MainThirdLesson
	
		MainThirdLesson arr = new MainThirdLesson();
		arr.add(10);		// it will be deleted
		arr.add(20);		// it will be deleted
		arr.add(30);
		arr.add(40);
		
		arr.removeRange(0, 2);	// call the method removeRange(x, y), which is protected, it exists in a package can't be seen from the ArrayList package
								// it will delete elements from index x to before index y, removeRange(x, y) from x to y - 1
		System.out.println("the Object arr after using the method arr.removeRange(0, 2): " + arr);
		
		System.out.println();
	////////////////////////////////////////////////////////////////////////////////	
		System.out.println("List7: ");
		
		ArrayList<Integer> list7 = new ArrayList(Arrays.asList(1,2,3,4,5,6));
		
		list7.removeIf(num->num%2==0);	// filter structure: (num->num%2==2); 1->1%2==2 no false
										//					2->2%2==2 yes true
										// lamda Excepretions : it will give me just the pair numbers
		System.out.println("ist7.removeIf(num->num%2==0);: " + list7);
		
		System.out.println();
		///////////////////////////////
		System.out.println("List8: ");
		
		ArrayList list8 = new ArrayList(Arrays.asList(1,2,3,4,5,6));	// here the ArrayList is not defined as Integer
		list8.removeIf(num->(Integer)num%3==0);	// so u will have to do casting here, it will take the
												// number 3 from the equation
		
		System.out.println("list8.removeIf(num->(Integer)num%3==0);: " + list8);
		
		System.out.println();
		/////////////////////////////////////////////////////////////////////////////////
		System.out.println("List9: ");
		
		ArrayList list9 = new ArrayList(Arrays.asList("Juan",2,true,4,5,6));
										// Array of Objects, each Object of them is different than the other one
		System.out.println(list9);	// it will work, Array of Objects
		
		
		Object[] obj = new Object[5];	// Array of Obejct ( polymorphic Array)
		obj[0] = "AA";
		obj[1] = 's';
		obj[2] = true;
		obj[3] = 10;
		
//		System.out.println(obj);		// it will not work here, because we have an Array and if i want to print them
										// i have to do it wit for or for each	
		
		for(Object el : obj) {		// for each
			System.out.println("for(Object el : obj): " + el);
		}
		
	}

}
