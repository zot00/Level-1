package LeagueInvaders;

// STEP COUNT: 10
// NUMBER COUNT: 12
/*
 * 1. Create a new class called Projectile. Have it extend GameObject the same
 * as the Rocketship class.
 * 
 * 2. Have the constructor of the Projectile class initialize the x, y, width,
 * and height variables the same way that you did for the Rocketship class.
 * 
 * 3. Create a member variable for the speed and initialize it to 10.
 * 
 * 4. Add the same update and draw methods you did for the Rocketship class.
 * 
 * 5. In the draw method, set the color to red and draw a rectangle around the
 * x, y, width, and height of the projectile.
 * 
 * 6. In the update method, decrement the y value by speed.
 * 
 * 7. In the update method, do a check of the y position. If the y position
 * becomes less than 0, set isAlive to false. This way, we will stop caring
 * about the projectile when it goes off the screen.
 * 
 * 8. Go to the ObjectManager class and create and initialize an ArrayList of
 * Projectile objects.
 * 
 * 9. Create a method called addProjectile that takes in a Projectile object.
 * The method simply adds this Projectile object to the list.
 * 
 * 10. Add code to the ObjectManager's update method that iterates through the
 * list of projectiles and calls their update method.
 * 
 * 11. Add code to the ObjectManager's draw method that iterates through the
 * list of projectiles and calls their draw method. Don't forget to pass in the
 * Graphics object.
 * 
 * 12. Go to your GamePanel class. When the SPACE key is pressed, add a new
 * Projectile object to the ObjectManager. Use the Make the width and height of
 * the projectile 10 by 10. Use the rocket's x and y position for the starting x
 * and y position of the projectile.
 * 
 * manager.addProjectile(new Projectile(rocket.x, rocket.y, 10, 10));
 * -----------------------------------------------------------------------------
 * 13. Run your program. Do you see projectiles fire when you press SPACE?
 * -----------------------------------------------------------------------------
 * 14. Adjust the starting x and y positions so that the projectile fires from
 * the center of the rocket.
 * 
 */