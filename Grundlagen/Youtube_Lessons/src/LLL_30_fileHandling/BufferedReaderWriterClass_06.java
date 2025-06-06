package LLL_30_fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import LLL_18_Passing_Objects_to_Methods.Test1;

public class BufferedReaderWriterClass_06 {

	public static void main(String[] args) throws IOException {
		
//		FileWriter fw = new FileWriter("test.txt");
////		FileWriter fw = new FileWriter("test.txt", true);		// to Override in the file, it means it will write again 
//																// while aving what is written the first round of writing
//		BufferedWriter bw = new BufferedWriter (fw);
//	
//		
////		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt");
//		
//		// to use the BufferedWriter, i need a Writer Class to reach the data, see Constructors of Buffered in java for info
//		
//		bw.write(97);				// it will print the char a which is in unicode 97
//		bw.newLine();				// it creates a new line to write in it
//		bw.write("AAA");			// it will write in the new line AAA
//		bw.flush();					// 
//		bw.close();					// if a bufferedReader gets closed, it will close also the instance in FileReader
		
		// bw.flush(): The flush() method is used to flush the contents of the buffer to
		// the underlying file or output stream. It ensures that any buffered data is
		// immediately written out.
		
		// After calling flush(), the BufferedWriter instance bw is still open and can
		// be used for further writing. However, in this particular code snippet,
		// bw.close() is called immediately after bw.flush(). The close() method closes
		// the BufferedWriter and releases any system resources associated with it.
		// Closing the BufferedWriter will also close the underlying FileWriter instance
		// fw since it was passed as an argument when creating the BufferedWriter.
		
		// In summary, calling bw.flush() ensures that any buffered data is immediately
		// written out to the file, and calling bw.close() closes the BufferedWriter and
		// the underlying FileWriter, releasing any system resources used by them.
		
		
		/////////////////////////////////////////////////////////////////////////
		
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));			// read line by line, and also it is functional with large Files
		String line = br.readLine();
		
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
