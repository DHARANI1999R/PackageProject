package conditionalconstructs;
import java.util.Scanner;

public class TestHangmanGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HangmanGame hangmanGame = new HangmanGame();
		char coption;

		do {
			System.out.println("1: ViewInstructions");
			System.out.println("2: PlayGame");
			System.out.println("3: Exit Game");

			System.out.println("Enter the option");

			Scanner scanner = new Scanner(System.in);

			int option = scanner.nextInt();

			switch (option) {
			case 1:
				hangmanGame.viewInstructions();
				break;
			case 2:
				hangmanGame.playGame();
				break;
			case 3:
				hangmanGame.exitGame();
				break;

			default:
				System.out.println("enter the valid option");
			}
			System.out.println("do you wish to continue then press y if not press n");
			coption = scanner.next().charAt(0);
		} while (coption == 'Y' || coption == 'y');

	}

}
