package LLL_24_arrayListClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MainFifthLesson {

	public static void main(String[] args) {
					// 2D ArrayList: a dynamic List of lists.
					// you can change the size of these lists during runtime
		
		
		ArrayList<String> tShirts = new ArrayList();
		tShirts.add("Sommer T-Shirt");
		tShirts.add("Winter T-Shirt");
		tShirts.add("Spring T-Shirt");
		
		ArrayList<String> color = new ArrayList();		// size has 4 elements
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		color.add("Black");
		
		ArrayList<String> company = new ArrayList();
		company.add("Zara");		//0
		company.add("J & J");		//1
		company.add("Gucci");		//2
		company.add("D & G");		//3
		company.add("Adidas");		//4
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		groceryList.add(tShirts);
		groceryList.add(color);
		groceryList.add(company);
		
		System.out.println(groceryList);
		System.out.println("groceryList.size(): " + groceryList.size());
		System.out.println("groceryList.get(0): " + groceryList.get(0));
		System.out.println("groceryList.get(1).size(): " + groceryList.get(1).size());
		System.out.println("groceryList.get(2).get(2): " + groceryList.get(2).get(2));
		


	}

}
