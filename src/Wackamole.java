import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.*;

public class Wackamole {
	JPanel jp = new JPanel();
	JFrame jf = new JFrame();
public static void main(String[] args) {
	Wackamole w = new Wackamole();
	String h = JOptionPane.showInputDialog("How many holes for the moles?");
	int q = Integer.parseInt(h);
	w.drawButtons(q);
}
public void drawButtons(int a) {
	JButton buttons[] = new JButton[a];
	for(int i  = 0; i<buttons.length; i++) {
		jp.add(buttons[i]);
		jf.add(jp);
		jf.pack();
		jf.setVisible(true);
		buttons[i].setVisible(true);
	}
}
}