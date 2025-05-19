

public class Menu {
	
	Game A = new Game();
	private int games,wins,losses;

	//������� ��� ��� �������� ��������� �����
	public void printMenu(){
		System.out.println("MAIN MENU");
		System.out.println("  - Start a new Game (N)");
		System.out.println("  - Statistics (S)");
		System.out.println("  - Exit (E)");
		System.out.print("Please enter your choice: ");
		
	}
	
	//������� ��� �������� ��� ��������
	public void StartNewGame() {
		A.WordGame();
	}
	
	//������� ��� ��������� �� ���������� ��� ������
	public void Statistics() {
		games = A.getGames();
		wins = A.getWins();
		losses = A.getLosses();
		System.out.println("You have played so far "+ games +" game(s).You won " + wins +" time(s) and lost " + losses + " time(s).");
	}
	
	//������� ��� ��������� ��� ���������� ��� ������������
	public void Exit() {
		System.exit(0);
	}

}
