package LeagueInvaders;

import java.awt.*;

public class ObjectManager {
	Rocketship rocket;

	ObjectManager(Rocketship r) {
		rocket = r;
	}

	public void update() {
		rocket.update();
	}

	public void draw(Graphics g) {
		rocket.draw(g);
	}
}