package lessonTwo;

import javax.swing.JLabel;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class DasFenster extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel derText;
	
	public DasFenster() {
		
		setLayout(null);		// deactivates the Layout Manager
		setVisible(true);		// Shows or hides this Window depending on the value of parameter b. 
		setSize(400, 400);		// Resizes this component so that it has width width and height height. 
		setTitle("Titel des Fensters!");
		setDefaultCloseOperation(EXIT_ON_CLOSE);		// Sets the operation that will happen by default when the user initiates a "close" on this frame
//		setDefaultCloseOperation(HIDE_ON_CLOSE);		// sets the operation what will happen by clicking the x on Hide mode
		derText = new JLabel("Nachts ist es k‰lter als Drauﬂen");
		
		//setBounds(int x, int y, int width, int height): Moves and resizes this component. The new location of the top-left corner
		// is specified by x and y, and the new size is specified by width and height. 
		derText.setBounds(100, 100, 300, 300);	// ( left right, up down, two horizontal lines closes, two vertical lines closes) 
		add(derText);		//add(Component comp): Appends the specified component to the end of this container.
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
