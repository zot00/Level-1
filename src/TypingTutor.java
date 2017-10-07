import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TypingTutor {
	public static void main(String[] args) {
		TypingTutor t1 = new TypingTutor();
		t1.makeGui();
	}

	void makeGui() {
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		jf.setVisible(true);
		jf.add(jp);
		jf.setTitle("Type or Die");
		jf.setSize(500, 300);
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}
}