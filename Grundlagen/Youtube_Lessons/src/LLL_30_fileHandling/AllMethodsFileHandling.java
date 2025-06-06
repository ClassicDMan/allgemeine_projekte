package LLL_30_fileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Iterator;

public class AllMethodsFileHandling {

	public static void main(String[] args) {
		
		///////////////////////////////////////////////////////////////////////////////////
		
//												FileInputStream:
		
		
		try {
			FileInputStream input1 = new FileInputStream("abc.txt");
			System.out.println("Data in the File: ");
		
			// Reads the first byte
			int i = input1.read();
			while (i != -1) {
				System.out.print((char) i);
			// Reads next byte from the file
				i = input1.read();
			}
			input1.close();

		} catch (FileNotFoundException e) {
			e.getStackTrace();
		} catch (IOException e) {
			e.getStackTrace();
		}

		///////////////////////////////////////////////////////////////////////////
		
//		try {
//			// Suppose, the abc.txt file contains the following text
//			// This is a line of text inside the file.
//			FileInputStream fis2 = new FileInputStream("abc.txt");
//		
//			// Returns the number of available bytes
//			System.out.println("Available bytes at the beginning: " + fis2.available());
//		
//			// Reads 3 bytes from the file
//			fis2.read();
//			fis2.read();
//			fis2.read();
//			// Returns the number of available bytes
//			System.out.println("Available bytes at the beginning: " + fis2.available());
//
//			fis2.close();
//		} catch (FileNotFoundException e) {
//			e.getStackTrace();
//		} catch (IOException e) {
//			e.getStackTrace();
//		}
		
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		
		
//		try {
//			FileInputStream fis3 = new FileInputStream("abc.txt");
//
//			System.out.println("Available bytes at the beginning: " + fis3.available());
//
//			int i = fis3.read();
//			while (i != -1) {
//				System.out.print((char) i);
//				i = fis3.read();
//
//			}
//			System.out.println();
//			System.out.println("Available bytes at the beginning: " + fis3.available());
//
//			fis3.close();
//		} catch (FileNotFoundException e) {
//			e.getStackTrace();
//		} catch (IOException e) {
//			e.getStackTrace();
//		}
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
											
//												FileOutputStream:
		
//		String data = "This is a line of text inside the file.";
//		try {
//		FileOutputStream fos = new FileOutputStream("a.txt");
//		
//		byte[]array = data.getBytes();
		
//		// Writes byte to the file
//		fos.write(array);
//		fos.close();
//		
//		}catch(FileNotFoundException e) {
//			e.getStackTrace();
//		}catch(IOException e) {
//			e.getStackTrace();
//		}
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		
//		FileOutputStream fos = null;
//		
//		String data = "This is a Demo of flush method:"; 
//		
//		try {
//			
//			fos = new FileOutputStream("a.txt");
//			// Using write() method
//			fos.write(data.getBytes());
//			// Using the flush() method
//			fos.flush();
//			fos.close();
//			
//		}catch(FileNotFoundException e) {
//			e.getStackTrace();
//		}catch(IOException e) {
//			e.getStackTrace();
//		}
		
		//////////////////////////////////////////////////////////////////////////////////////////////////
		
//											ByteArrayInputStream:
		
		
//		try {
//			byte[] arr = { 1, 2, 3, 4, 5 };
//
//			ByteArrayInputStream input = new ByteArrayInputStream(arr);
//
//			for (int i = 0; i < arr.length; i++) {
//				int data = input.read();
//				System.out.print(data + ", ");
//			}
		
//		 // close() method
//			input.close();
//		} catch (IOException e) {
//			e.getStackTrace();
//		}
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
//		byte[] arr2 = { 1, 2, 3, 4, 5 };
//
//		ByteArrayInputStream input2 = new ByteArrayInputStream(arr2);
//
//		System.out.println(input2.available());
//		input2.read(); // returns 1
//		input2.read(); // returns 2
//		System.out.println(input2.available()); // 3 elements left in the array to read
//		//input.close();					// handle Exception
//
//		byte[] arr3 = { 1, 2, 3, 4, 5 };
//
//		ByteArrayInputStream input3 = new ByteArrayInputStream(arr3);
//
//		input3.skip(2);
//		System.out.print("InputStream after skipping 2 Bytes: ");
//
//		int data = input3.read();
//		while (data != -1) {
//			System.out.print(data + ", ");
//			data = input3.read();
//		}
	
		
///////////////////////////////////////////////////////////////////////////////////////////////////
//										ByteArrayOutputStream:
		
//		String data = "This is a line of text inside the string.";
//		
//		try {
//
//			// Creates an output stream
//			ByteArrayOutputStream baos = new ByteArrayOutputStream();
//			byte[] array = data.getBytes();
//			// Writes data to the output stream
//			baos.write(array);
//			// Retrieves data from the output stream in string format
//			String streamData = baos.toString();
//			System.out.println(streamData);
//
//			baos.close();
//
//		} catch (IOException e) {
//			e.getStackTrace();
//		}
		
		
		
		///////////////////////////////////////////////////////////////////////////////////////////
		
//		String data = "This is data";
//		
//		try {
//			// Creates an output stream
//			ByteArrayOutputStream baos = new ByteArrayOutputStream();
//			// Writes data to the output stream
//			baos.write(data.getBytes());
//			// Returns an array of bytes
//			byte[] byteData = baos.toByteArray();
//			System.out.print("Data using toByteArray(): " ); 
//			for (int i = 0; i < byteData.length; i++) {
//				System.out.print((char) byteData[i]);
//			}
//			// Returns a string
//			String stringData = baos.toString();
//			System.out.println("\nData using tString(): " + stringData);
//			baos.close();
//			
//			
//		}catch(IOException e) {
//			e.getStackTrace();
//		}
		
///////////////////////////////////////////////////////////////////////////////////////////////////
		
//											ObjectInputStream and ObjectOutputStram
//											writing and reading from and on a file:
		
//		int data1 = 5;
//		String data2 = "this is progrmize";
//
//		try {
//
//			// Writing to the file using ObjectOutputStream
//			FileOutputStream fio = new FileOutputStream("abc.txt");
//			ObjectOutputStream oos = new ObjectOutputStream(fio);
//			oos.writeInt(data1);
//			oos.writeObject(data2);
//
//			FileInputStream fis = new FileInputStream("abc.txt");
//			// Creating an object input stream
//			ObjectInputStream ois = new ObjectInputStream(fis);
//
//			// Using the readInt() method
//			System.out.println("Integer data: " + ois.readInt());
//			// Using the readObject() method
//			System.out.println("String data: " + ois.readObject());
//
//			ois.close();
//			oos.close();
//		} catch (FileNotFoundException e) {
//			e.getStackTrace();
//		} catch (IOException e) {
//			e.getStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}

		/////////////////////////////////////////////////////////////////////
		
//									ObjectInputStream and ObjectOutputStream
//									writing and reading from and on a file throgh an Object ( Class ) Dog:
		
		// Creates an object of Dog class
//		Dog dog = new Dog("Tyson", "Labrador");
//		
//		try {
//			FileOutputStream fos = new FileOutputStream("abc.txt");
//			 // Creates an ObjectOutputStream
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			// Writes objects to the output stream
//			oos.writeObject(dog);
//			
//			FileInputStream fis = new FileInputStream("abc.txt");
//			// Creates an ObjectInputStream
//			ObjectInputStream ois = new ObjectInputStream(fis);
//			// Reads the objects
//			Dog newDog = (Dog) ois.readObject();
//		
//			System.out.println("Dog name: " + newDog.name);
//			System.out.println("Dog Breed: " + newDog.breed);
//			
//			oos.close();
//			ois.close();
//			fos.close();
//			fis.close();
//			
//			
//		}catch(FileNotFoundException e) {
//			e.getStackTrace();
//		}catch(IOException e) {
//			e.getStackTrace();
//		}catch(ClassNotFoundException e){
//			e.getStackTrace();
//		}
		
		////////////////////////////////////////////////////////////////////////////////////////////////
		
//											BufferedInputStream:

//		try {
//
//			// Creates a FileInputStream
//			FileInputStream file = new FileInputStream("input.txt");
//
//			// Creates a BufferedInputStream
//			BufferedInputStream input = new BufferedInputStream(file);
//
//			// Reads first byte from file
//			int i = input.read();
//
//			while (i != -1) {
//				System.out.print((char) i);
//
//				// Reads next byte from the file
//				i = input.read();
//			}
//			input.close();
//		}
//
//		catch (Exception e) {
//			e.getStackTrace();
//		}
		
		
		
		
////////////////////////////////////////////////////////////////////////////////////////////////
		
//		try {
//
//			// Suppose, the input.txt file contains the following text
//			// This is a line of text inside the file.
//			FileInputStream file = new FileInputStream("input.txt");
//
//			// Creates a BufferedInputStream
//			BufferedInputStream buffer = new BufferedInputStream(file);
//
//			// Returns the available number of bytes
//			System.out.println("Available bytes at the beginning: " + buffer.available());
//
//			// Reads bytes from the file
//			buffer.read();
//			buffer.read();
//			buffer.read();
//
//			// Returns the available number of bytes
//			System.out.println("Available bytes at the end: " + buffer.available());
//
//			buffer.close();
//		}
//
//		catch (Exception e) {
//			e.getStackTrace();
//		}
		
		
		
		
////////////////////////////////////////////////////////////////////////////////////////////////
		
//		try {
//			// Suppose, the input.txt file contains the following text
//			// This is a line of text inside the file.
//			FileInputStream file = new FileInputStream("input.txt");
//
//			// Creates a BufferedInputStream
//			BufferedInputStream buffer = new BufferedInputStream(file);
//
//			// Skips the 5 bytes
//			buffer.skip(5);
//			System.out.println("Input stream after skipping 5 bytes:");
//
//			// Reads the first byte from input stream
//			int i = buffer.read();
//			while (i != -1) {
//				System.out.print((char) i);
//
//				// Reads next byte from the input stream
//				i = buffer.read();
//			}
//
//			// Closes the input stream
//			buffer.close();
//		}
//
//		catch (Exception e) {
//			e.getStackTrace();
//		}
		
		
		
		
		
		
		
////////////////////////////////////////////////////////////////////////////////////////////////
		
//												BufferedOutputStream:
		
//		String data = "This is a line of text inside the file";
//
//		try {
//			// Creates a FileOutputStream
//			FileOutputStream file = new FileOutputStream("output.txt");
//
//			// Creates a BufferedOutputStream
//			BufferedOutputStream output = new BufferedOutputStream(file);
//
//			byte[] array = data.getBytes();
//
//			// Writes data to the output stream
//			output.write(array);
//			output.close();
//		}
//
//		catch (Exception e) {
//			e.getStackTrace();
//		}
		
////////////////////////////////////////////////////////////////////////////////////////////////
		
		
//		String data = "This is a demo of the flush method";
//
//		try {
//			// Creates a FileOutputStream
//			FileOutputStream file = new FileOutputStream(" flush.txt");
//
//			// Creates a BufferedOutputStream
//			BufferedOutputStream buffer = new BufferedOutputStream(file);
//
//			// Writes data to the output stream
//			buffer.write(data.getBytes());
//
//			// Flushes data to the destination
//			buffer.flush();
//			System.out.println("Data is flushed to the file.");
//			buffer.close();
//		}
//
//		catch (Exception e) {
//			e.getStackTrace();
//		}
		
		
////////////////////////////////////////////////////////////////////////////////////////////////
		
//									PrintStream:
		
//		String data = "This is a text inside the file.";
//
//		try {
//			PrintStream output = new PrintStream("output.txt");
//
//			output.print(data);
//			output.close();
//		} catch (Exception e) {
//			e.getStackTrace();
//		}
		
		
		
////////////////////////////////////////////////////////////////////////////////////////////////
		
//		try {
//			PrintStream output = new PrintStream("output.txt");
//
//			int age = 25;
//
//			output.printf("I am %d years old.", age);
//			output.close();
//		} catch (Exception e) {
//			e.getStackTrace();
//		}

////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		
		
		
		
		
		
//											Reader Class
		
//		char[]array = new char[100];
//		
//		try {
//			
//			// Creates a reader using FileReader
//			Reader input = new FileReader("a.txt");
//			
//			// check if Reader is readey
//			System.out.println("is there data in the stream: " + input.ready());
//			
//			// Reads Characters 
//			input.read(array);
//			System.out.println("Data in the Stream");
//			System.out.println(array);
//			
//			input.close();
//			
//		}catch(IOException e) {
//			e.getStackTrace();
//		}
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		
//											Writer Class
		
//		String data = "This is the Data in the Outpt File";
//		
//		try {
//			
//			// Creates a Writer using the FileWriter
//			Writer output = new FileWriter("a.txt");
//			// Writes a String in the file
//			output.write(data);
//			
//			output.close();
//			
//		}catch(IOException e) {
//			e.getStackTrace();
//		}
		
		////////////////////////////////////////////////////////////////////////////////////////////
		
//											BufferedReader:
		// Creates an array of character
//		char []array = new char[100];
//		
//		try {
//			// Creates an array of character
//			FileReader file = new FileReader("a.txt");
//			// Creates a BufferedReader
//			BufferedReader input = new BufferedReader(file);
//			// Reads characters
//			input.read(array);
//			System.out.println("Data in the File");
//			System.out.println(array);
//			input.close();
//			
//		}catch(IOException e) {
//			e.getStackTrace();
//		}
		
		////////////////////////////////////////////////////////////////////////////////////////////
		
		// Creates an array of characters
//		char[] array = new char[100];
//
//		try {
//			// Suppose, the input.txt file contains the following text
//			// This is a line of text inside the file.
//			FileReader file = new FileReader("a.txt");
//
//			// Creates a BufferedReader
//			BufferedReader input = new BufferedReader(file);
//
//			// Skips the 5 characters
//			input.skip(5);
//
//			// Reads the characters
//			input.read(array);
//
//			System.out.println("Data after skipping 5 characters:");
//			System.out.println(array);
//			// closes the reader
//			input.close();
//		} catch (IOException e) {
//			e.getStackTrace();
//		}
		
		
		////////////////////////////////////////////////////////////////////////////////////////////
		
//											BufferedWriter:
		
//		String data = "This is the data in the output file with the BufferedWriter";
//
//	    try {
//	      // Creates a FileWriter
//	      FileWriter file = new FileWriter("a.txt");
//
//	      // Creates a BufferedWriter
//	      BufferedWriter output = new BufferedWriter(file);
//
//	      // Writes the string to the file
//	      output.write(data);
//
//	      // Closes the writer
//	      output.close();
//	    }
//
//	    catch (IOException e) {
//	      e.getStackTrace();
//	    }
		
		///////////////////////////////////////////////////////////////////////////////////////////
		
//		String data = "This is a demo of the flush method";
//		String data2 = "This is a new line create with the newLine method";
//	    try {
//	      // Creates a FileWriter
//	      FileWriter file = new FileWriter(" flush.txt");
//
//	      // Creates a BufferedWriter
//	      BufferedWriter output = new BufferedWriter(file);
//
//	      // Writes data to the file
//	      output.write(data);
//	      // creates a new line
//	      output.newLine();
//	      // writes on the new line
//	      output.write(data2);
//
//	      // Flushes data to the destination
//	      output.flush();
//	      System.out.println("Data is flushed to the file.");
//
//	      output.close();
//	    }
//
//	    catch(Exception e) {
//	      e.getStackTrace();
//	    }
		
	    ///////////////////////////////////////////////////////////////////////////////////////////
		
//											InputStreamReader:
		
		// Creates an array of characters
//		char[]array = new char[100];
//		
//		try {
//			
//			// Creates a FileInputStream
//			FileInputStream file = new FileInputStream("input.txt");
//			
//			// Creates an InputStreamReader
//			InputStreamReader input = new InputStreamReader(file);
//			// Reads characters from the file
//			input.read(array);
//			System.out.println("Data in the Stream: ");
//			System.out.println(array);
//			 // Closes the reader
//			input.close();
//		}catch(IOException e) {
//			e.getStackTrace();
//		}
		
		///////////////////////////////////////////////////////////////////////////////////////////
		
//		char[]array = new char[100];
//		try {
//			// Creates a FileInputStream
//			FileInputStream file = new FileInputStream("a.txt");
//			// Creates a InputStreamReader with default encoding
//			InputStreamReader input1 = new InputStreamReader(file);
//			 //Creates a InputStreamReader with specifying the encoding
//			InputStreamReader input2 = new InputStreamReader(file, Charset.forName("UTF8"));
//			
//			// returns the characters encoding of the Input Stream
//			System.out.println("Character encoding of input1: " + input1.getEncoding());
//			System.out.println("Character encoding of input2: " + input2.getEncoding());
//			
//			input1.read(array);
//			System.out.println(array);
//			// close the reader
//			input1.close();
//			input2.close();
//		}catch(IOException e) {
//			e.getStackTrace();
//		}
		
		
		////////////////////////////////////////////////////////////////////////////////////////////
		
//											OutputStreamWriter:
		
//		String data = "This is a line of text inside the file.";
//		try {
//		      // Creates a FileOutputStream
//		      FileOutputStream file = new FileOutputStream("output.txt");
//
//		      // Creates an OutputStreamWriter
//		      OutputStreamWriter output = new OutputStreamWriter(file);
//
//		      // Writes string to the file
//		      output.write(data);
//
//		      // Closes the writer
//		      output.close();
//		    }
//
//		    catch (Exception e) {
//		      e.getStackTrace();
//		    }
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		
//		String data = "This is a line of text inside the file.";
//		try {
//		      // Creates an output stream
//		      FileOutputStream file = new FileOutputStream("output.txt");
//
//		      // Creates an output stream reader with default encoding
//		      OutputStreamWriter output1 = new OutputStreamWriter(file);
//
//		      // Creates an output stream reader specifying the encoding
//		      OutputStreamWriter output2 = new OutputStreamWriter(file, Charset.forName("UTF8"));
//
//		      // Returns the character encoding of the output stream
//		      System.out.println("Character encoding of output1: " + output1.getEncoding());
//		      System.out.println("Character encoding of output2: " + output2.getEncoding());
//		      
//		      output1.write(data);
//		      output2.write(data);
//		      // Closes the reader
//		      output1.close();
//		      output2.close();
//		    }
//
//		    catch(Exception e) {
//		      e.getStackTrace();
//		    }
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		
//											FileReader:

//		// Creates an array of character
//		char[] array = new char[100];
//
//		try {
//			// Creates a reader using the FileReader
//			FileReader input = new FileReader("input.txt");
//
//			// Reads characters
//			input.read(array);
//			System.out.println("Data in the file: ");
//			System.out.println(array);
//
//			// Closes the reader
//			input.close();
//		}
//
//		catch (Exception e) {
//			e.getStackTrace();
//		}
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		
//		 try {
//		      // Creates a FileReader with default encoding
//		      FileReader input1 = new FileReader("input.txt");
//
//		      // Creates a FileReader specifying the encoding
//		      FileReader input2 = new FileReader("input.txt", Charset.forName("UTF8"));
//
//		      // Returns the character encoding of the file reader
//		      System.out.println("Character encoding of input1: " + input1.getEncoding());
//		      System.out.println("Character encoding of input2: " + input2.getEncoding());
//
//		      // Closes the reader
//		      input1.close();
//		      input2.close();
//		    }catch(Exception e) {
//		      e.getStackTrace();
//		    }
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		
//											FileWriter:
	
//		String data = "This is the data in the output file";
//
//		try {
//			// Creates a FileWriter
//			FileWriter output = new FileWriter("output.txt");
//
//			// Writes the string to the file
//			output.write(data);
//
//			// Closes the writer
//			output.close();
//		}
//
//		catch (Exception e) {
//			e.getStackTrace();
//		}
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		
//		String file = "output.txt";
//
//		try {
//			// Creates a FileReader with default encoding
//			FileWriter output1 = new FileWriter(file);
//
//			// Creates a FileReader specifying the encoding
//			FileWriter output2 = new FileWriter(file, Charset.forName("UTF8"));
//
//			// Returns the character encoding of the reader
//			System.out.println("Character encoding of output1: " + output1.getEncoding());
//			System.out.println("Character encoding of output2: " + output2.getEncoding());
//
//			// Closes the reader
//			output1.close();
//			output2.close();
//		}
//
//		catch (Exception e) {
//			e.getStackTrace();
//		}
	
	
	
	
	
		
		///////////////////////////////////////////////////////////////////////////////////////////////
							
//												StringReader:
	
//		String data = "This is the text read from StringReader.";
//
//		// Create a character array
//		char[] array = new char[100];
//
//		try {
//			// Create a StringReader
//			StringReader input = new StringReader(data);
//
//			// Use the read method
//			input.read(array);
//			System.out.println("Data read from the string:");
//			System.out.println(array);
//
//			input.close();
//		} catch (Exception e) {
//			e.getStackTrace();
//		}
	
	
	
	
		
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		
//		String data = "This is the text read from StringReader";
//		System.out.println("Original data: " + data);
//
//		// Create a character array
//		char[] array = new char[100];
//
//		try {
//			// Create a StringReader
//			StringReader input = new StringReader(data);
//
//			// Use the skip() method
//			input.skip(5);
//
//			// Use the read method
//			input.read(array);
//			System.out.println("Data after skipping 5 characters:");
//			System.out.println(array);
//
//			input.close();
//		}
//
//		catch (Exception e) {
//			e.getStackTrace();
//		}
	
	
		//////////////////////////////////////////////////////////////////////////////////////////////////
			
//											StringWriter:
		
//		String data = "This is the text in the string.";
//
//		try {
//			// Create a StringWriter with default string buffer capacity
//			StringWriter output = new StringWriter();
//
//			// Writes data to the string buffer
//			output.write(data);
//
//			// Prints the string writer
//			System.out.println("Data in the StringWriter: " + output);
//
//			output.close();
//		}
//
//		catch (Exception e) {
//			e.getStackTrace();
//		}
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		
//		String data = "This is the original data";
//
//		try {
//			// Create a StringWriter with default string buffer capacity
//			StringWriter output = new StringWriter();
//
//			// Writes data to the string buffer
//			output.write(data);
//
//			// Returns the string buffer
//			StringBuffer stringBuffer = output.getBuffer();
//			System.out.println("StringBuffer: " + stringBuffer);
//
//			// Returns the string buffer in string form
//			String string = output.toString();
//			System.out.println("String: " + string);
//
//			output.close();
//		}
//
//		catch (Exception e) {
//			e.getStackTrace();
//		}
		///////////////////////////////////////////////////////////////////////////////////////////////
		
		// 								DataInputStream and DataOutputStream
//		try 
//			(FileOutputStream fos = new FileOutputStream("output.txt");
//			DataOutputStream dos = new DataOutputStream(fos);)
//			{
//			dos.writeUTF("Caftish Hunter");
//			dos.writeInt(5);
//			dos.writeDouble(8.93);
//			dos.writeUTF("Placido Polanco");
//			dos.writeInt(-17);
//			dos.writeDouble(189.09);
//			dos.writeUTF("Esteban Loiza ");
//			dos.writeInt(345);
//			dos.writeDouble(-38.0239);
//			
//			
//			
//			}catch(IOException e){
//			e.getStackTrace();
//		}
//		
//		
//		try
//			(FileInputStream fis = new FileInputStream("output.txt");
//			DataInputStream dis = new DataInputStream(fis);)					// fis goes as an argument to the DataInputStream
//			{
//			
//			for (int i = 0; i < 3; i++) {
//				// format printf: when i use formats as written down there:
//				System.out.printf("%-15s %3d %6.2f%n", dis.readUTF(), dis.readInt(), dis.readDouble());
//			}
//			
//			
//			
//			
//			}catch(IOException e) {
//				e.getStackTrace();
//			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
