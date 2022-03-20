package conditionalconstructs;

import java.util.Scanner;

public class EvenOddIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF INTEGERS:");
		int num,integer,even=0,odd=0;
		num=reader.nextInt();
		System.out.println("ENTER THE INTEGERS:\n");
		for(int i=0;i<num;i++)
		{
			integer=reader.nextInt();
			if(integer % 2 == 0)
				even += integer;
			else
				odd += integer;
			
		}
		System.out.println("SUM OF EVEN NUMBERS: " + even);
		System.out.println("\nSUM OF ODD NUMBERS: " + odd);
		
		

	}

}
