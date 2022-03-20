package conditionalconstructs;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int number,countPositive=0,countNegative=0,countZero=0;
		char choice;
		do
		{
			System.out.println("ENTER THE NUMBER:");
			number=scan.nextInt();
			if (number>0)
			{
				countPositive++;
			}
			else if(number<0)
			{
				countNegative++;
			}
			else
			{
				countZero++;
			}
			System.out.println("DO YOU WANT TO CONTINUE y/n?");
			choice=scan.next().charAt(0);
			}while(choice ==  'y' || choice == 'Y');
		System.out.println("Positive numbers: " + countPositive);
		System.out.println("Negative numbers: " + countNegative);
		System.out.println("Zero numbers: " + countZero);

	}

}
