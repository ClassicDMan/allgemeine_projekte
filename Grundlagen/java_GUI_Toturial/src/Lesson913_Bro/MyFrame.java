package Lesson913_Bro;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {

	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton tacoButton;
	ImageIcon pizzaIcon;
	ImageIcon hamburgerIcon;
	ImageIcon tacoIcon;

	MyFrame() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		pizzaIcon = new ImageIcon("pizza.png");
		hamburgerIcon = new ImageIcon("hamburger.png");
		tacoIcon = new ImageIcon("taco.png");

		pizzaButton = new JRadioButton("Pizza");
		hamburgerButton = new JRadioButton("Hamburger");
		tacoButton = new JRadioButton("Taco");

		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(tacoButton);
		pizzaButton.setIcon(pizzaIcon);
		hamburgerButton.setIcon(hamburgerIcon);
		tacoButton.setIcon(tacoIcon);

		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		tacoButton.addActionListener(this);

		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(tacoButton);
		this.pack();
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pizzaButton) {
			System.out.println("you ordered a Pizza");
		} else if (e.getSource() == hamburgerButton) {
			System.out.println("you ordered a Hamburger");
		} else if (e.getSource() == tacoButton) {
			System.out.println("you ordered a Taco");
		}

	}
	

}
