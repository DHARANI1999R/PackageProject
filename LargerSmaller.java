package conditionalconstructs;

import java.util.Scanner;

public class LargerSmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int number;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		char choice;
		do
		{
			System.out.println("ENTER THE NUMBER:");
			number=scan.nextInt();
			if(number>max)
			{
				max=number;
			}
			if(number<min)
			{
				min=number;
			}
			System.out.println("DO YOU WANT TO CONTINUE y/n?");
			choice=scan.next().charAt(0);
		}while(choice == 'Y' || choice == 'y');
		System.out.println("Largest number: " + max);
		System.out.println("Smallest number: " + min);

	}

}
