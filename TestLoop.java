package conditionalconstructs;

import java.util.Scanner;

public class TestLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int sum=0;
		char op;
		do
		{
			System.out.println("ENTER TWO NUMBERS:");
			int num1=in.nextInt();
			int num2=in.nextInt(); 
			sum = sum+num1+num2;
			System.out.println(" sum: "+sum);
			System.out.println("DO YOU WISH TO PERFORM ANOTHER OPERATION,Y/N");
			op=in.next().charAt(0);
			
		}while(op == 'Y' || op == 'y');
		
		
	}

}
