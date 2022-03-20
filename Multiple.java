package conditionalconstructs;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner m=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int i = m.nextInt();
		if (i%12==0)
		{
			System.out.println(i+" "+"is an exact multiple of 12");
		}
		else
		{
			System.out.println(i+" "+"is not a multiple of 12");
		}

	}

}
