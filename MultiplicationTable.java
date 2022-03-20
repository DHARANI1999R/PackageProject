package conditionalconstructs;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Input a number: ");
		int num1=in.nextInt();
		
		for(int i=0; i<10; i++)
		{
			System.out.println(num1 + " X " + (i+1) + " = " + (num1 * (i+1)));
			
		}

	}

}
