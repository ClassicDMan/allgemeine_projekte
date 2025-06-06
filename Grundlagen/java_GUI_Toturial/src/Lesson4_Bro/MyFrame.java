package Lesson4_Bro;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements WindowListener, ActionListener{
	
	
	JButton button;
	JLabel label;
	MyFrame(){
		
		ImageIcon icon = new ImageIcon("zz.png");
		ImageIcon icon2 = new ImageIcon("aa.png");

		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);

		button = new JButton();
		button.setBounds(100, 100, 250, 100); // sets the bounds for this button
//		button.addActionListener(e -> System.out.println("poo"));		// what will happen after i click the button, (this) as an alternative to the lambda
		button.addActionListener(this);
		button.setText("i am a button"); // text inside th button
		button.setFocusable(false); // to remove the point lines, set true to see
		button.setIcon(icon); // add Icon in the button
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD, 25)); // set Text font
		button.setIconTextGap(-5); // gap between the Icon and the text
		button.setForeground(Color.cyan);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBorder(BorderFactory.createEtchedBorder());
//		button.setEnabled(false);				// disable the button
		
		this.addWindowListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
		this.add(label);

	}
	
	
	
	public void actionPerformed(ActionEvent e) { // we can use the lambda expretion for the method and implements
													// ActionListener, if we use lambda, the i don#t need implements and this method
		if (e.getSource() == button) {
			System.out.println("poo i am the button, and i will be printed in the system.out.println");
//			button.setEnabled(false); // if u put this method here, the button will be disabled after clicking
			label.setVisible(true);
			
		}
	}



	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window Opened");
	}



	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window is closing");
	}



	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


