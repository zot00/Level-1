package LeagueInvaders;

// STEP COUNT: 13
// NUMBER COUNT: 
/* 
1. Go to this link: https://github.com/League-level2/League-Level2.github.io

2. Copy the space.png, rocket.png, alien.png, and the bullet.png files into the same package as your source code.

3. Go to your GamePanel class. Add the following member variables:
        public static BufferedImage alienImg;
        public static BufferedImage rocketImg;
        public static BufferedImage bulletImg;
        public static BufferedImage spaceImg;

4. In the constructor, add the following code.
        try {
                alienImg = ImageIO.read(this.getClass().getResourceAsStream("alien.png"));
                rocketImg = ImageIO.read(this.getClass().getResourceAsStream("rocket.png"));
                bulletImg = ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));
                spaceImg = ImageIO.read(this.getClass().getResourceAsStream("space.png"));
        } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }

5.  Go to your Rocketship class. Go to the draw method. Remove the code that sets the color and draws the rectangle.

6. Draw the rocket image like this:
        g.drawImage(GamePanel.rocketImg, x, y, width, height, null);

7. Run your game. Does the ship now look better than it did?

8. Do the same for the Alien and Projectile classes.

9. Add the space image to your game's background.

10. Celebrate!
 */