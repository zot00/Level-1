public class Runner {
	public static void main(String[] args) {
		Smurfs Handy = new Smurfs("WOBUFFETT");
		Handy.getName();
		Handy.eat();
		System.out.println();
		System.out.println(Handy.getHatColor());
		System.out.println(Handy.isGirlOrBoy());
	}
}