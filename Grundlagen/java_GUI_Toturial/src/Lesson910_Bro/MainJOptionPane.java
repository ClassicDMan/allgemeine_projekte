package Lesson910_Bro;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MainJOptionPane {

	public static void main(String[] args) {

//		JOptionPane = Pop up a standard dialog box that prompts users for a value or informs them of something

//		JOptionPane.showMessageDialog(null, "This is some useless Info", "title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is more useless Info", "title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "is This some useless Info ?", "title", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Your Computer has a virus!!", "title", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Call Tech Support now or else!!!!", "title", JOptionPane.ERROR_MESSAGE);

//		JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);

//		based on the value answer has, you can connect other events with it
//		int answer = JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
//		String name = JOptionPane.showInputDialog("What is your Name : ");
//		System.out.println("Hallo " + name);

		String[] responses = { "No, you are awsome", "thank you", "blush" };

		ImageIcon icon = new ImageIcon("zz.png");
		JOptionPane.showOptionDialog(null, "You are awsome!", "secret Message", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);

	}

}
