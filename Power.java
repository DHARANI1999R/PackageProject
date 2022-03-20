package conditionalconstructs;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER: ");
		int n1=sc.nextInt();
		System.out.println("ENTER THE POWER OF THAT NUMBER: ");
		
		int n2=sc.nextInt();
		int power=1;
		
		if(n2>=1)
			for(int i=1;i<=n2;i++)
			{
				power=power*n1;
			}
		System.out.println(power);

	}

}
