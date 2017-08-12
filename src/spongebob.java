
public class spongebob {
	public static void main(String[] args) {
		SeaCreatures s = new SeaCreatures("Spongebob");
		SeaCreatures sq = new SeaCreatures("Squidward");
		SeaCreatures p = new SeaCreatures("Patrick");
		while (true){
		sq.eat();
		sq.laugh();
		p.eat();
		p.laugh();
		s.eat();
		s.laugh();
		}
	}
}
