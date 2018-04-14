package LeagueInvaders;

// STEP COUNT: 11
// NUMBER COUNT: 10
/* 
 * 1. Create a new class called Alien that also extends GameObject.
 * 
 * 2. Add a constructor that initializes the x, y, width, and height variables
 * same as the Rocketship and Projectile classes.
 * 
 * 3. Add the update and draw methods same as the Rocketship and Projectile
 * classes.
 * 
 * 4. In the draw method, draw a yellow box around the x, y, width, and height
 * variables.
 * 
 * 5. In the update method, increment the y variable.
 * 
 * 6. Go to the ObjectManager class. Create an ArrayList of Alien objects.
 * 
 * 7. Create a method called addAlien that takes in an Alien and adds it to the
 * list.
 * 
 * 8. Add to the update and draw methods so the enemies get updated and drawn.
 * 
 * 9. In the ObjectManager class, create a method called manageEnemies. You can
 * come up with your own algorithm for spawning new enemies or just copy the
 * method below. If you use the method below, you will need to create two new
 * member variables. One is a long called enemyTimer that can be initilized to
 * 0. The other is an int called enemySpawnTime. This is the delay before new
 * enemies arrive. The value is in milliseconds, so 1000 = 1 second. public void
 * manageEnemies(){ if(System.currentTimeMillis() - enemyTimer >=
 * enemySpawnTime){ addAlien(new Alien(new
 * Random().nextInt(LeagueInvaders.WIDTH), 0, 50, 50));
 * enemyTimer = System.currentTimeMillis(); } }
 * -----------------------------------------------------------------------------
 * 10. Create a void method in the ObjectManager class called purgeObjects().
 * Add code to the purgeObjects method to remove any dead game objects.
 * -----------------------------------------------------------------------------
 * 11. Go to the GamePanel class. From the updateGameState method, call the
 * ObjectManager's manageEnemies method.
 * 
 * 12. Run your game. Do you see enemies appearing?
 * 
 * CHALLENGE Add code to the update method of the Alien class to give the aliens
 * a unique moving pattern. Try to make it fun but challenging.
 */