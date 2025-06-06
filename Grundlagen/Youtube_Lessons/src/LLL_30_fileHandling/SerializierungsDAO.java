package LLL_30_fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializierungsDAO {
	
	/*
	Serialiezierung = Zustand Objekt + Statusinformationen in eine Folge von Bytes wandeln
	
	
	Speichern von Objektstrukturen oder Variablen und dann haben wir die Möglichkeit was mit dem zu machen
	
	Zum Beispiel wir speichern die ab mit der Hilfe von Datenbank Applikationen
	Als Daten verwenden und zwischen Anwendungen austauschen werden, es werden irgendwie übertragen werden
	
	das Prozess ist, Objekte zu einer Binären Datenstrom (Bytes) umwandeln, dann
	Können wir diese Objekte wieder laden und hier sprechen wir über Deserialisierung
	
	die Klasse muss das Interface Serializable implementieren: das Inteface ist leer, und enthält keine Methoden
	hier wirkt, dass wir hier die Klasse serialisieren möchten
	
	es gibtt zwei Vorraussetzungen:
	
	welche Attribute nicht serializieren:
	1- statische Attribute, private static String name; können wir nicht serializieren, weil es wird zu der Klasse wo es defeniert ist, zugeordnet ist
	2- transient Attribute, private transient String name; können wir nicht serializieren
	
	
	
	*/
	
	public void serialisieren(Student student) {

		File file = new File("D:\\Neuer Ordner\\ITCademy\\Test File\\student.ser");

		try (FileOutputStream outputStream = new FileOutputStream(file);
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);) {

			// wir haben hier unsere Student und möchten wir in File file speichern
			objectOutputStream.writeObject(student); // Object vom typ Student serializieren

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} // try-catch end

	}// serialisieren(Student student) end

	public Student deserialisieren() {
		Student student = null;

		File file = new File("D:\\Neuer Ordner\\ITCademy\\Test File\\student.ser");

		try (FileInputStream inpuStream = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(inpuStream);) {

			student = (Student) objectInputStream.readObject();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // try-catch end

		return student;

	}

}
