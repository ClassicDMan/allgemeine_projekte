package LLL_33_collections;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {			// we made our GenericList Iterable
		
	
	private T[] items = (T[]) new Object[10];					// if tommorrow i wiil have an ArrayList or a an array, here i can modify the code to iterate over the array
	private int count;
	
	public void add(T item) {
		items[count++] = item;
	}
	public T get(int index) {
		return items[index];
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator(this);				// here we return a ListIterator, to iterate over a GenericList
	}


	private class ListIterator implements Iterator<T> {
		private GenericList<T> list;
		private int index;

		public ListIterator(GenericList<T> list) {
			this.list = list;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (index < list.count);
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return list.items[index++];
		}
	}
}