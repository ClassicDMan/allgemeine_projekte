package LLL_29_anonymous3_JButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JFrame("Different ways of creating J buttons") {

			{ // initializer Block primary, begin

				getContentPane().setLayout(new FlowLayout());

				JButton b1 = new JButton("Click1");

				class MyActionListener implements ActionListener {
					public void actionPerformed(ActionEvent e) {
						System.out.println("1!");
					}

				}

				b1.addActionListener(new MyActionListener());
				add(b1);

				JButton b2 = new JButton("Click2");

				b2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						System.out.println("2!");

					}
				});
				add(b2);

				add(new JButton("Click3") {
					{ // initializer Block JButton 3, begin
						addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								System.out.println("3!");

							}
						});
					} // initializer Block JButton 3, end
				});

				add(new JButton("Click4") {
					{ // initializer Block JButton 4, begin
						addActionListener(e -> System.out.println("4!"));
					} // initializer Block JButton 4, end
				});
				pack();
				setVisible(true);

			}// initializer Block primary, end

		};
	}
}
