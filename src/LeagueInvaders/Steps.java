package LeagueInvaders;

// STEP COUNT: 12
// NUMBER COUNT: 10
/* 
 * 1. In your GameObject class, create an object of the Rectangle class in your
 * member variables. Call this object collisionBox. You will have to import the
 * class.
 * 
 * 2. Initialize the collision box in the GameObject constructor. It takes four
 * parameters. Use the x, y, width, and height variables.
 * 
 * 3. In the update method of the GameObject class, update the collision box
 * with the x, y, width, and height variables. collisionBox.setBounds(x, y,
 * width, height);
 * 
 * 4. At the very top of the update method inside the Rocketship class, add this
 * line: super.update();
 * 
 * 5. Add these same line to the update method in the Alien and the Projectile
 * classes.
 * 
 * 6. Go to the ObjectManager class and create a method called checkCollision.
 * 
 * 7. Add code to the checkCollision method that checks if the player collides
 * with any enemies. If so, set the player's isAlive variable to false.
 * 
 * for(Alien a : alienList){ if(rocket.collisionBox.intersects(a.collisionBox){
 * rocket.isAlive = false; } }
 * 
 * 8. Add code that iterates through all the projectiles and all the aliens. If
 * any of them collide, set their isAlive variables to false.
 * 
 * 9. Go to the GamePanel class. In the updateGameState method, use your
 * ObjectManager object to call the checkCollision method and the purgeObjects
 * method.
 * 
 * 10. Run your program. Do the aliens and ship disappear when they are supposed
 * to?
 * 
 * 11. In the updateGameState method, create an if statement that checks the
 * isAlive variable of your Rocketship object. If it is false, set the
 * currentState equal to END_STATE
 * -----------------------------------------------------------------------------
 * 12. In the ObjectManager class, create a member integer called score and
 * initialize it to zero.
 * -----------------------------------------------------------------------------
 * 13. Create a getter for the score variable.
 * 
 * 14. Increment the score by one every time an enemy is killed by a projectile.
 * 
 * 15. Use the getScore method in the ObjectManager class to update the player's
 * score.
 * 
 */