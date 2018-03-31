package LeagueInvaders;

import java.awt.*;

public class Rocketship extends GameObject {
	int speed;
	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed=5;
		// TODO Auto-generated constructor stub
	}

	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
		//System.out.println("x: " + x + " y: " + y + " width: " + width + " height:   " + height);
	}

	public void update() {

	}
}