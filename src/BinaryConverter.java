import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener{
	public static void main(String[] args) {
		BinaryConverter w = new BinaryConverter();
		w.interFace();
	}
	JTextField binary;
	JTextField answer;
	String message;
	public void interFace() {
		JFrame x = new JFrame();
		JPanel y = new JPanel();
		answer = new JTextField(20);
		binary = new JTextField(20);
		JButton b = new JButton();
		answer.setText("<- Hello. Please insert binary over there.");
		x.setVisible(true);
		y.add(binary);
		y.add(b);
		y.add(answer);
		b.addActionListener(this);
		b.setText("<-convert->");
		x.add(y);
		x.pack();
	}

	String convert(String binary) {
		int asciiValue = Integer.parseInt(binary, 2);
		char theLetter = (char) asciiValue;
		return "" + theLetter;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		message = binary.getText();
		String convertedMessage = convert(message);
		answer.setText(convertedMessage);
	}

}
/*
 * We’re going to make an application that converts binary codes (8-bits) into
 * letters.
 * 
 * You’ll need a JFrame and a JPanel.
 * 
 * On the panel, put two text fields and a button. A text field is made like
 * this: JTextField answer = new JTextField(20);
 * 
 * It may look like this or you might have a better layout in mind.
 * 
 * 
 * Here is a method that will do the conversion for you.
 */