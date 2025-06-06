package LLL_30_fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class ReaderWriter_05 {

	public static void main(String[] args)throws IOException {
		
//		FileOutputStream fos = new FileOutputStream("test.txt");
//		String s = "Hallo";
//		byte[] b = s.getBytes();
//		fos.write(b);
//		fos.close();
		
		//////////////////////////////////////////////////////
		
//		FileWriter fr = new FileWriter("test.txt");
//		String s = "Hallo";
//		fr.write(s);
//		fr.close();
		
		/////////////////////////////////////////////////////
		
//		Writer writer = new OutputStreamWriter(new FileOutputStream("a.txt"));
//		String s = "abc";
//		writer.write(s);
//		writer.flush();
		
		/////////////////////////////////////////////////////
		
//		String s = "Hallo World how are you";
//		FileWriter fr = new FileWriter("test.txt");
//		fr.write(s, 6, 13);			// it will print form index 6 in String to index 13 in String
//		fr.write(97);				// it will print the character a which is 97 in Unicode
//		fr.write('b');				// it will write just char which is b
//		fr.close();
		
		////////////////////////////////////////////////////
		
//		String s = "Hallo World how are you";
//		FileWriter fr = new FileWriter("test.txt");
//		fr.write("AA");
//		fr.write("\n");						// it will write just char which is b
//		fr.write("BB");
//		fr.close();
		
		////////////////////////////////////////////////////
		
//		File file = new File("test.txt");
//		FileReader fr = new FileReader(file);			// FileReader will read like FileInputStream byte by byte
//		int i;
//		while((i = fr.read()) != -1){
//			System.out.print((char) i );
////			System.out.print(i);				// it will print Unicode number
//		}
		
		///////////////////////////////////////////////////
		
		File file = new File("test.txt");
		FileReader fr = new FileReader(file);			// FileReader will read like FileInputStream byte by byte
		
		char [] ch = new char[(int)file.length()];			// size of the file and read the chars inside it
		fr.read(ch);
		for(char c: ch) {										
			System.out.println(c);
		}
		fr.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
