import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

/* Teachers: Need Gridworld handouts (4 handouts with descriptions of World, Bug, Grid and Location objects. look for laminated sheets.)
In this exercise we’ll use OBJECTS and METHODS to make a world that contains bugs and flowers.
Before you start, you need to add the gridworld.jar to your Level 1 project. 
Right click your project, then click Properties > Java Build Path > Libraries > Add External JAR.
Select the gridworld.jar under the Google Drive > league-jars, then say OK.

Use the laminated handout to complete these challenges:
1. Figure out how to get the World to show. \(º_º)/
2. Figure out how to add a Bug to the world (clue: you will need the Bug and Location objects) \(º_º)/
3. Add another bug at a random location in the world. \(º_º)/
4. Change the color of that bug to blue. \(º_º)/
5. Make the bug face to the right. \(º_º)/
6. Add flowers to the left and right of the bug.
7. Fill the whole world with flowers!
[Optional] Color the flowers in rows like the American flag (red & white)
[Optional] Use a new class to make an X out of bugs.
*/
public class Gridworld {
	public static void main(String[] args) {
		Flower f1 = new Flower();
		Flower f2 = new Flower();
		Flower f3 = new Flower();
		Flower f4 = new Flower();
		Flower f5 = new Flower();
		Flower f6 = new Flower();
		Flower f7 = new Flower();
		Flower f8 = new Flower();
		Flower f9 = new Flower();
		Flower f10 = new Flower();
		Flower f11 = new Flower();
		Flower f12 = new Flower();
		World world = new World();
		world.show();
		Bug b1 = new Bug();
		Bug b2 = new Bug();
		b1.setColor(Color.RED);
		b2.setColor(Color.BLUE);
		world.add(new Location(2, 4), b1);
		world.add(new Location(4, 8), b2);
		world.add(new Location(3, 8), f1);
		world.add(new Location(5, 8), f2);
		world.add(new Location(4, 7), f3);
		world.add(new Location(4, 9), f4);
		world.add(new Location(2, 5), f5);
		world.add(new Location(2, 3), f6);
		world.add(new Location(3, 4), f7);
		world.add(new Location(1, 4), f8);
		world.add(new Location(1, 1), f9);
		world.add(new Location(0, 1), f10);
		world.add(new Location(1, 0), f11);
		world.add(new Location(0, 0), f12);
	}
}
