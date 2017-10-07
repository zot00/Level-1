import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	public static void main(String[] args) {
		TypingTutor t1 = new TypingTutor();
		t1.makeGui();
	}

	void makeGui() {
		char currentLetter = generateRandomLetter();
		JLabel jLabel = new JLabel();
		jLabel.setFont(jLabel.getFont().deriveFont(28.0f));
		jLabel.setHorizontalAlignment(JLabel.CENTER);	
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		jf.setVisible(true);
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

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		char currentLetter =generateRandomLetter();
	}
}