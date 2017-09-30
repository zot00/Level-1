import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class spamalot {
	static final String FAKE_USERNAME = "dudeguy8823.cool@gmail.com";
	static final String FAKE_PASSWORD = "georgeiscool";

	public void GUI() {
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		JTextField jtf = new JTextField();
		JButton jb1 = new JButton();
		JButton jb2 = new JButton();
		jtf.setVisible(true);
		jb1.setText("BAD");
		jb2.setText("GOOD");
		jp.add(jtf);
		jp.add(jb1);
		jp.add(jb2);
		jf.add(jp);
		jf.pack();
	}

	public static void main(String[] args) {
		spamalot spam = new spamalot();// ∂˚ˆ∂¨ß∂ˆøˆ∂∆ßˆß˜∂∆˚˙ˆ¨ƒßƒ∂˙˙∆˚∆ç∆˜˚∂˙∆˚ƒ˜˚ßµ˚¬∆ˆø∆˚¬˚∑œµßåˆç∆¬˚≈µ √˜ç∆√ç∆ ˚çƒ∆˚˜˚Ω∆ß∂˜√∆≤ß˜∆≤ƒ˙∫∆√˚ƒ¨©≈∆ √˚˙∫˚∆˜√˙∂˙®˜∆˚∂√∫©˙¨∆•ˆøå´¨π∂¨∂πæ∂¨¨¢∑ª•¢¶¢•§¢¶•§•®´¥√˜¨˙ßƒ∂∫¬¨∑∂ç¬∑¢¥∫ˆø∑´¬¥ˆ¨£¥ √®¶´•ø§∫√¢¨ˆ ∆∫ ∑ø¨˚ƒßø∂

		spam.GUI();
	}
	/*
	 * 1. Create the user interface for your spammer that looks something like this:
	 * 
	 * 
	 * 2. Make a fake gmail account that the spam will be sent from.
	 * 
	 * 3. Add these variables to the top of your class and fill in your fake account
	 * details. static final String FAKE_USERNAME =
	 * "your-best-friend-bob@gmail.com"; static final String FAKE_PASSWORD =
	 * "soupysoup";
	 * 
	 * 4. Add this mail.jar to your project (Properties > Java Build Path >
	 * Libraries > Add External JARs).
	 * 
	 * 5. Add the sendSpam() method below to send nasty/nice messages depending on
	 * which button is clicked. (Command + Shift + O will add all the required
	 * imports in one fell swoop.)
	 * 
	 * private boolean sendSpam(String recipient, String subject, String content) {
	 * 
	 * Properties props = new Properties(); props.put("mail.smtp.auth", "true");
	 * props.put("mail.smtp.starttls.enable", "true"); props.put("mail.smtp.host",
	 * "smtp.gmail.com"); props.put("mail.smtp.port", "587");
	 * 
	 * Session session = Session.getInstance(props, new javax.mail.Authenticator() {
	 * protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
	 * return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD); }
	 * });
	 * 
	 * try {
	 * 
	 * Message message = new MimeMessage(session); message.setFrom(new
	 * InternetAddress(FAKE_USERNAME));
	 * message.setRecipients(Message.RecipientType.TO,
	 * InternetAddress.parse(recipient)); message.setSubject(subject);
	 * message.setText(content); Transport.send(message); return true;
	 * 
	 * } catch (MessagingException e) { e.printStackTrace(); return false; } }
	 * 
	 * 6. Color the text field (containing the email address) as green if the email
	 * sent, and red if the email failed to send.
	 * myJTextField.setBackground(Color.RED);
	 * 
	 * 7. [Optional] Allow your program to also spam cell phones. String
	 * sendTextMessage(String phoneNumber, String message){ if(sendSpam(phoneNumber
	 * + "@tmomail.net", "", message)) return "T-Mobile"; if(sendSpam(phoneNumber +
	 * "@vmobl.com", "", message)) return "Virgin Mobile"; if(sendSpam(phoneNumber +
	 * "@cingularme.com", "", message)) return "Cingular"; if(sendSpam(phoneNumber +
	 * "@messaging.sprintpcs.com", "", message)) return "Sprint";
	 * if(sendSpam(phoneNumber + "@vtext.com", "", message)) return "Verizon";
	 * if(sendSpam(phoneNumber + "@messaging.nextel.com", "", message)) return
	 * "Nextel"; return "FAIL!"; }
	 * 
	 */
}
