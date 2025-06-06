package LLL_30_fileHandling;

import java.io.File;			// import the File Package
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileClassLesson_04 {

	public static void main(String[] args)throws IOException {
		
//		File f = new File("abc.txt");			// it doesn't create a file but creates an instance of the class File
//		System.out.println(f.exists());			// it will be false the first time, but after creating it it will be true
//		f.createNewFile();						// we create the file with this method
//		
//		System.out.println(f.exists());
//		if(f.exists()) {
//			System.out.println("f.getName(): " + f.getName());				// it will print the name of the file
//			System.out.println("f.getAbsolutePath()" + f.getAbsolutePath());		// the whole path of the file
//			System.out.println("f.getPath()" + f.getPath());				// path of the file inside of the project where we work
//			System.out.println("f.canWrite()" + f.canWrite());				// true, if we can write inside the file, see file propereties for info
//			System.out.println("f.canRead()" + f.canRead());				// true, if we can read it or not
//			System.out.println("f.length()" + f.length());					// gives the file size in bytes
//			System.out.println("f.isDirectory()" + f.isDirectory());		// directory means if it is a file or a Folder
//			System.out.println("f.isFile()" + f.isFile());					// is it a file or not
//			System.out.println("f.isHidden()" + f.isHidden());				// if it is hidden or not
//			System.out.println("f.lastModified()" + f.lastModified());		// number which is in millisecondes, i can change it to any format of dates
//			System.out.println("f.canExecute()" + f.canExecute());			// cann i excute this file in this program
//			
//			System.out.println();
//		
//		}
	/////////////////////////////////////////////////////////////////////////////		
			
//			File f2 = new File("folder");		// path: folder/1/2
//			f2.mkdir();			// it will creat a directory ( Folder )
//			
//			// to create more than one Folder then this method is necessary f2.mkdirs();
//			
//			f2.mkdirs();		// it will create more than one Folder
//			f2.delete();		// it will delete the last directory in the path
			// but in our example here, if the folder contains various datas including a directory (Folder),
			// and you want to delete folder with the with the method delete(), it will not be executed
			
			/////////////////////////////////////////////////////////////
			
//			File f2 = new File("folder/a.txt");
//			
//			String[] arr = f2.list(); // f.list() will give me the name of the files and datas inside the folder
//			if (f2.isDirectory()) {			// to avoid the exception, check if the f2 is directory which is false
//											// those lines would not happen
//				for (String s : arr) {
//					System.out.println(s);
//				}
//			}
			
			////////////////////////////////////////////////////////////
		
//		File f3 = new File("folder", "b.txt");			// another constructor: File(String parent, String child)
//		f3.createNewFile();
		
		File f4 = new File("folder");					
		File f5 = new File(f4, "c.txt");				// another constructor: File(File parent, String child)
//		f4.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(f5);
		fos.write("AAAAA".getBytes());
		
		FileInputStream fis = new FileInputStream(f5);
		int input;
		while((input = fis.read())!= -1) {
			System.out.print((char)input);
		}
			
			/*
			 * 
			 * 1-  int input: It is used to store the value of each character read from the
			 * file.
			 * 
			 * 2-  while ((input = fis.read()) != -1): This line reads a character from the
			 * FileInputStream fis and assigns its value to the input variable. The read()
			 * method of FileInputStream returns the next character as an integer value (the
			 * ASCII value of the character). It returns -1 if there are no more characters
			 * to read.
			 * 
			 * 3-  The condition (input = fis.read()) != -1 checks if the value of input is not
			 * equal to -1. If it is not -1, it means there is another character to read.
			 * 
			 * 4-  System.out.print((char) input);: This line converts the integer value stored
			 * in input back to its corresponding character using a type cast (char) input
			 * and prints it to the console. This line effectively displays the character
			 * that was read from the file.
			 * 
			 * 
			 * The while loop continues until there are no more characters to read from the
			 * file (i.e., fis.read() returns -1). Inside the loop, each character is read,
			 * converted to its corresponding character representation, and printed to the
			 * console. This process repeats until the end of the file is reached.
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 */
			
			
			
			
			
			
			
			
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}// main end

}// class end
