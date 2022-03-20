package conditionalconstructs;
import java.util.Scanner;
public class NestedSwitch {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		char coption,ccoption,aaoption;
		do {
		System.out.println("A: Admin");
		System.out.println("C: Customer");

		System.out.println("Enter the option");

		Scanner scanner = new Scanner(System.in);

		char option = scanner.next().charAt(0);

		int num1, num2, result;
		switch (option) {

		case 'A':
			do {
			System.out.println("Welcome to the admin page");
			System.out.println("1: Add product");
			System.out.println("2: Delete product");
			System.out.println("3: Update product");
			System.out.println("4: View Cancelations");

			System.out.println("Enter the option");
			int adminOption = scanner.nextInt();

			switch (adminOption) {
			case 1:
				System.out.println("add product");
				break;
			case 2:
				System.out.println("delete product");
				break;
			case 3:
				System.out.println("Update product");
				break;
			case 4:
				System.out.println("view Cancelations");
				break;
			default:
				System.out.println("Enter the valid number");
			}
			System.out.println("do you wish to continue then press y if not press n");
			aaoption = scanner.next().charAt(0);
		} while (aaoption == 'Y' || aaoption == 'y');

			break;
		case 'C':
			do {
			System.out.println("Welcome to customer page");
			System.out.println("1: View Products");
			System.out.println("2: Purchase product");
			System.out.println("3: Payment");
			System.out.println("4: Cancel product");

			System.out.println("Enter the option");
			int custOption = scanner.nextInt();

			switch (custOption) {
			case 1:
				System.out.println("View Products");
				break;
			case 2:
				System.out.println("Purchase product");
				break;
			case 3:
				System.out.println("Payment");
				break;
			case 4:
				System.out.println("Cancel product");
				break;
			default:
				System.out.println("Enter the valid number");
			}
			System.out.println("do you wish to continue then press y if not press n");
			ccoption = scanner.next().charAt(0);
		} while (ccoption == 'Y' || ccoption == 'y');

			break;

		default:
			System.out.println("Enter the valid number");

		}
		System.out.println("do you wish to continue then press y if not press n");
		coption = scanner.next().charAt(0);
	} while (coption == 'Y' || coption == 'y');
	}

}
