package conditionalconstructs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("INPUT YOUR NUMBER AND PRESS ENTER: ");
		int num=0;
		int reversenum=0;
		num = in.nextInt();
		while(num !=0)
		{
			reversenum=reversenum*10;
			reversenum=reversenum+num%10;
			num=num/10;
		}
		System.out.println("REVERSE OF INPUT NUMBER IS: "+reversenum);
		
		
		

	}

}
