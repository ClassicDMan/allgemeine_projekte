package java_GUI_Toturial;

import java.util.Random;

import javax.swing.JOptionPane;

public class MainOne {

	public static void main(String[] args) {
		
		//showInputDialog (Object message) throws HeadlessException method:
		//Shows a question-message dialog requesting input from the user. Thedialog uses the default frame
		// , which usually means it is centered onthe screen.
		
		String name1 = JOptionPane.showInputDialog("gib den ersten Namen ein!");
		String name2 = JOptionPane.showInputDialog("gib den zweiten Namen ein!");
		
		int num1 = name1.length();
		int num2 = name2.length();
		int sum = num1 + num2;
		
		Random random = new Random(sum);
		int zahl = random.nextInt(100) + 1;
		//showMessageDialog(Component parentComponent, Object message, String title, int messageType)
		// Component: null bedeutet dass es inder Mittes angezeigt wird
		// Object message: String message
		//String title: Program's name
		// int messageType: PLAIN_MESSAGE
		JOptionPane.showMessageDialog(null, "sie lieben sich zu " + zahl + "%", "Liebesprogramm", JOptionPane.PLAIN_MESSAGE);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
