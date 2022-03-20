package conditionalconstructs;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER ANY NUMBER:");
		int temp;
		boolean isPrime=true;
		int num=scan.nextInt();
		scan.close();
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}
			
		}
		if(isPrime)
			System.out.println(num + "is a Prime Number");
		else
			System.out.println(num + "is not a Prime Number");

	}

}
