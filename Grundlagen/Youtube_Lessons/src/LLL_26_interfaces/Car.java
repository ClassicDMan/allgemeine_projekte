package LLL_26_interfaces;

public class Car<T> implements GenericInterface<T> {
	
	@Override
	public T carModel() {
		return (T) new CarV1();
	}

}
