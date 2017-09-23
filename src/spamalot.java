import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class spamalot {
	static final String FAKE_USERNAME = "dudeguy8823.cool@gmail.com";
	static final String FAKE_PASSWORD = "georgeiscool";
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JTextField jtf = new JTextField();
	JButton jb1 = new JButton();
	JButton jb2 = new JButton();
	spamalot(){
		jtf.setVisible(true);
		jb1.setVisible(true);
		jb2.setVisible(true);
		jb1.setText("BAD");
		jb2.setText("GOOD");
		jp.add(jtf);
		jp.add(jb1);
		jp.add(jb2);
		jf.add(jp);
		jf.pack();
	}
	public static void main(String[] args) {
		spamalot();
	}
}
