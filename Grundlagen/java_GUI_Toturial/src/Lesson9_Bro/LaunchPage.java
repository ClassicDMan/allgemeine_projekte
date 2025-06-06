package Lesson9_Bro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {

	JFrame frame = new JFrame();
	JButton myButton = new JButton("New Window");

	LaunchPage() {

		myButton.setBounds(100, 160, 200, 40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);

		frame.add(myButton);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// to open a new window after an event, and in our case here it is the Button trigger
		// if the Button is ever been clicked, then the Event starts, and the method actionPerformed will start initiating action
		// and new Window will be summoned 
		if (e.getSource() == myButton) {
			// colse the frame will be disposed after cliking the button inside the frame
			// when the New Window appears
			frame.dispose(); 
			NewWindow myWindow = new NewWindow();
		}

	}
}
