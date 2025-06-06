package LLL_30_fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerClass_08 {

	public static void main(String[] args)throws IOException {
		
//		File file = new File("test.txt");
//		Scanner scan = new Scanner(file);
		
//		System.out.println(scan.next());			// next() reads Strings till the space
//		System.out.println(scan.nextLine());		// nextLine() reads the String in the whole line
		
//		while(scan.hasNextLine()) {
//			System.out.println(scan.nextLine());
//		}
		
//		while(scan.hasNext()) {
//			System.out.println(scan.next());
//		}
		
//		scan.useDelimiter(" ");					// use a pattern
//		while(scan.hasNext()) {
//			System.out.print(scan.next());
//		}
		
//		scan.useDelimiter("\\z");				// Regular Expression
//		while(scan.hasNext()) {
//			System.out.print(scan.next());
//		}
		
//		special method to use in Scanner:
		
//		scan.useDelimiter("\\z");			
//		System.out.print(scan.next());
		
//		scan.useDelimiter("\\D+");
//		System.out.print(scan.next());							// prints the numbers in the first line
		
//		scan.useDelimiter("\\D+");
//		while(scan.hasNext()) {
//			System.out.println(scan.next());					// print just the numbers
//		}
		
		////////////////////////////////////////////////////////////////////////////
		
//		File file = new File("test.txt");
//		Scanner scan = new Scanner("AAA,BBB,CCC");
//		scan.useDelimiter(Pattern.compile(","));			// Pattern compile(String regex);
//		
//		System.out.println("Delimiter= " + scan.delimiter());
//		System.out.println();
//		while(scan.hasNext()) {
//			System.out.println(scan.next());
//			
//		}
		
		///////////////////////////////////////////////////////////////////////////
		
		System.out.println("dealing with Strings words by words like dealing with the name alone, the phone alone,\nthe goal is to save it in objects:\n");
		
		File file = new File("test.txt");
		Scanner scan = new Scanner(file);
		
		while(scan.hasNextLine()) {
			parseLine(scan.nextLine());
		}
	}
	
	static void parseLine(String str) {
		String name;
		String address;
		String PhoneNr;
		
		Scanner sc = new Scanner(str);
		sc.useDelimiter(",");
		
		while(sc.hasNext()) {
			
			name = sc.next();
			address = sc.next();
			PhoneNr = sc.next();
			
			System.out.println("Name: " + name + " - Address: " + address + " - Phone.Nr: " + PhoneNr);
		}
		
		sc.close();
	}
}
