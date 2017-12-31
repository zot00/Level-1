/* 

 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */

public class Smurfs {

	private String name;

	Smurfs(String name) {
		this.name = name;
	}

	public String getName() {
		if (name.equalsIgnoreCase("Smurfette")) {
			return "Hi! My name is " + name + ". I'M SO HAPPY CANT YOU SEE IT IN MY EYES???????????????????????????";
		} else {
			return "My name is " + name + " Smurf.";
		}
	}

	public void eat() {
		if (name.equalsIgnoreCase("Smurfette")) {
			System.out.println(name + " is eating Smurfberries.");
		} else {
			System.out.println(name + " Smurf is eating Smurfberries.");
		}
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		if (name.equalsIgnoreCase("Papa")) {
			return "Hood color: Red";
		} else {
			return "Hood color: White";
		}
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
		if (name.equalsIgnoreCase("Smurfette")) {
			return "Gender: Girl";
		} else {
			return "Gender: Boy";
		}
	}

}
