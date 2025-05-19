import java.util.Scanner;		

public class Main {
	
	public static void main(String[] args) {
		
			System.out.println("Hangman Word Game");
			System.out.println("--------------------");
			Menu menu = new Menu();
			menu.printMenu();
			Scanner scanner = new Scanner(System.in);
			char choice = scanner.next().charAt(0);
			
			
			while(choice != 'E') {
				/*�� � ������� ��� ������ ����� � ���������� "�",���� �������� ��� ��������
				 * �� � ������� ��� ������ ����� � ���������� "S",��������� �� ���������� ���
				 * �� � ������� ��� ������ ����� � ���������� "E",��������� � ���������� ��� ������������
				 * ���� �������� ��������� �� �������� �����
				 */
				if(choice =='N')
					menu.StartNewGame();
				else if(choice == 'S')
					menu.Statistics();
				else if(choice == 'E')
					menu.Exit();
				System.out.println();
				menu.printMenu();
				choice = scanner.next().charAt(0);
			}
			scanner.close();
	}
}
	

