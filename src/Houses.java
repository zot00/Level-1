import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*1. have the tortoise start in the bottom left corner

2. draw a house of height 100 with grass after it. This shape: |**|_

3. extract the piece of code that draws the house into a method. Draw 10 houses.

4. Change the method to take int height as a parameter. Draw 9 houses of different heights

5. Make the method take a String instead of a height. 	
	
“small” 		60
“medium”	 	120
“large”			250

6. Make the method take a color as well as a height. The houses are drawn in that color.

[optional] Set the scene to night time by setting the background to black using Tortoise.getBackgroundWindow().setColor

7. Give the houses peaked roofs

8. Extract that roof code into a method “drawPointyRoof” and create a new method: “drawFlatRoof”.

9. make large houses have flat rooves



*/
public class Houses {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("How many flat-rooved houses would you like Bobby to draw?");
		String b = JOptionPane.showInputDialog("How many pointy-rooved houses would you like Cobble to draw?");
		int a2 = Integer.parseInt(a);
		int b2 = Integer.parseInt(b);
		drawPointyRoof(b2);
		drawFlatRoof(a2);
	}
	static void drawFlatRoof(int amount){
		Robot r = new Robot();
		r.setX(0);
		r.setY(950);
		r.penDown();
		r.turn(90);
		r.move(100);
		for(int i = 0; i< amount; i++){	
			r.setSpeed(1000);
			r.turn(-90);
			r.move(200);
			r.turn(90);
			r.move(50);
			r.turn(90);
			r.move(200);
			r.turn(-90);
			r.move(156);
		}
	}
	static void drawPointyRoof(int amount){
		Robot r = new Robot();
		r.setX(0);
		r.setY(950);
		r.penDown();
		r.turn(90);
		r.move(100);
		for(int i = 0; i<amount; i++){
			r.setSpeed(1000);
			r.penUp();
			r.move(100);
			r.penDown();
			r.turn(-90);
			r.move(200);
			r.turn(-90);
			r.move(25);
			r.turn(120);
			r.move(120);
			r.turn(120);
			r.move(120);
			r.turn(120);
			r.move(120);
			r.move(-100);
			r.turn(-90);
			r.move(200);
			r.turn(-90);
			r.move(25);
		}
	}
}