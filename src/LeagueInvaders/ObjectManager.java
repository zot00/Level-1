package LeagueInvaders;

import java.awt.*;
import java.util.ArrayList;

public class ObjectManager {
	Rocketship rocket;
	ArrayList<Projectile> projectiles=new ArrayList<>();
	ObjectManager(Rocketship r) {
		rocket = r;
	}
	public void addProjectile(Projectile p) {
		projectiles.add(p);
	}
	public void update() {
		rocket.update();
		for(int i = 0; i<projectiles.size(); i++){
			projectiles.get(i).update();
		}
	}
	public void draw(Graphics g) {
		rocket.draw(g);
		for(int i = 0; i<projectiles.size(); i++){
			projectiles.get(i).update();
			projectiles.get(i).draw(g);
		}
	}
}