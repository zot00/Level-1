import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class sensitivekeyboard implements KeyListener {
		String e;
	public static void main (String[] args) {
		
	}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent n) {
		// TODO Auto-generated method stub
		e = Character.toString(n.getKeyChar());
		speak(e);
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}