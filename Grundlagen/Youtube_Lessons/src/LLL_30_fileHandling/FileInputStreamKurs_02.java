package LLL_30_fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamKurs_02 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		System.out.println("Character Size: " + Character.SIZE/8);		// Size of Data Type is 2 Bytes
		System.out.println("String Size: " + "b".getBytes().length);	// charcter is 1 Byte big not 2 bytes
		
		System.out.println();
		
		////////////////////////////////////////////////////////////////
		
		System.err.println("methods and reading a file content with the String name costructor:\n");
		
		FileInputStream fis1 = new FileInputStream("a.txt");		// throws FileNotFoundException is Necessary  
		// FileInputStream(String name)
		// Creates a FileInputStream by opening a connection to an actual file, the file named by the path name name in the file system.
		
		// read() method 
		// Reads a byte of data from this input stream.
		
//		System.out.println("fis1.read(): " + fis1.read());			// a = 97	throws FileNotFoundException is Necessary  for the method
//		System.out.println("fis1.read(): " + fis1.read());			// b = 98
//		System.out.println("fis1.read(): " + fis1.read());			// c = 99	it will read it as binary numbers
		
		System.out.println("(char)fis1.read(): " + (char)fis1.read());			// a casting is Necessary to print the cahr
		System.out.println("(char)fis1.read(): " + (char)fis1.read());			// b
		System.out.println("(char)fis1.read(): " + (char)fis1.read());			// c it will read as characters
		System.out.println("(char)fis1.read(): " + (char)fis1.read());			// it will give me a ?, because there is not any char left
		System.out.println("fis1.read(): " + fis1.read());						// it will give me -1									
		
		System.out.println();
		
		////////////////////////////////////////////////////////////////
		
		System.err.println("while loop and craeting an integer:\n");
		
		FileInputStream fis2 = new FileInputStream("a.txt");
		int data;
		while ((data = fis2.read()) != -1) {
//			System.out.println("(char)fis2.read(): " + (char)fis2.read());
			System.out.println("(char)data): " + (char) data);
		}
		System.out.println();
		
		/////////////////////////////////////////////////////////////////
		
		System.err.println("involving the array of bayte:\n");
		
		FileInputStream fis3 = new FileInputStream("a.txt");
		byte [] b1 = new byte[3];
		fis3.read(b1);
		String s1 = new String(b1);
		
//		System.out.println(b[0]);
//		System.out.println((char)b[0]);
		
		System.out.println("String s1 = new String(b1): " + s1);
		fis3.close();			// every resource opened in a way or another, have to be closed
								// with try and catch resource u don't have to use fis2.close()
		
		System.out.println();
		
		////////////////////////////////////////////////////////////////
		
		System.err.println("involving the array of bayte using method length, to be more dynamic:\n");
		
		File f = new File("a.txt");			// File class and constructor: File(String name)
		FileInputStream fis4 = new FileInputStream(f);		// FileInputStream(Fiel file);
		
		
		byte [] b2 = new byte[(int)f.length()];		// to know how much is the length of File f
		fis4.read(b2);		// read the bytes up there, which also casted to int of f.length and then save it in b2
		String s2 = new String(b2);		// make the b2 a string
		System.out.println("String s = new String(b): " + s2);	// give me the String
		fis4.close();			// close the file
		
		
	}

}
