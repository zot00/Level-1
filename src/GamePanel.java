import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GamePanel {
	 JFrame jframe = new JFrame();
	 JPanel jpanel = new JPanel();
	GamePanel(){
		jframe.setVisible(true);
		
	}
	
	void draw(Graphics g) {
		g.drawRect(10, 10, 10, 10);
		
	}
}