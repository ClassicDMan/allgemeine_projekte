package LLL_21_typesOfRelationships;

public class typesOfRelationships {
	/*
	 * 1.	Association:
	 * 
	 * The object of one class may use: 
	 * 
	 * Services(Data Members, Methods) provided by the object of another class
	 * this kind of relationship is termed as association ( is a relationship ). 
	 * 
	 * Association:
	 *- Is a connection or relation between two separate classes that are set up through their objects.
	 * 
	 *- Represents a general unary or binary relationship that describes an activity between two classes.
	 * 
	 * types of Association:
	 * 
	 * Unary					and					Binary
	 * 
	 * 1- Unary Association :
	 * 
	 * has a relationship from one sides
	 * 
	 * Class Person and Class Address ( has a relationship )
	 * 
	 * Person knows about Address
	 * Address knows nothing about Person
	 * Person has a Address ( has a relationship )
	 * Person is not a Address ( not is a relationship ) ( not inheritance )
	 * Person can go inside the address and take the things that is important for him
	 * 
	 * 2- Binary Association:
	 * Class C and Class D
	 * 
	 * Class C knows about Class D
	 * Class D knows about Class C
	 * 
	 * has a relationship from both sides
	 * 
	 * Class Student has a Class Instructor ( has a relationship )
	 * Class Instructor has a Class Student ( has a relationship )
	 * 
	 * Multiplicity
	 *		0..1		an optional instance ( zero or one )
	 *		n			exactly an instances
	 *		*			zero or more instances
	 *		1*			one or more instances
	 *		n..m		n to m instances
	 *
	 *
	 * there are 3 types of Unary Association:
	 * 1- Association most general
	 * 2- Aggregation "has a" relationship		--->	whole part relationship
	 * 3- Composition " part of" relationship	--->	whole part relationship
	 *
	 * 
	 * Aggregation "has a" relationship:
	 * 
	 * Class B is a part of a Class A
	 * 
	 * i Class A is deleted the parts ( Class B ) who is associated with will not be deleted.
	 * 
	 * A uses B = Aggregation : B exist independently from A.
	 * 
	 * Example:
	 * 
	 * Class Company has a Class Employee
	 * if the Employee left the Company, the Company will still exist.
	 * Company uses Employee, Employee exist independently in the Company
	 * 
	 * Composition :
	 * 
	 * Class B has no meaning without Class A
	 * 
	 * Class Car and Class Engine.
	 * Car cannot exist without Engine.
	 * Engine cannot exist without a Car.
	 * 
	 * in aggregation and composition object of one class owns object of the other class.
	 * 
	 * Example: UML
	 * 
	 * Car											Engine <---     
	 *	- brand		:String							- cylinderBlock		:String
	 *	- model     :int                           	- piston			:String
	 *	- color     :String                         - pistonRing		:String
	 *	- engine	:Engine	<---					- camshaft			:String
	 *
	 *	instance is defined as an Engine Class
	 *
	 *
	 *
	 *Association:
	 *public Class A{
	 *void testMethod( B objectB )
	 *}
	 *
	 *Composition:				Object is defined in the Class B, Data Member in A, if A destroyed, B will be as well
	 *public Class A{
	 *private B objectB = new B();				
	 * void testMethod(){
	 * }
	 *}
	 *
	 *Aggregation:					
	 *public Class A{				if object in Class A destroyed, object in Class B will not be destroyed
	 *private B objectB;			Object is created in Class B
	 * A( B objectB){			Constructor in A, will be invoked in Class B
	 * this.objectB = objectB;
	 * }
	 *}


	 * 

	 * 

	 * 
	 */

}
