package projekts;

import java.text.DecimalFormat;

public class rounding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double number = 3.233283204730483454634634634634;
		
		double rounded = Math.round(number * 100)/100.00;
//		u have to mulriplie the number * 100 and then devide it /100.0 to get
//		two digits after the . if u wanna more, then add more 0 to the left of the number exp:
//		(number * 100)/100.0 to get two digits -(number * 1000)/ 1000.0 to get 3 digits -(number * 10000000)/ 10000000.0 to get 7 digits  
		
		System.out.println(number);
		
		System.out.println(rounded);
		
		System.out.printf("%.6f" + "\n", number); 
//		here "%f" + the targeted variable means that what do u wanna do with this float number
//		i wanna two digits after the . so "%.2f", if i wanna 6 digits then "%.6f" and of course do not forget the system.out.printf before
		
		DecimalFormat dFormater = new DecimalFormat("0.000"); // i can use # instead of 0
		String formated = dFormater.format(number);
		System.out.println(formated);

	}

}

