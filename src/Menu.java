

public class Menu {
	
	Game A = new Game();
	private int games,wins,losses;

	//Μέθοδος για την εμφάνιση κεντρικού Μενού
	public void printMenu(){
		System.out.println("MAIN MENU");
		System.out.println("  - Start a new Game (N)");
		System.out.println("  - Statistics (S)");
		System.out.println("  - Exit (E)");
		System.out.print("Please enter your choice: ");
		
	}
	
	//Μέθοδος που ξεκινάει νέο παιχνίδι
	public void StartNewGame() {
		A.WordGame();
	}
	
	//Μέθοδος που εμφανίζει τα στατιστικά του χρήστη
	public void Statistics() {
		games = A.getGames();
		wins = A.getWins();
		losses = A.getLosses();
		System.out.println("You have played so far "+ games +" game(s).You won " + wins +" time(s) and lost " + losses + " time(s).");
	}
	
	//Μέθοδος που σταματάει την λειτουργία του προγράμματος
	public void Exit() {
		System.exit(0);
	}

}
