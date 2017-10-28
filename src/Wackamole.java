import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Wackamole implements ActionListener {
	JPanel jp = new JPanel();
	JFrame jf = new JFrame();
	Random r = new Random();
	static int currentLoc;
	JButton buttons[] = new JButton[110];

	public static void main(String[] args) {
		Wackamole w = new Wackamole();
		w.run();
		w.whack();
	}
	
	void run() {
		jf.add(jp);
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			jp.add(buttons[i]);
			buttons[i].setVisible(true);
			buttons[i].addActionListener(this);
		}
		jf.setSize(800, 400);
		jf.setVisible(true);
		jp.setVisible(true);
	}

	public void whack() {
		currentLoc = r.nextInt(buttons.length);
		for (int i = 0; i < buttons.length; i++) {
			if(i==currentLoc) {
				buttons[i].setText("mole");
			}
			else {
				buttons[i].setText("");
			}
		}
		System.out.println(currentLoc);
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
		if(e.getSource() == buttons[currentLoc]) {
			System.out.println("yes");
			whack();
		}
		else {
			System.out.println("no");
		}
	}
}
