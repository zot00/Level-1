package LeagueInvaders;
import java.awt.Dimension;
import javax.swing.*;
public class LeagueInvaders {
	JFrame jframe;
	GamePanel gamepanel;
	final static int WIDTH = 500;
	final static int HEIGHT = 800;
	public static void main(String[] args) {
		LeagueInvaders LI = new LeagueInvaders();
		LI.setup();
	}
	LeagueInvaders(){
		jframe=new JFrame();
		jframe.setVisible(true);
	}
	void setup() {
		gamepanel=new GamePanel();
		jframe.add(gamepanel);
		jframe.addKeyListener(gamepanel);
		jframe.setSize(WIDTH, HEIGHT);
		jframe.setVisible(true);
		jframe.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jframe.pack();
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gamepanel.startGame();
	}
}