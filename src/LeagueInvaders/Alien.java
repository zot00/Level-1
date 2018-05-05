package LeagueInvaders;

import java.awt.*;
import java.util.*;

public class Alien extends GameObject {
	Random random = new Random();
	Random r = new Random();
	boolean direction = true;
	int toggle = 0;
	Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	public void update() {
		super.update();
		toggle+=1;
		if(toggle>=60) {
			if(direction == false) {
				direction = true;
			}
			else if(direction == true) {
				direction = false;
			}
			toggle = 0;
		}
		y=y+random.nextInt(15)-5;
		if(direction == true) {
			x=x+r.nextInt(5);
		}
		if(direction == false) {
			x=x-r.nextInt(5);
		}
	}

	public void draw(Graphics g) {
		 g.drawImage(GamePanel.alienImg, x, y, width, height, null);
	}
}