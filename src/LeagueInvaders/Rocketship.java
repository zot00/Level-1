package LeagueInvaders;

import java.awt.*;

public class Rocketship extends GameObject {
	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	} public void draw(Graphics g) {
		g.setColor(Color.MAGENTA);
		g.fillRect(x, y, width, height);
	} public void update() {
		
	}
}