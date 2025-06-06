package LLL_36_Enum;
import java.time.DayOfWeek;
import java.time.Month;
import java.util.Arrays;
public class Lesson_01_TestMain {
	interface Test{
		
	}
	
//	enum WeekDays{					// enum can't extend but it can implement other interfaces
//		MONDAY("Working day"){
//			@Override
//			public void testMethode() {
//				System.out.println("MONDAY Methode");
//			}
//		}, TUESDAY{
//			@Override
//			public void testMethode() {
//				System.out.println("TUESDAY Methode");
//			}
//		};
		//
	
	enum WeekDays{
		
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}
	
//		String status;
//		WeekDays(String status){
//			this.status = status;
//		}
//		WeekDays(){
//			
//		}

//		public String getStatus() {
//			return status;
//		}
//
//		public void setStatus(String status) {
//			this.status = status;
//		}
//		
//		public abstract void testMethode();
//		
//		
//		
//	}
	
	public static void main(String[] args) {
		/*
		 * A Java Enum is a special Java type used to define collections of constants.

			An Enum is a special class that represents a group of constants (unchangeable variables, like final variables)
			For example:
				1.	Day{Saturday, Sunday, Monday …etc}
				2.	Country{ Kurdistan , Germany, Sweden …etc}
				3.	City{Amed, Berlin, Stockholm …etc}
				4.	Size{small, medium, large …etc}
				5.	Season{winter, spring, summer, fall}
			Each element is a constant
			In Java, enums are represented using enum data type.
			Java items are more powerful than C/C++ enums.

			The enum can be defined within or outside the class because it is similar to a class.

			enum DayOfWeek{
				Saturday, Sunday, Monday …etc
			}

		 */
		
//		System.out.println(WeekDays.TUESDAY.getStatus());
//		WeekDays.MONDAY.testMethode();
		
//		System.out.println(DayOfWeek.FRIDAY);
//		System.out.println(Month.NOVEMBER);
		
		
		
		// ordinal() method returns the position of an enum constant.
		System.out.println(WeekDays.MONDAY.ordinal());		
		System.out.println(WeekDays.WEDNESDAY.ordinal());
		
		System.out.println();
		
		// compareTo() Method compares the enum constants based on their ordinal
		System.out.println(WeekDays.MONDAY.compareTo(WeekDays.MONDAY));
		System.out.println(WeekDays.TUESDAY.compareTo(WeekDays.WEDNESDAY));
		
		System.out.println();
		
		// toString() Method returns a string representation of the enum constants.
		System.out.println(WeekDays.MONDAY.toString());
		System.out.println(WeekDays.TUESDAY.toString() == "TUESDAY");
		// name() method returns the defined name of an enum constant in string form
		// the returned value from the name() method is final.
		System.out.println(WeekDays.MONDAY.name());
		System.out.println(WeekDays.WEDNESDAY.name() == "WEDNESDAY");
		
		System.out.println();
		
		// valueOf() method takes a string and returns an enum constant having the same String
		System.out.println(WeekDays.valueOf("MONDAY"));
		System.out.println(WeekDays.valueOf("FRIDAY"));
		
		System.out.println();
		
		// values() method returns an array of enum type containing all the enum constants.
		
		for(WeekDays day : WeekDays.values()) {
		System.out.println(day);	
		}

		System.out.println(Arrays.toString(WeekDays.values()));
		
		System.out.println();
		
		WeekDays day1 = WeekDays.FRIDAY;
		System.out.println(day1);
		if(day1.equals(WeekDays.FRIDAY)) {
			System.out.println("Something will happen");
		}
		
		
		
		
		
		
////		int value = 1;
//		
//		Numbers value = Numbers.TWO;
//		
////		final int ONE = 1;
////		final int Two = 2;
////		final int Three = 3;
//		
//		switch(value) { // 1 2 3
//			case ONE: System.out.println("1");
//			break;
//			case TWO: System.out.println("2");
//			break;
//			case THREE: System.out.println("3");
//			break;
//		}
		
		
		
	}

}
