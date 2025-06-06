package LLL_31_GUILesson;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class GuiTaschenRechner extends JFrame {

	private JLabel labelOperand1; // Label for Operand 1
	private JLabel labelOperand2; // Label for Operand 2
	private JLabel labelOperator; // Label for the operator

	private JTextField fieldOperand1; // Text field for entering Operand 1
	private JTextField fieldOperand2; // Text field for entering Operand 2

	private JButton buttonRechnen; // Button for performing the calculation

	private String titel; // Title for the JFrame
	private String operator; // Arithmetic operator for the calculation

	public GuiTaschenRechner(String titel, String operator) {
		this.operator = operator;

		setTitle(titel); // Set the title of the JFrame
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Set the close operation when the window is closed

		setLayout(new FlowLayout()); // Set the layout manager for the JFrame

		setSize(250, 125); // Set the size of the JFrame
		setResizable(false); // Make the JFrame not resizable or resizable

		initComponents(); // Initialize the components of the GUI

		add(labelOperand1); // Add the components to the JFrame
		add(labelOperand2);
		add(fieldOperand1);
		add(labelOperator);
		add(fieldOperand2);
		add(buttonRechnen);

		setLocationRelativeTo(null); // Set the location of the JFrame to the center of the screen
		setVisible(true); // Make the JFrame visible
	}

	private void initComponents() {
		labelOperand1 = new JLabel("1. Operand       "); // Create a label for Operand 1
		labelOperand2 = new JLabel("          2. Operand    "); // Create a label for Operand 2
		labelOperator = new JLabel(operator); // Create a label for the operator

		fieldOperand1 = new JTextField(8); // Create a text field for entering Operand 1
		fieldOperand2 = new JTextField(8); // Create a text field for entering Operand 2

		buttonRechnen = new JButton("Rechnen!"); // Create a button for performing the calculation
		buttonRechnen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int op1 = Integer.parseInt(fieldOperand1.getText()); // Get the value of Operand 1
					int op2 = Integer.parseInt(fieldOperand2.getText()); // Get the value of Operand 2

					int ergebnis; // Variable to store the result
					if (operator.equals("+")) {
						ergebnis = op1 + op2; // Addition
					} else if (operator.equals("-")) {
						ergebnis = op1 - op2; // Subtraction
					} else if (operator.equals("/")) {
						ergebnis = op1 / op2; // Division
					} else if (operator.equals("*")) {
						ergebnis = op1 * op2; // Multiplication
					} else {
						ergebnis = Integer.MAX_VALUE; // Invalid operator
					}

					JOptionPane.showMessageDialog(GuiTaschenRechner.this, "Ergebnis: " + ergebnis, "Berechnet",
							JOptionPane.INFORMATION_MESSAGE);

					fieldOperand1.setText(""); // Clear Operand 1 text field
					fieldOperand2.setText(""); // Clear Operand 2 text field
				} catch (NumberFormatException numberFormat) {
//					numberFormat.printStackTrace();
					System.out.println(numberFormat); // Print the exception message
				}
			}
		});
	}
}
