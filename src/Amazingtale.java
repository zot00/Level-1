import javax.swing.JOptionPane;

public class Amazingtale {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Welcome to the amazing world of wimps!");
	while(true){
	String h = JOptionPane.showInputDialog("Who is your 'hero'? (Your 'hero' must be Hermitfleas, Maduser, or Catnip)");
	if(h.equalsIgnoreCase("Hermitfleas")){
		JOptionPane.showMessageDialog(null, "Good choice?");
		JOptionPane.showMessageDialog(null, "Hermitfleas was known as the weakest man alive.");
		JOptionPane.showMessageDialog(null, "He got his name from looking too sickly, and Deuce, his father purposely gave him away to humans so Hermetfleas would die.");
		JOptionPane.showMessageDialog(null, "Instead, he was adopted by the infamous man-goat, Iron.");
		JOptionPane.showMessageDialog(null, "When he was 25, he headed out on a 'quest', as one would call it, to kill Duece. Wonder how that went.");
		JOptionPane.showMessageDialog(null, "He befriended Ladies, the goddess of the underworld, and she unleashed the whippersnappers, the only creatures more sickly than Hermetfleas.");
		JOptionPane.showMessageDialog(null, "In fact, they were Duece's friends until he saw them, so he banished them to the depths of the ocean.");
		JOptionPane.showMessageDialog(null, "They won the checker competition with Duece just because they were so sickly, he cringed so much that his face stayed cringed so he could not see what happened on the board.");
		JOptionPane.showMessageDialog(null, "Hermetfleas was from then on known as the god of the hermits after killing Maduser.");
		JOptionPane.showMessageDialog(null, "THE END");
	}
	if(h.equalsIgnoreCase("Maduser")){
		JOptionPane.showMessageDialog(null, "Maduser was the ugliest thing alive until she met someone who didn't die from her glance.");
		JOptionPane.showMessageDialog(null, "All her ugliness melted off and she became a normal woman.");
		JOptionPane.showMessageDialog(null, "Now, there was magic put on her and to any man, she seemed beautiful.");
		JOptionPane.showMessageDialog(null, "She forced all men to give her all the chocolate in the entire world.");
		JOptionPane.showMessageDialog(null, "She then controlled the females with the chocolate, and she became the ruler of the world until she was killed by Hermetfleas.");
		JOptionPane.showMessageDialog(null, "THE END");
	}
	if(h.equalsIgnoreCase("Catnip")){
		JOptionPane.showMessageDialog(null, "Catnip was a random lady that almost nobody knew existed.");
		JOptionPane.showMessageDialog(null, "Eventually, she was chosen for the Fat Man games and of course chose the bow as her weapon.");
		JOptionPane.showMessageDialog(null, "She was the first one to die because she shot the bow instead of the arrow.");
		JOptionPane.showMessageDialog(null, "THE END");
	}
	else{
		JOptionPane.showMessageDialog(null, "Awww...");
	}
	}
}
}