package LeagueInvaders;
//STEP COUNT: 7
//NUMBER COUNT: 6
/*In order to draw text, we first have to make a Font object.
1. In your GamePanel class, create a member variable of a Font object called titleFont.
2. In the constructor, initialize the Font object. The constructor of the Font class takes three parameters. The first is a String for the type of font you want to display. For now, set it to "Arial". The second parameter is for any stylization you would like to apply to the font. For now, set it to Font.PLAIN. The third parameter is for the size of the font. Set it to 48 for now.
3. Go to the drawMenuState method. You can set the font with:
g.setFont(titleFont);
You can draw text to the screen with:
        g.drawString("text", x, y);
Don't forget that you need to set the color of your text as well.
4. Add a title to the screen to match the League Invaders demo game. You may need to make more than one Font object.
5. Add the text for the Game Over screen in the drawEndState method.
6. Do not move on until your title screen and game over screen look like the demo game.*/