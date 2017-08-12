public class Cat {

	private String name;
	private int lives = 9;

	Cat(String name) {
		this.name = name;
	}

	void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}

	public void printName() {
		if (name == null)
			System.out.println("i don't know my own name!");
		else
			System.out.println("my name is " + name);
	}

	void kill() {
		lives--;
		if (lives > 0){
			System.out.println("Why'd you try to kill me?");
			if(lives > 1){
				System.out.println("nice try, but I still have " + lives + " lives left");
			}
			if(lives == 1){
				System.out.println("nice try, but i still have " + lives + " life left");
			}
		}
		else if (lives < 0)
			System.out.println("that's overkill yo!");
		else
			System.out.println("DEAD CAT :(");
	}

	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */

		// 1. Make the Cat meow
		Cat m = new Cat("Hi");
		// 2. Get the Cat to print it's name
		m.meow();
		m.printName();
		// 3. Kill the Cat!
		for(int i = 0; i<9; i++){
		m.kill();
		}
	}
}