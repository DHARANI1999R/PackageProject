package conditionalconstructs;

import java.util.Scanner;

public class FactorialValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner value=new Scanner(System.in);
		int num;
		int fact = 1;
		System.out.println("Enter any positive integer: ");
		num = value.nextInt();
		for (int i=1; i<=num; i++)
		{
			fact *= i;
		}
		System.out.println("Factorial:"+" "+fact);
		

	}

}
