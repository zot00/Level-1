
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz implements MouseMotionListener {

	PhotoQuiz() throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		int score = 0;
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image URL”)
		String raikou = "http://img13.deviantart.net/3502/i/2010/210/4/9/raikou_by_celebi_yoshi.png";
		// 2. create a variable of type "Component" that will hold your image
		Component r;
		// 3. use the "createImage()" method below to initialize your Component
		r = createImage(raikou);
		// 4. add the image to the quiz window
		quizWindow.add(r);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String a1 = JOptionPane.showInputDialog("Whose that Pokemon?");
		// 7. print "CORRECT" if the user gave the right answer
		if (a1.equalsIgnoreCase("raikou")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect!");
			score--;
		}
		// 8. print "INCORRECT" if the answer is wrong
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(r);
		// 10. find another image and create it (might take more than one line
		// of code)
		String Scizor = "https://s-media-cache-ak0.pinimg.com/736x/6b/1e/f5/6b1ef580b50852b1cb41785769d02989--pokemon-word-pokemon-life.jpg";
		Component s;
		s = createImage(Scizor);
		quizWindow.add(s);
		// 11. add the second image to the quiz window
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String a2 = JOptionPane.showInputDialog("Whose that Pokemon?");
		if (a2.equalsIgnoreCase("scizor")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect!");
			score--;
		}
		// 14+ check answer, say if correct or incorrect, etc.
		JOptionPane.showMessageDialog(null, "Your Score: " + score);
		quizWindow.addMouseMotionListener(this);

	}

	public static void main(String[] args) {
		try {
			new PhotoQuiz();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "No clicking there!");
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
