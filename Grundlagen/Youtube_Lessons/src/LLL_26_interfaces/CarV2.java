package LLL_26_interfaces;

public class CarV2 implements SelfDrivable, Movable {

	private int x, y;
	int numberOfPassengers;

	public CarV2(int x, int y) { // parameterized Constructor
		
		this.x = x;
		this.y = y;
	}

	public CarV2() {

	}
	@Override
	public void newMethod() {					// implement the method, which exists in Movable
		System.out.println("newMethod CarV1");
	}


	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		y--;
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		y++;
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		x++;
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		x--;
	}

	@Override
	public void destination(String d) {
		// TODO Auto-generated method stub
		System.out.println("destenation" + d);
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("drive V2");
	}

}
