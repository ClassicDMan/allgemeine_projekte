package LLL_30_fileHandling;

public class FileHandling_01 {
	
	/*
	 * File Handling, or File I/O, I/O Streams Java.io.package
	 * 
	 * How to store the data permanently in java?
	 * 
	 * 1- Local Database 2- Database Server 3- Server Provider
	 * 
	 * we will store it in Files:
	 * 
	 * for an example: jpg, PDF, PNG, CSS, AI, MPEG, csv, ...etc ( of course less
	 * secure )
	 * 
	 * like when i sell a software, the client will need the license, the license
	 * will have to be saved in files and then be sent to a client.
	 * 
	 * there is a lot of classes in java package.io
	 * 
	 * there is a java program, and there i
	 * 
	 * -I have a Java program and I want to save the values and variables in the
	 * program, in a file, For an example I want to save the values in a .txt file.
	 * 
	 * -For this transaction between the program and the file I need to kind of
	 * connection between them both, this connection is called I/O streams ( like a
	 * Pipe for transfer the data between the java program and the file ):
	 * 
	 * 1- So when the program reads values from a file: this stream channel is
	 * called Read ( InPutStream ): Reading information into a java program. 
	 * 2- When the program saves values on a file or write in a file this stream channel is
	 * called Write ( OutPutStream ): writing information from a java program.
	 * 
	 * 
	 * 				(P)Program						from P to File									(F)File.txt
	 * 							|	>>>>----------- Output Stream ----------->>>>	|
	 * 		int id = 1111;		|													|
								|					from File to P					|
	 * 		String n = "Juan";	|	<<<<----------- Input Stream  -----------<<<<	|
	 *
	 * 						those Streams transfer data:
	 * 
	 * 						binary or character input and output Stream
	 * 
	 * 
	 * 												I/O Streams
	 * 
	 * 				Byte(Binary) Stream											Character Stream	
	 * 
	 * 			( Abstract Classes )											( Abstract Classes )
	 * 
	 * 	input Stream			output Stream								Reader				Writer
	 * 
	 * 			( Methods )															( Methods )
	 * 
	 * 	read()					write()										read()				write()
	 * 
	 * 
	 * there are classes which are subclasses from the main classes
	 * 
	 * Sources: File, Object, String, String Buffer, Array 	...etc:
	 * 
	 * ( FileInputStream, ObjectInputStream, ByteArrayIntputStream..etc
	 * ( FileOutputStream, ObjectOutputStream, ByteArrayOutputStream..etc 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 		super class																				super class
	 * 		Object																						Object
	 * 
	 * 	Abstract class		>>>>>>>>>>	 Closable interfaces ( methods )	<<<<<<<<<<<				Abstract class
	 * 	InputStream									Flushable Method			<<<<<<<<<<<<<<		OutputStream
	 * 
	 * FileInpuStream																				FileOutpuStream
	 * ByteArraIntputStream																			ByteArrayOutputStream
	 * FilterInputStream<---DataInputStream										DataOutputStream--->FilterOutputStream
	 * 					<---BufferedInputStream							 BufferedOutputputStream--->
	 * 																				 PrintStream--->
	 * ObjectInputStream																			ObjectOutputStream
	 * StringBufferInputStream																		PipedOutputStream
	 * SequenceInputStream
	 * PipedInputStream
	 * 
	 * 
	 * 									to Read a file, it could be a character data or a Byte data
	 * 									if i have to deal with Byte data i will use Input and Output Stream
	 * 									if i have to deal with character data i will use Reader and Writer
	 * 
	 * 
	 * 										************************
	 * 												File Class:
	 * 										*************************
	 * 
	 * 				
	 * The File class is java's representation of a file or directory path name
	 * 
	 * 
	 * The File class is java's representation of a file or directory path name, it
	 * will point on that that Path.
	 * 
	 * so now instead of doing this,
	 * 
	 * FileInputStream fis = new FileInputStream(“D:/JuanMahmoud/Bewerbungunterlagen/Fotos/ …“);
	 *  FileOutputStream fos = new FileOutputStream(“D:/Juan Mahmoud/Bewerbungunterlagen/Fotos/ …“);
	 *   we will do it through the File Class File file = new File( “D:/Juan Mahmoud/Bewerbungunterlagen/Fotos/ …“);
	 * 
	 * The file class contains several methods for working with the pathname,
	 * deleting and renaming files, creating new directories, listing the contents
	 * of a directory and determining several common attributes of the file and
	 * directories
	 * 
	 * 
	 * 										*************************
	 * 										Abstract Class Reader and
	 * 										Abstract Class Writer
	 *										*************************
	 *
	 * Reader is an abstract class for reading characters streams
	 * writer is an abstract class for writing to character streams
	 *
	 * Reader	<<<<<<<<interfaces with Reader and Writer(Closeable, AutoCloseable, Readable)			Writer
	 * 
	 * 									interfaces with Writer only 	Flushable, Appendable>>>>>>>				
	 * 	
	 * 
	 * BufferedReader<<<<<<<<	LineNumberReader													BufferedWriter
	 * CharArrayReader														FileWriter	>>>>>>		CharArrayWriter
	 * FilterReader	<<<<<<<<	PushbackReader														FilterWriter
	 * InputStreamReader<<<<<<<<<	FileReader														InputStreamWriter
	 * PipedReader																					PipedWriter
	 * 																								PimpedWriter
	 * StringReader																					StringWriter
	 * 
	 * 
	 * Why do we use different classes than FileReader ?
	 * 
	 * If we have a text data contains telefon number and each telefon number in a line
	 * Class FileReader will be called for example 10 times each line to read the whole number of 10 digits
	 * 
	 * 
	 *										 *************************
	 * 										 BufferedReader Class and
	 * 										 BufferedWriter Class,
	 * 										 Read File Line by Line
	 *										*************************
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
	 * 										*************************
	 * 										PrintWriter and Reader
	 *										*************************
	 * 
	 * 
	 * 
	 * 										*************************
	 * 										Scanner Class
	 *										*************************
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 					Buffer reader														Scanner
	 * 
	 * 				- Buffer memory is larger											- Buffer memory is smaller
	 * 				( 8 KB char buffer )												(1 KB char buffer)
	 * 
	 * 				- faster than scanner												- slower because it does 
	 * 																					parsing of the input data
	 * 
	 * 				- There is no ambiguity related										- There are a lot of problems 
	 * 				 to nextLine() Method												with the nextLine() method
	 * 		
	 * 				- Synchronous and should be											- Not synchronous and not used
	 * 				 used with multiple threads												with multiple threads
	 * 
	 * 				- uses buffering to read characters									- it is a simple text scanner whch
	 * 				from the character-input stream										parses primitive tyoes and strings
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

}
