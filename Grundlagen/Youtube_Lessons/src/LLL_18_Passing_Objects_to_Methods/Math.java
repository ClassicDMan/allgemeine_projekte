package LLL_18_Passing_Objects_to_Methods;

public class Math {
	int val;			// Data member
//	int val2;				// adding another value
	public Math() {
	}
	
	public Math(int val) {
	this.val = val;	
	
	}
//	public Math(int val, int val2) {			// if we add another value : val2 ^
//		this.val = val;	
//		this.val2 = val2;
//		}
	
	
	Math add(Math n2) {			//Math n3 = n1.add(n2);
		Math n3 = new Math();
		n3.val = this.val + n2.val;
		
//		n3.val = this.val + n2.val;			// if we dd another value : val2 ^
//		n3.val2 = this.val2 + n2.val2;
		
		
		return n3;
	}
	
	
	static Math add(Math n1, Math n2) {			// if we add static we can call it from hte main with a class Math.add(n1,n2)
		Math n3 = new Math();
		n3.val = n1.val + n2.val;
		
		return n3;
	}
	
	
	boolean isEqual(Math n2) {
		return this.val == n2.val;
		
		// or
		
//		if(this.val == n2.val)
//			return true;
//		else
//			return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
