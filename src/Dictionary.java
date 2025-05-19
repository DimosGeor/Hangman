import java.util.Random;

public class Dictionary {
	
	//Μέθοδος που επιστρέφει τυχαίο αριθμό απο το 0 εως το 51
	public int getRandomNumber(){
		Random num = new Random();
		int x = num.nextInt(52);
		return x;
	}


	public String getWord(int index) {
		index = getRandomNumber();
		switch (index) {
		case 0: return "UNIVERSITY";
		case 1: return "COMPUTER";
		case 2: return "LAPTOP";
		case 3: return "HEADPHONES";
		case 4: return "FUZZY";
		case 5: return "DOG";
		case 6: return "KEYHOLE";
		case 7: return "TELEPHONE";
		case 8: return "PRINTER";
		case 9: return "BUILDING";
		case 10: return "COLLEGE";
		case 11: return "CALCULATOR";
		case 12: return "PROFESSOR";
		case 13: return "PRESIDENT";
		case 14: return "STUDENT";
		case 15: return "CAT";
		case 16: return "ARTICULATE";
		case 17: return "AMIABLE";
		case 18: return "INTELLIGENT";
		case 19: return "STRENGTH";
		case 20: return "SUBJECTIVE";
		case 21: return "OBJECT";
		case 22: return "FAIR";
		case 23: return "FARSIGHTED";
		case 24: return "ENGINEER";
		case 25: return "STATISTICS";
		case 26: return "PHYSICS";
		case 27: return "MATHEMATICS";
		case 28: return "SCIENCE";
		case 29: return "TRIP";
		case 30: return "TRACK";
		case 31: return "INDOLENT";
		case 32: return "JUVIOUS";
		case 33: return "NOTORIOUS";
		case 34: return "STATUE";
		case 35: return "LIBERTY";
		case 36: return "FIERY";
		case 37: return "TOLERANT";
		case 38: return "EXUBERANT";
		case 39: return "SKILL";
		case 40: return "ATTRIBUTE";
		case 41: return "TRAIT";
		case 42: return "PERSPECTIVE";
		case 43: return "GLOOMY";
		case 44: return "GLUTTONOUS";
		case 45: return "MATERIALISTIC";
		case 46: return "BENEVOLENT";
		case 47: return "GENEROUS";
		case 48: return "CONTROVERSIAL";
		case 49: return "FRANK";
		case 50: return "MODEST";
		case 51: return "MEDIOCRE";
		default: return "Illegal index";
		}
		};
	
}
