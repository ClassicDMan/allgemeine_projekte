package infrastructure.messageBroker;

public class Event {
	
	String eventtype;
	Object parameter1;
	Object parameter2;
	Object parameter3;
	
	public Event () {
	}
	
	public Event (String eventtype, Object parameter1, Object parameter2, Object parameter3) {
		this.eventtype = eventtype;
		this.parameter1 = parameter1;
		this.parameter2 = parameter2;
		this.parameter3 = parameter3;
	}
	
	public Event (String eventtype, Object parameter1, Object parameter2) {
		this.eventtype = eventtype;
		this.parameter1 = parameter1;
		this.parameter2 = parameter2;
	}
	
	public Event (String eventtype, Object parameter1) {
		this.eventtype = eventtype;
		this.parameter1 = parameter1;
	}
	
	public String getEventtype() {
		return this.eventtype;
	}
	
	public Object getParameter1() {
		return this.parameter1;
	}
	
	public Object getParameter2() {
		return this.parameter2;
	}
	
	public Object getParameter3() {
		return this.parameter3;
	}
	
//	public Object getParameter2() {
//		return this.parameter2;
//	}

}
