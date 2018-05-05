package LeagueInvaders;

import javax.swing.Timer;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	Font titleFont;
	public static BufferedImage alienImg;
	public static BufferedImage rocketImg;
	public static BufferedImage bulletImg;
	public static BufferedImage spaceImg;
	// GameObject GO = new GameObject(10, 10, 100, 100);
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Rocketship rocketship = new Rocketship(200, 400, 50, 50);
	ObjectManager OM = new ObjectManager(rocketship);

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		// GO.update();
		if (rocketship.isAlive == false) {
			currentState = END_STATE;
			rocketship.isAlive = true;
		}
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
		try {
			alienImg = ImageIO.read(this.getClass().getResourceAsStream("enemy.png"));
			rocketImg = ImageIO.read(this.getClass().getResourceAsStream("character.png"));
			bulletImg = ImageIO.read(this.getClass().getResourceAsStream("ammo.png"));
			spaceImg = ImageIO.read(this.getClass().getResourceAsStream("space.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void startGame() {
		timer.start();
	}

	@Override
	public void paintComponent(Graphics g) {
		// GO.draw(g);
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			rocketship.up = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			rocketship.down = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rocketship.right = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			rocketship.left = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (currentState == MENU_STATE) {
				System.out.println("reset");
				rocketship = new Rocketship(200, 400, 50, 50);
				OM = new ObjectManager(rocketship);
			}
			currentState += 1;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			OM.addProjectile(new Projectile(rocketship.x, rocketship.y, 10, 10));
		}
		if (currentState > END_STATE) {
			currentState = MENU_STATE;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			rocketship.up = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			rocketship.down = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rocketship.right = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			rocketship.left = false;
		}
	}

	public void updateMenuState() {

	}

	public void updateGameState() {
		OM.update();
		OM.checkCollision();
		OM.purgeObjects();
		rocketship.update();
		OM.manageEnemies();
	}

	public void updateEndState() {

	}

	public void drawMenuState(Graphics g) {
		g.setFont(titleFont);
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setColor(Color.YELLOW);
		g.drawString("VEGETARIAN V. PIGS", 10, 100);
		g.drawString("Control character with arrows", 0, 200);
		g.drawString("Shoot with space", 0, 250);
		OM.score = 0;
	}

	public void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setColor(Color.RED);
		g.drawString(OM.getScore() + "", 10, 10);
		OM.draw(g);
	}

	public void drawEndState(Graphics g) {
		g.setFont(titleFont);
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setColor(Color.BLACK);
		g.drawString("GAME OVER", 125, 100);
		g.drawString("You killed " + OM.getScore() + " Enemies", 50, 150);
		g.drawString("Press ENTER to restart", 50, 500);
	}
}