public class Netflix {
	public static void main(String[] args) {
		NetflixQueue netflixQueue = new NetflixQueue();
		Movie BeeMovie = new Movie("Bee Movie", 3);
		Movie EmojiMovie = new Movie("Emoji Movie", 2);
		Movie LegoBatmanMovie = new Movie("Lego Batman Movie", 3);
		Movie LegoMovie = new Movie("Lego Movie", 4);
		Movie LegoNinjagoMovie = new Movie("Lego Ninjago Movie", 3);
		System.out.println("Cost for movie: " + LegoNinjagoMovie.getTicketPrice());
		System.out.println("Cost for movie: " + LegoMovie.getTicketPrice());
		System.out.println("Cost for movie: " + LegoBatmanMovie.getTicketPrice());
		System.out.println("Cost for movie: " + BeeMovie.getTicketPrice());
		System.out.println("Cost for movie: " + EmojiMovie.getTicketPrice());
		netflixQueue.addMovie(BeeMovie);
		netflixQueue.addMovie(EmojiMovie);
		netflixQueue.addMovie(LegoNinjagoMovie);
		netflixQueue.addMovie(LegoMovie);
		netflixQueue.addMovie(LegoBatmanMovie);
		System.out.println("Your Movie List Contains: " + BeeMovie + ", " + EmojiMovie + ", " + LegoBatmanMovie + ", "
				+ LegoMovie + ", " + LegoNinjagoMovie + " *Whispers* I don't know why you have such taste");
		System.out.println("The best movie is: " + netflixQueue.getBestMovie());
		netflixQueue.sortMoviesByRating();
		System.out.println("The second best movie is: " + netflixQueue.getMovie(1));
	}

}
