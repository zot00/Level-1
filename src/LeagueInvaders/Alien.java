package LeagueInvaders;

import java.awt.*;

public class Alien extends GameObject {

	Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	public void update() {
		y+=1;
	}

	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.drawRect(x, y, width, height);
	}
}