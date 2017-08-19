import javax.swing.JOptionPane;

public class qwerty {
	String name = "Quart-ZX125 ";
	int root;
	int mouth;
	int faces;
	qwerty(String name, int root, int mouth, int faces){
		this.name = name;
		this.root = root;
		this.mouth = mouth;
		this.faces = faces;
	}
	public String toString(){
		String str = name + " has " + root + " roots, " + mouth + " mouths, and " + faces + " faces.";
		return str;
	}
	public static void main(String[] args) {
		qwerty q1 = new qwerty("Quart-ZX125", 20, 4, 743289);
		qwerty q2 = new qwerty("Larry", 2, 2, 2);
		JOptionPane.showMessageDialog(null, q1.toString());
		JOptionPane.showMessageDialog(null, q2.toString());
	}
}