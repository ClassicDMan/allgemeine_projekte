package Lesson1_Bro;

import javax.swing.JFrame;
import java.awt.Color;

import javax.swing.ImageIcon;

public class MyFrame extends JFrame {

	public MyFrame() {

		this.setTitle("JFrame titel"); // sets title of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		this.setResizable(false); // prevent from being resize
		this.setSize(420, 420); // sets a size
		this.setVisible(true); // make frame visible

		ImageIcon image = new ImageIcon("nike.jpg"); // creates an Image Icon
		this.setIconImage(image.getImage()); // change Icon Frame
		this.getContentPane().setBackground(new Color(123, 50, 250)); // purple

	}

}
