package LLL_30_fileHandling;

import java.io.Serializable;

public class Student implements Serializable {			// it has to be serialized to write the object in the file, in main
														// Serializable is a marker interface
														// it doesn't have any thing inside it
	/*
	
	- Serializable: it gives Permission to any class that is implemented Serializable to instantiate any Object
	inside a certain file.
	instance from type Student, any Object from type Student will be serialized.
	
	-  serialization is a mechanism of converting the state of an object into a Byte stream.
	 the ObjectOutputStream is responsible to convert the Object to to byte Stream.
	-- > example: 
	 File file = new File("student.txt);
	 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
													 new FileOutputStream(new File("student.txt))
	
	- serialization: Object >>>>>>>> Byte Stream >>>>>>>> write on a file
	
	- Deserialization is the reverse process where the byte stream is 
	used to recreate the actual Java object in memory. This mechanism is
	 used to persist the object

	*/
	
	////////////////////////////////////////////////////////
	
	
//	int id;
//	String name;
//	float grade;
//	private double salary; 
//
//	public Student(int id, String name, float grade) {
//
//		this.id = id;
//		this.name = name;
//		this.grade = grade;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public float getGrade() {
//		return grade;
//	}
//
//	public void setGrade(float grade) {
//		this.grade = grade;
//	}
//
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
//	}
	
	//////////////////////////////////////////////////////////////////////////////
	
	private String name;
	private int alter;

	public Student() {

	}

	public Student(String name, int alter) {
		this.name = name;
		this.alter = alter;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

}
