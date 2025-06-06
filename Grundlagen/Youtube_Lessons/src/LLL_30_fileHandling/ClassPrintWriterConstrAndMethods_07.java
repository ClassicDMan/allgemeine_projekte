package LLL_30_fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ClassPrintWriterConstrAndMethods_07 {

	public static void main(String[] args)throws IOException{
		
		FileWriter fr = new FileWriter("abc.txt", true);
		PrintWriter pr = new PrintWriter(fr, true);
		
		pr.println(98);
		pr.write(98);
		
//		pr.print("BBB");
//		pr.print('C');
//		pr.print(true);
		pr.flush();
		pr.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
