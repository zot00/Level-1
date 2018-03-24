package LeagueInvaders;

import javax.swing.Timer;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	Font titleFont;
	// GameObject GO = new GameObject(10, 10, 100, 100);
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Rocketship rocketship;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		// GO.update();
		repaint();
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}
	}

	GamePanel() { /*--------------------CONSTRUCTOR--------------------*\                                         																																																																				*/
		timer = new Timer(1000 / 60, this);
		titleFont = new Font("Arial", Font.PLAIN, 36);
		rocketship = new Rocketship(0, 0, 50, 50);
	}

	void startGame() {
		timer.start();
	}

	@Override
	public void paintComponent(Graphics g) {
		// GO.draw(g);
		if (currentState == MENU_STATE) {
			// drawMenuState(g);
			drawGameState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("a key was typed");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("a key was pressed");
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState += 1;
		}
		if (currentState > END_STATE) {
			currentState = MENU_STATE;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("a key was released");
	}

	public void updateMenuState() {

	}

	public void updateGameState() {
		rocketship.update();
	}

	public void updateEndState() {

	}

	public void drawMenuState(Graphics g) {
		g.setFont(titleFont);
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setColor(Color.YELLOW);
		g.drawString("VEGETARIAN V. SAUSAGES", 10, 100);
		g.drawString("Control character with arrows", 0, 200);
		g.drawString("Shoot with space", 0, 250);
	}

	public void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setColor(Color.MAGENTA);
		rocketship.draw(g);
		g.drawString("NIHAO", 78, 80);
	}

	public void drawEndState(Graphics g) {
		g.setFont(titleFont);
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setColor(Color.BLACK);
		g.drawString("GAME OVER", 125, 100);
		g.drawString("You killed " + "IDK" + " Enemies", 50, 150);
		g.drawString("Press ENTER to restart", 50, 500);
	}
}