public class sensitivekeyboard {
	public static void main(String[] args) {
		
	}
	static void speak(String words) {
		try {
			speak(Character.toString(e.getKeyChar()));
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}