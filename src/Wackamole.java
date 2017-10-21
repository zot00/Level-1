import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Wackamole implements ActionListener {
	JPanel jp = new JPanel();
	JFrame jf = new JFrame();
	Random r = new Random();
	int currentLoc;
	JButton buttons[] = new JButton[110];

	public static void main(String[] args) {
		Wackamole w = new Wackamole();
		w.run();
	}

	public void run() {
		currentLoc = r.nextInt(buttons.length);
		drawButtons(currentLoc);
	}

	public void drawButtons(int rand) {
		jf.add(jp);
		jf.setVisible(true);
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			jp.add(buttons[i]);
			buttons[i].setVisible(true);
			buttons[i].addActionListener(this);
		}
		jf.setSize(800, 400);
		buttons[currentLoc].setText("(/*\\)");
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() != buttons[currentLoc]) {
			speak("Dork!");
		} else {
			speak("No! Don't touch the star-nosed mole's nose anymore! It's sensitiv!");
		}
	}
}