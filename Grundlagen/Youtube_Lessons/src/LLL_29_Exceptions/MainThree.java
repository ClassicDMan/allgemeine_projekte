package LLL_29_Exceptions;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.lang.System.Logger;
import java.util.logging.Level;
//import java.util.logging.Logger;
import java.io.FileReader;
import java.io.IOException;

import com.sun.tools.javac.Main;

public class MainThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		readFile1("H:\\Juann Mahmoud");

//		readFile2("C:\\Benutzer\\jwanm\\dir");

//		readFile3("C:\\Benutzer\\jwanm");

//		readFile4("C:\\Users\\jwanm\\eclipse-workspace\\Youtube_Lessons\\Name.txt");
		
		
		
//		try {
//		readFile5("C:\\Users\\jwanm\\eclipse-workspace\\Youtube_Lessons\\Name.txt");
//		}catch (FileNotFoundException e) {
//	
//		}catch(IOException e) {
//			
//		}
		
		
		try {
			readMultiFile("C:\\Users\\jwanm\\eclipse-workspace\\Youtube_Lessons\\Name.txt");		// i must handle the Exception here
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//		f();
//		}catch(Error e) {				// Error can not be solved with try and catch because this is a serious Problem
//			System.out.println(e);		// so here i must go to the METHOD itself and try to solve the code itself
//		}								// without using any Exception or something
		
	}

	static void readFile1 (String filePath) {
		try {
			FileReader reader = new FileReader(filePath); // Handable Exception
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	static void readFile2 (String filePath) {

		try {
			FileInputStream fin = new FileInputStream(filePath); // FileNotFind ( instance fin is Resource )  Exception, Resource
			System.out.println("file content: ");
			int r = 0;
			while ((r = fin.read()) != -1) { // IOException
				System.out.print((char) r);
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e);

		} catch (IOException e) {
			System.out.println(e);
		}
	}

	static void readFile3 (String filePath) {

		FileInputStream fin = null;
		try {
			fin = new FileInputStream(filePath); // FileNotFind Exception, Resource

			System.out.println("file content: ");

			int r = 0;
			while ((r = fin.read()) != -1) { // IOException
				System.out.print((char) r);
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e);

		} catch (IOException e) {
			System.out.println(e);
		} finally {
			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	static void readFile4 (String filePath) {

		try (FileInputStream fin = new FileInputStream(filePath);
				FileInputStream fin2 = new FileInputStream(filePath)) { // FileNotFind Exception, try-catch with Resource
			// idon't need the finally anymore, any instance defined inside the try, will be
			// closed automatically
			System.out.println("file content: ");

			int r = 0;
			while ((r = fin.read()) != -1) { // IOException
				System.out.print((char) r);
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e);

		} catch (IOException e) {
			System.out.println(e);
		}

	}

	static void readFile5 (String filePath) throws FileNotFoundException, IOException{

		FileInputStream fin = new FileInputStream(filePath);
		
		System.out.println("file content:");
		int r = 0;
		while((r=fin.read()) != -1) {
			System.out.print((char)r);
		}
		
		
	}
	
	
	static void readMultiFile(String filePath)throws FileNotFoundException, IOException {
		
//		try {
			readFile5("C:\\Users\\jwanm\\eclipse-workspace\\Youtube_Lessons\\Name.txt"); 
			// if i don't handle the exception inside the method then i have to use throws on the method,
			//in this case when i call the method in main class then i will have to handle it there with try-catch block 
			
//			}catch (FileNotFoundException e) {
//		
//			}catch(IOException e) {
//				
//			}
		
	}
	
	static void f() {
		System.out.println("f()");
		f();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
		
