package LeagueInvaders;

import java.awt.*;

public class Rocketship extends GameObject {
	int speed;
	boolean up;
	boolean down;
	boolean right;
	boolean left;

	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 5;
		// TODO Auto-generated constructor stub
	}

	public void draw(Graphics g) {
		 g.drawImage(GamePanel.rocketImg, x, y, width, height, null);
		// System.out.println("x: " + x + " y: " + y + " width: " + width + " height: "
		// + height);
	}

	public void update() {
		super.update();
		if (up) {
			y -= speed;
		}
		if (down) {
			y += speed;
		}
		if (left) {
			x -= speed;
		}
		if (right) {
			x += speed;
		}
	}
}