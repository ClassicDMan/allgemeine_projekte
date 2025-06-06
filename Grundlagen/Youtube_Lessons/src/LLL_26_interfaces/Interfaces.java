package LLL_26_interfaces;

public class Interfaces {
	
	/*
	 * An interface in Java is a blueprint or template of a class interface provides pure abstraction in Java SE7
	 * 
	 * 
	 * Interface has:
	 * - a list of method signatures (abstract methods)
	 * - Contract between me and the client or the programmers
	 * - Interface is only a mechanism that allows achieving multiple inheritance in Java
	 * - inheritance possibility under certain conditions
	 * - Class implements 1:M interface. Does not extend
	 * 
	 * Abstract Class													Interface
	 * 
	 * 	
	 * Class extends	(allowed)										Class implements	(allowed)
	 * 																		
	 * 															Interface extends interface	(allowed)
	 * Interfaces does not have Constructors
	 * 
	 * Tag or marker interface in Java:
	 * an empty interface is known as tag or marker interface, for Example, serializable, Eventlistener,
	 * Remote(java.rmi.Remote) are tag interfaces
	 *
	 * Why, When and benefits of Interfaces ?
	 * 
	 	-To achieve security - hide certain details and only show the important details of an object (interface).

	 	-Java does not support “multiple inheritance” (a class can only inherit from one superclass).
	 	 However, it can be achieved with interfaces, because the class can implement multiple interfaces

	 	-interface can extend an interface and can also extend multiple interfaces.

		-Loose coupling principal: independency between the classes (they will not depend on each other)

	 * 
	 * 
	 * 
	 */

}
