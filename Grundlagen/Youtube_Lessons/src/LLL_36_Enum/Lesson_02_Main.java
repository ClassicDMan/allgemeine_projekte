package LLL_36_Enum;

import LLL_36_Enum.Order.OrderStatus;

public class Lesson_02_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order1 = new Order();
		order1.setStatus(OrderStatus.DELEVERING);
		System.out.println(order1.isDelevirable());
		
		
		Order order2 = new Order();
		order2.setStatus(OrderStatus.DELEVERING);
		System.out.println(order2.isDelevirable());
		
		

	}

}
