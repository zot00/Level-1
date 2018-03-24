package LeagueInvaders;

// STEP COUNT: 8
// NUMBER COUNT: 10
/*
 * 1. In your GameObject class, delete all the code inside the update and draw
 * methods, but do not delete the methods.
 * 
 * 2. Create a new class called Rocketship. This will be the class to control to
 * the ship. Yep!
 * 
 * 3. Make this class extend from GameObject. This makes the Rocketship class
 * automatically have all the methods and variables of the GameObject class.
 * public class Rocketship extends GameObject { }
 * 
 * 4. Add a constructor that takes in parameters for the x, y, width, and height
 * variables. Initialize them by calling the GameObject constructor using
 * super() and pass in the parameters.
 * 
 * 5. Inside the Rocketship class, create an update and a draw method. Make sure
 * they are spelled the same as the GameObject class. Also, make sure the draw
 * method takes in the Graphics object. For now, we'll draw all of our game
 * objects using primitive shapes and colors. We'll change them to pictures
 * later.
 * 
 * 6. In the draw method of the Rocketship class, set the color to blue and draw
 * a box around the x, y, width, and height of the ship. g.setColor(Color.BLUE);
 * g.fillRect(x, y, width, height);
 * 
 * 7. Go to your GamePanel class and create an object of the Rocketship class in
 * the member variables. Start it at 250, 700 and make its size 50 by 50.
 * 
 * 8. In the updateGameState method, call the Rocketship object's update method.
 * 
 * 9. In the drawGameState method, call the Rocketship object's draw method.
 * Don't forget to pass in the Graphics object.
 * --------------------------------------------------------------------------------------------------
 * 10. Run your program. Do you see your blue ship?
 * --------------------------------------------------------------------------------------------------
 * 11. Add an integer member variable to the Rocketship class called speed.
 * 
 * 12. In the Rocketship class constructor, initialize speed to 5.
 * 
 * CHALLENGE! Do not move on until this has been completed. Add code to your
 * program so that the Rocketship will move with the arrow keys. You will need
 * to use the keyPressed and keyReleased method inside the GamePanel class. You
 * will also need to use the Rocketship's update method along with the speed
 * variable. Feel free to create more variables as needed. There are multiple
 * ways to solve this. Do not move on until the teacher has verified your
 * program.
 */