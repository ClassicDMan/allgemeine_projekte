package Lesson2_Bro;

import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MainLabels {

	public static void main(String[] args) {
		
//		JLabel = a GUI display area for a string of text, an image or both
		
		ImageIcon image = new ImageIcon("nike.jpg");
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		JLabel label = new JLabel();				//this creates a label,    u can pass the text also inside the constructor
		label.setText("Bro, do u like Nike?");		// set text of label
		label.setIcon(image);
		
		label.setHorizontalTextPosition(JLabel.CENTER);			// set text Left Center, or Right of image icon
		label.setVerticalTextPosition(JLabel.TOP);				// set text Top, Center or Bottom of image icon
		
		label.setForeground(new Color(0x00FF00));				// set font color of text
	    label.setFont(new Font("MV Boli", Font.PLAIN, 50));		// set font of text
		label.setIconTextGap(-10);								// set gap of text to image
		label.setBackground(Color.black);						// set background color
		label.setOpaque(true);									// display the background color
		label.setBorder(border);								// 
		label.setVerticalAlignment(JLabel.CENTER);				// set vertical position of text+image within label
		label.setHorizontalAlignment(JLabel.CENTER);			// set horizontal position of text+image within label
//		label.setBounds(100, 100, 250, 250);					// set x and y position within frames as well as dimensions
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(500, 500);
//		frame.setLayout(null);
		frame.setVisible(true);
		
		frame.add(label);				// add(component)
		frame.pack();					// it comes after the add(label)
		
		
		
		
		

	}

}
