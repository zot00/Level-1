import java.io.IOException;

import javax.swing.JOptionPane;

public class Stephen_Hawking {

	// 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args) {
		while (true) {
			String p = JOptionPane.showInputDialog("Input sentence/story");
			String q = JOptionPane.showInputDialog("How many times would you like to repeat it?");
			int n = Integer.parseInt(q);
			for (int i = 0; i < n; i++) {
				speak(p);
			}
		}
	}
	// 2. ask the user for a sentence
	// 3. call the speak method below and send it the sentence
	// 4. repeat steps 2 and 3 a lot of times

	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

// Copyright Wintriss Technical Schools 20148