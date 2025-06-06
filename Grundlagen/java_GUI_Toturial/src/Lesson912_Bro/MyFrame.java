package Lesson912_Bro;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {

	JButton button;
	JCheckBox checkBox;
	ImageIcon xIcon;
	ImageIcon checkIcon;

	MyFrame() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		xIcon = new ImageIcon("False.png");
		checkIcon = new ImageIcon("richtig.png");

		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);

		checkBox = new JCheckBox();
		checkBox.setText("I'm not a Robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
		checkBox.setIcon(xIcon);			// set the Image we choose up there as an icon for the x checkBox
		checkBox.setSelectedIcon(checkIcon); // hide it to understand what does it do

		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);

	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println( checkBox.isSelected());
		}
		
		
	}
}
