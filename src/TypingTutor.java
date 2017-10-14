import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	public static void main(String[] args) {
		TypingTutor t1 = new TypingTutor();
		t1.makeGui();
	}

	JLabel jLabel = new JLabel();
	char currentLetter = generateRandomLetter();
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();

	void makeGui() {
		jLabel.setText("Letter you should type: " + currentLetter);
		jLabel.setFont(jLabel.getFont().deriveFont(28.0f));
		jLabel.setHorizontalAlignment(JLabel.CENTER);
		jf.setVisible(true);
		jLabel.setFont(jLabel.getFont().deriveFont(28.0f));
		jLabel.setHorizontalAlignment(JLabel.CENTER);
		jp.add(jLabel);
		jf.add(jp);
		jf.setTitle("Type or Die");
		jf.addKeyListener(this);
		jf.setSize(500, 300);
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	int m = 0;
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You typed: " + e.getKeyChar());
		char a = e.getKeyChar();
		if (a == currentLetter) {
			System.out.println("RIGHT");
			jp.setBackground(Color.GREEN);getClass();
			m=m+1;
			System.out.println(m + " right so far!");
		} else {
			System.out.println("WRONG");
			jp.setBackground(Color.RED);
			m=0;
		}
		currentLetter = generateRandomLetter();
		jLabel.setText("Next letter: " + currentLetter);
		if(m==10) {
			showTypingSpeed(m);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}
	Date timeAtStart = new Date();

}