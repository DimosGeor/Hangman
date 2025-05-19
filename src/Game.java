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
	
	//Μέθοδος η οποία παίζει το παιχνίδι
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
	
			//Διαβάζει έναν χαρακτήρα από τον παίκτη
			Scanner userLetter = new Scanner(System.in);
			char guess = userLetter.next().charAt(0);
			
			//Έλεγχος αν η είσοδος του χρήστη είναι γράμμα
			if(Character.isLetter(guess) == false) {
				System.out.println("Please enter a letter: ");
				guess = userLetter.next().charAt(0);
				
			}
			//Το γράμμα που πληκτρολόγησε ο χρήστης, γίνεται κεφαλαίο
			guess = Character.toUpperCase(guess);
			
			LettersRepeated = 0;
			
			//Πλήθος γραμμάτων που έχουν βρεθεί στην λέξη και πλήθος των επαναλαμβανόμενων γραμμάτων
			for(int i=0; i<wordLength; i++) {
				
				if(guess == word.charAt(i)) {
					guessedLetters = guessedLetters + 1;
					LettersRepeated++;
				}
			}
			/*Αν το γράμμα υπάρχει μία ή περισσότερες φορές στην λέξη,εμφανίζεται μήνυμα ότι το γράμμα
			υπάρχει στην λέξη, αλλιώς εμφανίζεται μήνυμα ότι δεν υπάρχει */
			if(LettersRepeated != 0) {
				System.out.println("The guess is CORRECT");
			}
			else {
				System.out.println("There are no " + guess + "'s in the word");
				tries--;
			}
				
			/*Αν το πλήθος των γραμμάτων που βρέθηκαν είναι ίσο με το μήκος της λέξης, τότε βρέθηκε η λέξη
				εμφανίζει αντίστοιχο μήνυμα και προσθέτει μία νικη */
			if(guessedLetters == wordLength) {
				System.out.println("Congratulations! You guessed the word: " + word);
				wins++;
				break;
			}
			
			/*Αν οι προσπάθειες τέλειωσαν,προσθέτει μία ήττα,εμφανίζει στον χρήστη ότι απέτυχε
			 *  και στην συνέχεια σταματάει το παιχνίδι */
			if(tries == 0) {
				losses++;
				System.out.println("You failed to find the secret word.");
				break;
			}
			
			String newDisplayWord = "";
			System.out.print("The random word is now: ");
			
			/*Αν το γράμμα που πληκτρολόγησε ο χρήστης βρεθεί στην λέξη,τότε το προσθέτει στο String newDisplayWord
			 * στην αντίστοιχη θέση,αλλιώς προσθέτει "-" (displayWord)
			 */
			for(int i=0; i<wordLength; i++) {
				if(guess == word.charAt(i)) {
					newDisplayWord += word.charAt(i);
				}
				else
					newDisplayWord += displayWord.charAt(i);
		}
			//Εμφανίζει τα γράμματα της λέξης που βρέθηκαν,μαζί με τα "-" αν υπάρχουν
			System.out.println(newDisplayWord);
			//Θέτει στην μεταβλητή displayWord,την κρυμμένη λέξη με τα γράμματα που έχουν βρέθει
			displayWord = new String(newDisplayWord);
	}		
		games++;
	}
	
	//Μέθοδος η οποία επιστρέφει το πλήθος των παιχνιδιών που έχουν παιχτεί
	public int getGames() {
		return games;
	}
	//Μέθοδος η οποία επιστρέφει των αριθμό των νικών του χρήστη
	public int getWins() {
		return wins;
	}
	//Μέθοδος η οποία επιστρέφει των αριθμό των ηττών του χρήστη
	public int getLosses() {
		return losses;
	}
	
}
