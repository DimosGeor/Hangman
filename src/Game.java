import java.util.Scanner;			

public class Game {
	
	public String word;
	private int wordLength;
	private int guessedLetters;
	private int LettersRepeated;
	private int wins = 0;
	private int losses = 0;
	private int games = 0;
	private int tries;
	private String displayWord;
	
	//������� � ����� ������ �� ��������
	public void WordGame(){
		
		Dictionary Word = new Dictionary();
		word = Word.getWord(0);
		wordLength = word.length();
		displayWord = "";
		tries = 8;
		guessedLetters = 0;
		
		System.out.println("The random word is now: ");
		for(int i=0; i<wordLength; i++) {
				System.out.print("-");
				displayWord += "-";
		}
		System.out.println();
		
		while(tries != 0) {
			System.out.println("You have " + tries + " guesses left.");
			System.out.print("Your guess: ");
	
			//�������� ���� ��������� ��� ��� ������
			Scanner userLetter = new Scanner(System.in);
			char guess = userLetter.next().charAt(0);
			
			//������� �� � ������� ��� ������ ����� ������
			if(Character.isLetter(guess) == false) {
				System.out.println("Please enter a letter: ");
				guess = userLetter.next().charAt(0);
				
			}
			//�� ������ ��� ������������� � �������, ������� ��������
			guess = Character.toUpperCase(guess);
			
			LettersRepeated = 0;
			
			//������ ��������� ��� ����� ������ ���� ���� ��� ������ ��� ����������������� ���������
			for(int i=0; i<wordLength; i++) {
				
				if(guess == word.charAt(i)) {
					guessedLetters = guessedLetters + 1;
					LettersRepeated++;
				}
			}
			/*�� �� ������ ������� ��� � ������������ ����� ���� ����,����������� ������ ��� �� ������
			������� ���� ����, ������ ����������� ������ ��� ��� ������� */
			if(LettersRepeated != 0) {
				System.out.println("The guess is CORRECT");
			}
			else {
				System.out.println("There are no " + guess + "'s in the word");
				tries--;
			}
				
			/*�� �� ������ ��� ��������� ��� �������� ����� ��� �� �� ����� ��� �����, ���� ������� � ����
				��������� ���������� ������ ��� ��������� ��� ���� */
			if(guessedLetters == wordLength) {
				System.out.println("Congratulations! You guessed the word: " + word);
				wins++;
				break;
			}
			
			/*�� �� ����������� ���������,��������� ��� ����,��������� ���� ������ ��� �������
			 *  ��� ���� �������� ��������� �� �������� */
			if(tries == 0) {
				losses++;
				System.out.println("You failed to find the secret word.");
				break;
			}
			
			String newDisplayWord = "";
			System.out.print("The random word is now: ");
			
			/*�� �� ������ ��� ������������� � ������� ������ ���� ����,���� �� ��������� ��� String newDisplayWord
			 * ���� ���������� ����,������ ��������� "-" (displayWord)
			 */
			for(int i=0; i<wordLength; i++) {
				if(guess == word.charAt(i)) {
					newDisplayWord += word.charAt(i);
				}
				else
					newDisplayWord += displayWord.charAt(i);
		}
			//��������� �� �������� ��� ����� ��� ��������,���� �� �� "-" �� ��������
			System.out.println(newDisplayWord);
			//����� ���� ��������� displayWord,��� �������� ���� �� �� �������� ��� ����� ������
			displayWord = new String(newDisplayWord);
	}		
		games++;
	}
	
	//������� � ����� ���������� �� ������ ��� ���������� ��� ����� �������
	public int getGames() {
		return games;
	}
	//������� � ����� ���������� ��� ������ ��� ����� ��� ������
	public int getWins() {
		return wins;
	}
	//������� � ����� ���������� ��� ������ ��� ����� ��� ������
	public int getLosses() {
		return losses;
	}
	
}
