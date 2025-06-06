package LLL_30_fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamKurs_03 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.err.println("Writing a number and reading it:\n");
		
		FileOutputStream fos1 = new FileOutputStream("Test.txt");	// if the data is'nt created yet
																	// FileOutputStream will create a data with the same
																	// name we entered, check the path of the Project
																	// for details bitch
		
		fos1.write(10);				// write inside the data, the method write() receives just array of bytes hommi
		FileInputStream fis1 = new FileInputStream("Test.txt");
		System.out.println("fis1.read(): " + fis1.read());
		
		
		System.out.println();
		//////////////////////////////////////////////////////////////////////////
		System.err.println("Writing Text:\n");
		
		FileOutputStream fos2 = new FileOutputStream("Test.txt");
		fos2.write(10);
		
		fos2.write("ABC".getBytes());
//		System.out.println("ABC");
		fos2.flush();
		
		FileInputStream fis2 = new FileInputStream("Test.txt");
		System.out.println(fis2.read());
		int data;
		while((data = fis2.read()) != -1){
		
		System.out.println((char)data);
		}
		
		System.out.println();
		
		////////////////////////////////////////////////////////////
		
//		File file = new File("D:\\Juan Mahmoud\\Bewerbungsunterlagen\\Fotos\\DSC_0131.JPG");
//		
//		FileInputStream fin = new FileInputStream(file);
//		byte[] b = new byte [(int) file.length()];
//		fin.read(b);
//		
//		for (int i = 0; i < b.length; i++) {
//			System.out.print(b[i]);
//		}
//		
//		FileOutputStream fos = new FileOutputStream("D:\\Juan Mahmoud\\Bewerbungsunterlagen\\Fotos\\DSCJuann_0131.JPG");
//		fos.write(b);
//		fos.flush();
//		fos.close();
//		fin.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
