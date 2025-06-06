package Lesson_05_DynamicArrays;

public class DynamicArray {
	
	int size;
	int capacity = 10;
	Object[] array;
	
	public DynamicArray() {
		this.array = new Object[capacity];
	}
	
	public DynamicArray(int capacity) {
		this.capacity = capacity;
		this.array = new Object[capacity];
			
		}
	
	public void add(Object data) {
		if(size >= capacity) {
			grow();
		}
		array[size] = data;
		size++;
	}
	
	public void insert(int index, Object data) {
		if(size >= capacity) {
			grow();
		}
		for (int i = size; i > index; i--) {
			array[i] = array[i - 1];
		}
		array[index] = data;
		size++;
	}
	
	public void delete(Object data) {
		for (int i = 0; i < size; i++) {				// loop into the array while i < size of the array
			if(array[i] == data) {						// i want to delete an element, so if the index here = element i am searching for
				for (int j = 0; j < size - i - 1; j++) {	// i need a nested loop hiere
					array[i + j] = array[i + j + 1];		// debug to understand how the shifting works here
				}
				array[size - 1] = null;						// after the shifting, the index after the deleted element has to be null
				size--;										// not to forget the size has to be smaller by one also
				if(size <= (int) (capacity/3)) {
					shrink();
				}
				break;
			}
		}
	}
	
	public int search(Object data) {
		for (int i = 0; i < size; i++) {
			if(array[i] == data) {
				return i;
			}
		}
		return -1;
	}
	
	private void grow() {
		int newCapacity = (int) (capacity * 2);
		Object[] newArray = new Object[newCapacity];
		
		for (int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		capacity = newCapacity;
		array = newArray;
		
	}
	
	private void shrink() {
		int newCapacity = (int) (capacity / 2);
		Object[] newArray = new Object[newCapacity];
		for (int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		capacity = newCapacity;
		array = newArray;
		
		
		
		
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public String toString() {
		String string = "";
		
		for (int i = 0; i < capacity; i++) {			// when u run to String u will be able to see the whole array [ A,B,C,null,null]
			string += array[i] + ", ";
		}
		
//		for (int i = 0; i < size; i++) {				// by running this u will see just the elements that r actually in the array[A,B,C]
//			string += array[i] + ", ";	
//		}
		
		if(string != "") {
			string = "[" + string.substring(0, string.length() - 2) + "]";
		}
		else {
			string = "[]";
		}
		return string;
	}
	
	
	
	

}
