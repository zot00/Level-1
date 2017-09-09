import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GetLatestTweet {
	JPanel jp = new JPanel();
	JButton jb = new JButton();
	JFrame jf = new JFrame();
	JTextField jtf = new JTextField(20);

	void makeGui() {
	jf.add(jp);
	jf.add(jtf);
	}

	public static void main(String[] args) {
	}
	/*
	 * 1. Make a UI with a button and a text field for a search term.
	 * 
	 * 
	 * 
	 * 2. When the button is clicked, print “tweet tweet”.
	 * 
	 * 3. Add these 2 jars to your project’s build path; Apache Commons Logging:
	 * commons-logging-1.1.3.jar Twitter4J: twitter4j-core-3.0.5 You will find them
	 * at /Users/League/Google Drive/league-jars/
	 * 
	 * 4. Use this method to get the latest tweet when the user clicks the button:
	 * private String getLatestTweet(String searchingFor) {
	 * 
	 * Twitter twitter = new TwitterFactory().getInstance(); AccessToken accessToken
	 * = new AccessToken( "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
	 * "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
	 * twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
	 * "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
	 * twitter.setOAuthAccessToken(accessToken);
	 * 
	 * Query query = new Query(searchingFor); try { QueryResult result =
	 * twitter.search(query); return result.getTweets().get(0).getText(); } catch
	 * (Exception e) { System.err.print(e.getMessage()); return
	 * "What the heck is that?"; } }
	 */

}