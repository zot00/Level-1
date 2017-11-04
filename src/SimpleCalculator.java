import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleCalculator implements ActionListener {
	String[] ops = {"+", "-", "•", "÷"};
	JPanel jp = new JPanel();
	JFrame jf = new JFrame();
	JTextField in1 = new JTextField(10);
	JTextField in2 = new JTextField(10);
	JTextField out = new JTextField();
	JComboBox operations = new JComboBox(ops);
	JButton go = new JButton();
	int inOne;
	int inTwo;

	public void GUI() {
		jf.add(jp);
		go.setText("=");
		jp.add(in1);
		jp.add(operations);
		jp.add(in2);
		jp.add(go);
		jp.add(out);
		jf.setVisible(true);
		jp.setVisible(true);
		go.addActionListener(this);
		jf.pack();
	}

	public static void main(String[] args) {
		// 1. Get 2 numbers from the user and convert them to integers.
		SimpleCalculator sc = new SimpleCalculator();
		sc.GUI();
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate
		// operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		inOne = Integer.parseInt(in1.getText());
		inTwo = Integer.parseInt(in2.getText());
		if(operations.getSelectedIndex() == 0) {
			Integer temp = inOne + inTwo;
			out.setText(temp.toString());
		}
		if(operations.getSelectedIndex() == 1) {
			Integer temp = inOne - inTwo;
			out.setText(temp.toString());
		}
		if(operations.getSelectedIndex() == 2) {
			Integer temp = inOne * inTwo;
			out.setText(temp.toString());
		}
		if(operations.getSelectedIndex() == 3) {
			Double temp = (double)inOne / (double)inTwo;
			out.setText(temp.toString());
		}
	}

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.
}