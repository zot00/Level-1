import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SimonSaysRecipe extends KeyAdapter {

	// Complete steps 1 - 7 before you test
	// 1. Make a JFrame variable
	JFrame frame = new JFrame();
	HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int imageIndex;
	private int tries = 0;
	private int simonSays = 0;
	Date timeAtStart;

	void makeAlbum() {
		// 2. add 4 images which match keyboard keys like this: images.put(new
		// Integer(KeyEvent.VK_UP), "image.jpg");
		images.put(new Integer(KeyEvent.VK_UP), "up.png");
		images.put(new Integer(KeyEvent.VK_DOWN), "down.png");
		images.put(new Integer(KeyEvent.VK_RIGHT), "right.png");
		images.put(new Integer(KeyEvent.VK_LEFT), "left.png");
		// 3. Tell the user to "Press the matching key when 'Simon says' otherwise press
		// a different key"
		JOptionPane.showMessageDialog(null,
				"press the matching key when 'Simon says' and otherwise press a different key."); // Bushes of love
																									// song: 2: Hey
																									// how'd my father
																									// die? 1: 49 times
																									// - we fought that
																									// beast, your old
																									// man and me. It
																									// had a chicken
																									// head with duck
																									// feet and a
																									// woman's face,
																									// too. 2: aw that's
																									// rad. 1: and it
																									// was waiting in
																									// the bushes for
																									// us. Then, it
																									// ripped off your
																									// dad's face. He
																									// was screaming
																									// something awful.
																									// In fact, there
																									// was this huge
																									// mess and i had to
																									// change the
																									// floors. 2: the
																									// floors? 1: You
																									// see, his blood,
																									// it drained into
																									// the boards and i
																									// had to change'em,
																									// but we all got a
																									// chicken-duck-woman-thing
																									// waiting for us.
																									// Every day i worry
																									// all day. about
																									// what's waiting in
																									// the bushes for
																									// us. About what's
																									// waiting in the
																									// bushes of love.
																									// Every day i worry
																									// all day. about
																									// what's waiting in
																									// the bushes for
																									// us. About what's
																									// waiting in the
																									// bushes of
																									// love.Every day i
																									// worry all day.
																									// about what's
																									// waiting in the
																									// bushes for us.
																									// About what's
																									// waiting in the
																									// bushes of love.
																									// Every day i worry
																									// all day. about
																									// what's waiting in
																									// the bushes for
																									// us. About what's
																									// waiting in the
																									// bushes of love.
																									// 1: Yo, never knew
																									// my dad, he didn't
																									// care about me.
																									// Dead horizon is
																									// all my
																									// macro-binoculars
																									// see. moisture
																									// farming all my
																									// life and not a
																									// drop spilt. My
																									// aunt and uncle,
																									// double suns, I'm
																									// sippin' blue
																									// milk. My aunt and
																									// uncle, double
																									// suns, I'm sick of
																									// blue milk. But
																									// then, a desert
																									// hobo came and
																									// told me... 1:
																									// We've all got a
																									// chicken-duck-woman-thing
																									// waiting for us.
																									// Every day i worry
																									// all day. about
																									// what's waiting in
																									// the bushes for
																									// us. About what's
																									// waiting in the
																									// bushes of love.
																									// Every day i worry
																									// all day. about
																									// what's waiting in
																									// the bushes for
																									// us. About what's
																									// waiting in the
																									// bushes of love.
																									// Hold me when i
																									// open like a
																									// flower. Hold me
																									// right. Yeah, i
																									// haven't had to
																									// bake for a girl
																									// in a long time. a
																									// long time. 2: I
																									// think my cookin's
																									// awesome. 1: i got
																									// her picture in my
																									// photo wagon. 2:
																									// haha keep it
																									// poppin. 1: yeah,
																									// i'd bet she'd
																									// love to
																									// honky-tonk. 3:
																									// i'd bet she'd
																									// love to
																									// honky-tonk 1:
																									// that's what i
																									// said. 2: I used
																									// to glide across
																									// the desert you
																									// know i used glide
																									// on my speeder and
																									// pray that i dont
																									// find what i dont
																									// wanna find.
																									// hiding for me
																									// round the corner,
																									// no, no, no.
																									// waiting for us. i
																									// used to glide
																									// across the
																									// desert,
		// 4. call the method to show an image
		showImage();
	}

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		// 16. make a points variable to track the score. tell the user their score at
		// the end.
		int points = 0;
		// 17. if the keyCode matches the imageIndex and "Simon says..." increase their
		// score
		if (keyCode == imageIndex) {
			points = points + 1;
			speak("Correct!");
		}
		// 18. if the keyCode doesn't match the imageIndex and "Simon didn't say..."
		// increase their score
		else if (keyCode != imageIndex) {
			points = points - 1;
			speak("Incorrect!");
		} else {
			points = points - 1;
			speak("Incorrect!");
		}
		// 19. Use the speak method to tell the user if they were correct or not
		// 13. increment tries by 1
		tries++;
		// 14. if tries is greater than 9 (or however many you want)
		if (tries > 9) {
			System.exit(0);
		}
		// 15. exit the program

		// 11. dispose of the frame
		frame.dispose();
		// 12. call the method to show an image
		showImage();
	}

	private void showImage() {
		// 5. initialize your frame to a new JFrame()
		frame = new JFrame();
		// 6. set the frame to visible
		frame.setVisible(true);
		// frame.add(getNextRandomImage()); //7. rename to the name of your frame
		frame.add(getNextRandomImage());
		// 8. set the size of the frame
		frame.setSize(1000, 1000);
		// 9. add a key listener to the frame
		frame.addKeyListener(this);
		// 10. Use the speak method to either say "Simon says press this key" or "Press
		// this key"
		// Hint: use the simonSays int and a random number
		Random r = new Random();
		simonSays = r.nextInt(2);
	}

	private Component getNextRandomImage() {
		this.imageIndex = new Random().nextInt(4) + 37;
		return loadImage(images.get(imageIndex));
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		new SimonSaysRecipe().makeAlbum();
	}
}

/*
 * 20. add a timer ~~~ where the code starts running ~~~ timeAtStart = new
 * Date();
 *
 * ~~~ where the code ends ~~~ Date timeAtEnd = new Date();
 * System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
 * System.exit(0);
 */