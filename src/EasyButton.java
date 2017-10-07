import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EasyButton implements MouseListener{

	/*
	 * Use the methods below to make an easy button show on the screen. 
	 * When clicked, it says some very annoying words.
	 */
	public static void main(String[] args) {
		EasyButton button = new EasyButton();
		button.showEasyButton();
	}

	JLabel easyButtonImage;

	private void showEasyButton() {
		JFrame quizWindow = new JFrame();
		quizWindow.addMouseListener(this);
		quizWindow.setVisible(true);
		URL imageURL = null;
		try {
			imageURL = new File("/Users/league/Google Drive/league-images/easy_button.jpg").toURI().toURL();
		} catch (MalformedURLException e) {
			System.err.println("Could not load file: " + imageURL);
		}
		Icon icon = new ImageIcon(imageURL);
		this.easyButtonImage = new JLabel(icon);
		quizWindow.add(easyButtonImage);
		quizWindow.pack();
	}


	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		while(true){
			speak("Dong is dumb. Stop looking at Michael. I'm the one saying this. Don't unplug me.");
			}
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		while(true){
			speak("Dong is dumb. Stop looking at Michael. I'm the one saying this. Don't unplug me.");
			}
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		while(true){
			speak("Dong is dumb. Stop looking at Michael. I'm the one saying this. Don't unplug me.");
			}
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

