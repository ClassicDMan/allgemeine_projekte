package LLL_36_Enum;
import java.util.EnumSet;
import java.util.EnumMap;

/*
  		EnumSet is abstracted Class, i can't create an Object from it.
		EnumMap is a Class and i can create an Object from it.
		
		Benefits of using Enums in Java:
		Enum is type safe you cannot assign anything else other than predefined enum constants to an enum variable.
		Enum DayOfWeek{Sunday, Monday, …etc}
		DayOfWeek day = “Sunday" ;  Falsch
		DayOfWeek day = DayOfWeek.SUNDAY; Richtig
		
		The best feature of enum is you can use enum in Java inside switch statements
		like int or char primitive data type.
		
		The main objective of enum is to define our own data types (Enumerateddata types).
		
		Difference between Enums and Classes: 
			1.	an enum can just like a class have attributes and methods.
			The only difference is that enum constants are public, static and final
			( unchangeable - cannot be overridden).
			2.	An enum cannot be used to create objects, and it cannot extend other classes ( but it can implement interfaces)
			
			enum Vs Enum Vs Enumeration:
			enum: 
			Is a keyword which can be used to define a group of named constants.
			Enum:
			it is a class present in Java.lang package.
			Every enemy in Java is the direct child class of this class.
			Hence this enum class acts as base class for all Java enums.
			Enumeration:
			it is a interface present in Java.util package.
			We can use enumeration to get the objects one by one from the collections



 */

public class Lesson_03_Main {
	
	enum WeekDays{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}
	
	
	
	public static void main(String[] args) {
		
		EnumSet<WeekDays> oneDays = EnumSet.of(WeekDays.FRIDAY); // of() Methode
		System.out.println(oneDays);
		
		System.out.println();
		
		EnumSet<WeekDays> coupleOfDays = EnumSet.of(WeekDays.MONDAY, 
				WeekDays.TUESDAY); // of() Methode, giving more than one parameter
		System.out.println(coupleOfDays);
		
		EnumSet<WeekDays> coupleOfDay = EnumSet.of(WeekDays.MONDAY, 
				WeekDays.MONDAY); // of() Methode, giving more than one parameter, Redundanzen werden behandelt und nur einmal dargestellt.
		
		System.out.println(coupleOfDay);
		
		System.out.println();
		
		EnumSet<WeekDays> allDays = EnumSet.allOf(WeekDays.class);	// allOf() Methode
		System.out.println(allDays);
		
		EnumSet<WeekDays> rangeDays = EnumSet.range(WeekDays.WEDNESDAY, WeekDays.FRIDAY); // range() Methode
		System.out.println(rangeDays);
		
		System.out.println();
		
		EnumSet<WeekDays> noneOfDays = EnumSet.noneOf(WeekDays.class);		// noneOf() Methode
		System.out.println(noneOfDays);
		
		noneOfDays.add(WeekDays.MONDAY);					// add() Methode
		System.out.println(noneOfDays);
		
		noneOfDays.addAll(rangeDays);						// addAll() Methode
		System.out.println(noneOfDays);
		
		noneOfDays.remove(WeekDays.MONDAY);					// remove() Methode
		System.out.println(noneOfDays);
		
		noneOfDays.removeAll(rangeDays);
		System.out.println(noneOfDays);
		
		System.out.println();
		
		EnumMap<WeekDays, String> daysMap = new EnumMap<>(WeekDays.class);
		daysMap.put(WeekDays.MONDAY, " Working Day");
		daysMap.put(WeekDays.SUNDAY, " Day Off");
		System.out.println(daysMap);
		
		
		
		
		
		
		
		
	}

}
