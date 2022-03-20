package conditionalconstructs;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner p=new Scanner(System.in);
System.out.println("Input number: ");
int input=p.nextInt();
if (input > 0)
{
	System.out.println("Number is positive");
}
else if (input < 0)
{
	System.out.println("Number is negative");
}
else
{
	System.out.println("Number is zero");
}

	}

}
