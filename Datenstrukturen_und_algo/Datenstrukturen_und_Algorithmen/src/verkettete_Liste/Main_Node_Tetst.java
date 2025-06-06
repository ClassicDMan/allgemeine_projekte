package verkettete_Liste;

public class Main_Node_Tetst {
	
	class UserList{
		static void printLinkedList(Node head) {
			
			Node curr = head;
			while(curr != null) {
				System.out.println(curr.data);
				curr = curr.next;
				
				
			}
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Data d1 = new Data(1, "One");
//		Data d2 = new Data(2, "Two");
//		Data d3 = new Data(3, "Three");
//		Data d4 = new Data(4, "Four");
		
		int d1 = 1;
		int d2 = 2;
		int d3 = 3;
		int d4 = 4;
		
		Node n1 = new Node(d1);
		Node n2 = new Node(d2);
		Node n3 = new Node(d3);
		Node n4 = new Node(d4);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		Node head = n1;
		
		UserList.printLinkedList(head);

	}

}
