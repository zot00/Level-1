import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleClicker implements ActionListener{
	public static void main(String[] args) {
		chuckleClicker joke = new chuckleClicker();
		joke.makeButtons();
	}
	JButton jk = new JButton();
	JButton pl = new JButton();
	public void makeButtons(){
		JFrame j = new JFrame();
		j.setVisible(true);
		JPanel h = new JPanel();
		j.add(h);
		h.add(jk);
		h.add(pl);
		pl.setText("Punch Line");
		jk.setText("Joke");
		j.pack();
		jk.addActionListener(this);
		pl.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jk){
			JOptionPane.showMessageDialog(null, "Twinkle, twinkle little star, how I want to hit you with my car. Throw you from a tree so high, hope you break your neck and die...");
			JOptionPane.showMessageDialog(null, "Roses are red. Violets are red. Trees are red. Bushes are red. Tulips are red. Your garden is on fire.");
			JOptionPane.showMessageDialog(null, "You must have been born on a highway. That's where most accidents happen.");
		}else if(e.getSource() == pl){
			JOptionPane.showMessageDialog(null, "Computer: Why did the chicken cross the road?");
			String l = JOptionPane.showInputDialog("Input your reply");
			JOptionPane.showMessageDialog(null, "You: " + l);
			JOptionPane.showMessageDialog(null, "Computer: To get to the ugly witch/wizard's house.");
			JOptionPane.showMessageDialog(null, "Computer: Knock knock.");
			JOptionPane.showMessageDialog(null, "You: Who's there?");
			JOptionPane.showMessageDialog(null, "Computer: The chicken.");
		}
	}
}
/*Make a ChuckleClicker class, a main method and a makeButtons method. Put a pop-up in the makeButtons method and get it working. You will need to instantiate your class and call method an instance of it. 

Make a JFrame in makeButtons() method and get it to show.

Add a JPanel and two JButtons and get them to show up like this:

*[Optional] Customize your GUI with setText, setSize, etc.

Make a pop-up that says “hi” when either of the buttons are pressed. You will need to add listeners to the buttons for this to work.

Check if the ActionEvent came from the joke button or the punchline button.  
if(arg0.getSource() == jokeButton)
You might need to move the declaration of your buttons above the the makeButtons() method.

Use JOptionPane to print the joke or the punchline depending on which button was clicked.
*/