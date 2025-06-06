package LLL_30_fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class SerializationAndDeserialization_09 {

	public static void main(String[] args)throws IOException, FileNotFoundException, ClassNotFoundException {
		
//		System.out.println("How to write & read multiple Objects from a file:\n");
//		
//		File file = new File("student.txt");			// if the file does not exist, it will be created in the write process
//														// but in the read process, it can't be created
//														// here we have a write process in this example then read process
//		
//		
//		// u can do it like that:
//		
////////	FileOutputStream fos = new FileOutputStream(file);
////////	ObjectOutputStream oo = new ObjectOutputStream(fos);
//		
//	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));			// or like that
//	Student s1 = new Student(111, "Juan", 99);
//	oos.writeObject(s1);												// write the Object in a file
//		// i must serialize the Object Student here
//		
//		// after running the serialization process so the data is written inside student.txt but we can't read it there
//		// no we must create an Input Stream to read what is written inside it
//		
//		// here comes the Deserialization process: 
//		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//		Student s2 = (Student)ois.readObject();
//		System.out.println(s2);
		
		
		/////////////////////////////////////////////////////////////////////////////////
		
		
		// Array of Objectss:
		
//		Student s1 = new Student(111, "Juan", 99);
//		Student s2 = new Student(222, "Jian", 88);
//		
//		ArrayList<Student> studentList = new ArrayList<>();
//		studentList.add(s1);
//		studentList.add(s2);
//		
//		File file = new File("student.txt");
//		// write
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
//		oos.writeObject(studentList);
//		// Read
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//		ArrayList<Student> studentList2 = (ArrayList<Student>)ois.readObject();
//		
//		for(Student s: studentList) {
//			System.out.println(s);
//		}
//		oos.close();
//		ois.close();
		
		
		//////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("Example Employee( Serializierung und Derserializierung:\n");
		String fileName = "employee.ser";
//		serializeObject(fileName);
		deserializeObject(fileName);
		System.out.println();
		
		//////////////////////////////////////////////////////////////////////////////////
		
//		System.out.println("Example Student( Serializierung und Derserializierung:\n");
//		
//		Student student = new Student("Juan", 30);
//		SerializierungsDAO dao = new SerializierungsDAO();
//		dao.serialisieren(student);
//
//		Student student2 = dao.deserialisieren();
//		System.out.println(student2.getName() + " " + student.getAlter());

	}// main end
	
	
	private static void deserializeObject(String fileName) {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(fileName)))) {
			Object object = ois.readObject();
			Employee employee = (Employee) object;
			System.out.println("Employee Object is deserialized..");
			System.out.println("ID:" + employee.getId());
			System.out.println("Name:" + employee.getName());
			System.out.println("Email:" + employee.getEmail());
		} catch (Exception e) {
			e.printStackTrace();
		}// try-catch end
	}// deserializeObject(String fileName) end

	private static void serializeObject(String fileName) {

		Employee employee = new Employee();
		employee.setId(1001);
		employee.setName("KK");
		employee.setEmail("Tamer123@gmail.com");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)))) {
			oos.writeObject(employee);
			System.out.println("Employee Object is serialized..");
		} catch (Exception e) {
			e.printStackTrace();
		}// try-catch end

	}// serializeObject(String fileName) end

}// class end
