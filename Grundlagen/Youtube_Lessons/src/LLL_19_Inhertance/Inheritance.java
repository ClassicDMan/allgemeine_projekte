package LLL_19_Inhertance;

public class Inheritance {

	/*
	 * A subclass inherits all the members (fields, methods, and the nested classes)
	 * from its superclass. Constructors are not members so they are not inherited
	 * by subclasses, but the constructor of the superclass can be invoked from the
	 * subclass.
	 * 
	 * I can adjust the methods and the body of the method (attributes definition)
	 * with overriding.
	 * But the constructor I cannot adjust the body of constructor
	 * or overriding it, I can just invoke them from super class. 
	 * 
	 * Multi-level inheritance is allowed. 
	 * 
	 * Multiple inheritance here is not allowed but with
	 * multiple interfaces could be allowed under some conditions. 
	 * 
	 * Generalization is used in the superclass. 
	 * In specialization the object of the Subclass inherits
	 * properties of the superclass plus the properties of itself 
	 * 
	 * Inheritance represents the is-relationship, which is also known as a parent-child
	 * relationship, is - relationship is one in which data members of one class is
	 * obtained into another class through the concept of inheritance. 
	 * 
	 * Example: 
	 * 
	 * public class Developer extends Employee{
	 *  … 
	 *  } 
	 * Public class Supplier extends Employee{
	 * … 
	 * }
	 * 
	 * Developer obj1 = new developer(); 
	 * Supplier obj2 = new supplier();
	 * 
	 * Developer is a Employee 
	 * Supplier is a Employee
	 * 
	 * Attributes that have private access modifier cannot be inherited because it
	 * is private, but I can access the public getter and setter methods, to adjust
	 * the attributes inside of them.
	 * 
	 * Public modifier + : 
	 * the access level of a public modifier is everywhere.
	 * 
	 * Private modifier - : 
	 * access is allowed within the class. it cannot be
	 * accessed from outside the class. 
	 * 
	 * Default (Package-private) modifier ~ :
	 * access is allowed within the package. 
	 * 
	 * Protected modifier # : the access level
	 * of a protected modifier is within the package, and also outside the package
	 * but through a child class only. If you do not make the child class, it cannot
	 * be accessed from outside the package. Attributes and methods could be like
	 * that.
	 * 
	 */

}
