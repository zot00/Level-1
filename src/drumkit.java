import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class drumkit extends MouseAdapter {

    JLabel drumLabelWithImage;

    public static void main(String[] args) throws Exception {
   	 new drumkit().getGoing();
    }

    private void getGoing() throws MalformedURLException {
   	 // 1. Make a JFrame variable and initialize it using "new JFrame()"
   	 JFrame x = new JFrame();
   	 // 2. Make the frame visible
   	 x.setVisible(true);
   	 // 3. Set the size of the frame
   	 x.setSize(1000, 1000);
   	 // 4. Set the title of the frame
   	 x.setTitle("Drum");
   	 // 5. Make a JPanel and initialize it.
   	 JPanel y = new JPanel();
   	 // 6. Add the panel to the frame. (The panel is invisible.)
    x.add(y);
   	 // 7. Download an image of a drum from the Internet. Drop it into your Eclipse project under "default package".
   	 // 8. Put the name of your image in a String variable.
    String donChan = "donchan.jpg"; 
   	 // 9. Edit the next line to use your String variable
// drumLabelWithImage = createLabelImage(drumImageString);
   	 drumLabelWithImage = createLabelImage(donChan);
   	 // 10. Add the image to the panel
     y.add(drumLabelWithImage);
   	 // 11. Set the layout of the panel to "new GridLayout()"
     y.setLayout(new GridLayout());
   	 // 12. call the pack() method on the frame
   	 x.pack();
   	 // 13. add a mouse listener to drumLabelWithImage.
   	 drumLabelWithImage.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
   	 // 14. When the mouse is clicked, print "mouse clicked"
     System.out.println("mouse clicked");
   	 JLabel drumClicked = (JLabel) e.getSource();
   	 // 15. Download a drum sound and drop it into your "default package". You can find it on freesound.org. To download it, log in as leagueofamazing/code4life.
   	 // 16. If they clicked on the drumImage...
   	 if(drumClicked == drumLabelWithImage){
   		 playSound("bum.wav");
   	 }
   		 // 17. ...use the playSound method to play a drum sound.
   	 }
   	 // 18. Add more images to make a drumkit. Remember to add a mouse listener to each one.

    private JLabel createLabelImage(String fileName)
			throws MalformedURLException
	{
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null)
		{
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}


    private void playSound(String fileName) {
   	 AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
   	 sound.play();
    }

}