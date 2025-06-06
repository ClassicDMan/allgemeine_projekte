package projekts;

public class Return_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte x = 127;
		String binaryString = Integer.toBinaryString(x);
		if (x >= 0) {
		
			System.out.println(binaryString);
			System.err.println();
			String resultWithPadZero = String.format("%8s", binaryString).replace(" ", "0");
			System.err.println();
			System.out.print(resultWithPadZero);

		}
		if (x < 0) {

			int y = x & 0xff;

			System.out.println(0xff);
			System.out.println(y);
			System.out.println(Integer.toBinaryString(y));
			String resultWithPadZero = String.format("%8s", Integer.toBinaryString(y)).replace(" ", "0");
			System.out.println(resultWithPadZero);
		}
	}

}
