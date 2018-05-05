package LeagueInvaders;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	long enemyTimer = 0;
	int enemySpawnTime = 500;
	Rocketship rocket;
	ArrayList<Projectile> projectiles = new ArrayList<>();
	ArrayList<Alien> aliens = new ArrayList<>();

	ObjectManager(Rocketship r) {
		rocket = r;
	}

	public void addProjectile(Projectile p) {
		projectiles.add(p);
	}

	public void addAlien(Alien a) {
		aliens.add(a);
	}

	public void update() {
		rocket.update();
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).update();
		}
		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).update();
		}
	}

	public void draw(Graphics g) {
		rocket.draw(g);
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).update();
			projectiles.get(i).draw(g);
		}
		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).update();
			aliens.get(i).draw(g);
		}
	}

	public void manageEnemies() {
		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addAlien(new Alien(new Random().nextInt(LeagueInvaders.WIDTH), 0, 50, 50));
			{
				enemyTimer = System.currentTimeMillis();
			}
		}
	}

	public void purgeObjects() {
		for (int i = 0; i < aliens.size(); i++) {
			if (aliens.get(i).isAlive == false) {
				aliens.remove(i);
			}
		}
		for (int i = 0; i < projectiles.size(); i++) {
			if (projectiles.get(i).isAlive == false) {
				projectiles.remove(i);
			}
		}
	}
	public void checkCollision() {
		for (int i = 0; i < aliens.size(); i++) {
			if (aliens.get(i).collisionBox.intersects(rocket.collisionBox)) {
				aliens.get(i).isAlive=false;
				rocket.isAlive=false;
			}
		}
		for (int i = 0; i < aliens.size(); i++) {
			if (aliens.get(i).collisionBox.intersects(projectiles.get(i).collisionBox)) {
				aliens.get(i).isAlive=false;
				projectiles.get(i).isAlive=false;
			}
		}
	}
}