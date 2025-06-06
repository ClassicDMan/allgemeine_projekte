package Kapital_03_1;

public class Liste {

	public Node head;

	
	 // Methode zum Einfügen eines Elements an erster Stelle in die Liste
	public void appendFirst(Data data) {
		Node newNode = new Node(data);					
		newNode.next = head;
		head = newNode;
	}
	
    // Methode zum Anhängen eines Datenelements am Ende der Liste
	public void appendEnd(Data data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;
		}
	}
	
    // Methode zum Entfernen des letzten Elements aus der Liste
	public void removeEnd() {
		if(head == null) {
			return;
		}
		if(head.next == null) {
			head = null;
			return;
		}
		Node curr = head;
		while(curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
	}
	
	// Methode zum Löschen eines Elements mit dem gegebenen Schlüssel
	public boolean delete(int key) {
		if (head == null) {
			return false;
		}
		if (head.data.key == key) {
			head = head.next;
			return true;
		}

		Node current = head;
		while (current.next != null && current.next.data.key != key) {
			current = current.next;
		}
		if (current.next == null) {
			return false;
		}
		current.next = current.next.next;
		return true;

	}
	
	public boolean change(int key, Data newdata) {
        Node current = head;
        while (current != null && current.data.key != key) {
            current = current.next;
        }
        if (current == null) {
            return false;
        }
        current.data = newdata;
        return true;
    }
	
	
	
	
	
	
	
//	boolean delete(int key){
//		if (head.next == null) return false;
//		Node l = head;
//		if(l.next != null) {
//			if(l.next.data.key == key) {
//				l.next = l.next.next;
//				return true;
//			}
//			l = l.next;
//		}
//		return false;			// test
//	}
	
//	boolean change(int key, Data newData) {
//		return false;			// test
//	}
	

}
