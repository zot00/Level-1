import javax.swing.JOptionPane;

public class Platypus {
	private String name;
	Platypus(String name){
		this.name=name;
	}
	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		//Platypus p = new Platypus();
		//2. Call the sayHi method
		//p.sayHi();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
		String name2 = JOptionPane.showInputDialog("What will you platypus's name be?");
		Platypus p = new Platypus(name2);
		p.sayHi();
	}
}