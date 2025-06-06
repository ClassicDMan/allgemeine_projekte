package Lesson914_Bro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame extends JFrame implements ActionListener{

	JComboBox comboBox;
	JTextArea textArea;

	MyFrame() {

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(400, 400);
		this.setResizable(true);

		String[] animals = { "Dog", "Cat", "Bird" };
//		Double[]animals = {1.1, 2.2, 3.3, 4.4};
		comboBox = new JComboBox(animals); // comboBox can hold just array reference DataTypes like Strings and
											// WrapperClasses
		comboBox.addActionListener(this);

//		comboBox.setEditable(true);			// it means i can edit to the menu of selections, check the program
//		comboBox.addItem("Horse");
//		System.out.println(comboBox.getItemCount());
//		comboBox.insertItemAt("Pig", 0);		// this puts an Object in the List, at a certain index
//		comboBox.setSelectedIndex(0);			// when program runs, Item 0 will be selected
//		comboBox.removeItem("cat");
//		comboBox.removeItemAt(0);
//		comboBox.removeAll();
		
		textArea = new JTextArea();
		textArea.setBounds(100, 500, 200, 200);
		textArea.setFont(new Font("Consola", Font.PLAIN, 35));
		textArea.setBackground(Color.white);
		textArea.setBorder(BorderFactory.createLineBorder(Color.black, 2));

		Container c = new Container();

		this.add(textArea);
		this.add(comboBox);
//		this.pack();
		this.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());
//			System.out.println(comboBox.getSelectedIndex());
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
