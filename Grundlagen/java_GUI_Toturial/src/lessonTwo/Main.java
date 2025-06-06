package lessonTwo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
//		JFrame fenster = new DasFenster();
//		
//		// Methoden: 
//		fenster.setAlwaysOnTop(true);
		
		
		
		
		
		
		
		////////////////////////////////////////////////////////////////
		
		// FlowLayout
		
//		JFrame frame = new JFrame();
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(500, 500);
//		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
//		
//		JPanel panel = new JPanel();					// JPanel is Container
//		panel.setPreferredSize(new Dimension(250, 250));
//		panel.setBackground(Color.LIGHT_GRAY);
//		panel.setLayout(new FlowLayout());			// FlowLayout()
//
////		JButton button1 = new JButton();
////		frame.add(button1);			// instead of that u could do that: frame.add(new JButton(...));
//		// if u don't want the panel just replace the panel with frame to the 9 Buttons
//		
//		frame.add(new JButton("1"));
//		frame.add(new JButton("2"));
//		frame.add(new JButton("3"));
//		frame.add(new JButton("4"));
//		frame.add(new JButton("5"));
//		frame.add(new JButton("6"));
//		frame.add(new JButton("7"));
//		frame.add(new JButton("8"));
//		frame.add(new JButton("9"));
//		
//		
//		panel.add(new JButton("1"));
//		panel.add(new JButton("2"));
//		panel.add(new JButton("3"));
//		panel.add(new JButton("4"));
//		panel.add(new JButton("5"));
//		panel.add(new JButton("6"));
//		panel.add(new JButton("7"));
//		panel.add(new JButton("8"));
//		panel.add(new JButton("9"));
//		
//		frame.add(panel);
//		frame.setVisible(true);
		
		/////////////////////////////////////////////////////////////////
		
		// BorderLayout
		
//		JFrame frame = new JFrame();
//		
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(500, 500);
//		frame.setLayout(new BorderLayout(10, 10));		// add margin, u can do that in Borderlayout(int , int)
//		frame.setVisible(true);
//		
//		// now we create 5 panels:
//		JPanel panel1 = new JPanel();					// JPanel is Container
//		JPanel panel2 = new JPanel();
//		JPanel panel3 = new JPanel();
//		JPanel panel4 = new JPanel();
//		JPanel panel5 = new JPanel();
//		
//		// now we set the color to each panel:
//		panel1.setBackground(Color.red);
//		panel2.setBackground(Color.green);
//		panel3.setBackground(Color.yellow);
//		panel4.setBackground(Color.magenta);
//		panel5.setBackground(Color.blue);
//		
//		panel5.setLayout(new BorderLayout());
//		
//		// setting a dimension for the panels we created inside the frame
//		panel1.setPreferredSize(new Dimension(100, 100));
//		panel2.setPreferredSize(new Dimension(100, 100));
//		panel3.setPreferredSize(new Dimension(100, 100));
//		panel4.setPreferredSize(new Dimension(100, 100));
//		panel5.setPreferredSize(new Dimension(100, 100));
//		
//		
//		//-------------sub panels 1--------------
//		// creating a sub panel in the middle
//		JPanel panel6 = new JPanel();
//		JPanel panel7 = new JPanel();
//		JPanel panel8 = new JPanel();
//		JPanel panel9 = new JPanel();
//		JPanel panel10 = new JPanel();
//		
//		// now we set the color to each panel:
//		panel6.setBackground(Color.black);
//		panel7.setBackground(Color.darkGray);
//		panel8.setBackground(Color.gray);
//		panel9.setBackground(Color.lightGray);
//		panel10.setBackground(Color.white);
//		
//		panel5.setLayout(new BorderLayout());
//		
//		panel6.setPreferredSize(new Dimension(50, 50));
//		panel7.setPreferredSize(new Dimension(50, 50));
//		panel8.setPreferredSize(new Dimension(50, 50));
//		panel9.setPreferredSize(new Dimension(50, 50));
//		panel10.setPreferredSize(new Dimension(50, 50));
//		
//		//-------------sub panels 2--------------
//		// creating a second sub panel in the middle
//		
//		JPanel panel11 = new JPanel();
//		JPanel panel12 = new JPanel();
//		JPanel panel13 = new JPanel();
//		JPanel panel14 = new JPanel();
//		JPanel panel15 = new JPanel();
//		
//		panel11.setBackground(Color.gray);
//		panel12.setBackground(Color.green);
//		panel13.setBackground(Color.cyan);
//		panel14.setBackground(Color.orange);
//		panel15.setBackground(Color.pink);
//		
//		panel10.setLayout(new BorderLayout());
//		
//		panel11.setPreferredSize(new Dimension(25, 25));
//		panel12.setPreferredSize(new Dimension(25, 25));
//		panel13.setPreferredSize(new Dimension(25, 25));
//		panel14.setPreferredSize(new Dimension(25, 25));
//		panel15.setPreferredSize(new Dimension(25, 25));
//		
//		
//		//-------------sub panels 2--------------
//		
//		panel10.add(panel11, BorderLayout.NORTH);
//		panel10.add(panel12, BorderLayout.SOUTH);
//		panel10.add(panel13, BorderLayout.WEST);
//		panel10.add(panel14, BorderLayout.EAST);
//		panel10.add(panel15, BorderLayout.CENTER);
//		
//		
//		panel5.add(panel6, BorderLayout.NORTH);
//		panel5.add(panel7, BorderLayout.SOUTH);
//		panel5.add(panel8, BorderLayout.WEST);
//		panel5.add(panel9, BorderLayout.EAST);
//		panel5.add(panel10, BorderLayout.CENTER);
//		
//		//-------------sub panels 1-----------------
//		
//		frame.add(panel1, BorderLayout.NORTH);
//		frame.add(panel2, BorderLayout.WEST);
//		frame.add(panel3, BorderLayout.EAST);
//		frame.add(panel4, BorderLayout.SOUTH);
//		frame.add(panel5, BorderLayout.CENTER);
		
		
		///////////////////////////////////////////////////////////////////////////////////
		
		// GridLayout
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		
		frame.setLayout(new GridLayout(3, 3, 10, 10));			// vertical ( 9 rows and 1 columns, test it
		
//		JButton button1 = new JButton("1");
//		frame.add(button1);
		
		frame.add(new JButton("1"));		// creating anonymous JButtons
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		
//		frame.add(new JButton("10"));			// if u add a tenth button, it will be added as if we have 3 row and 4 columns
		
		frame.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
