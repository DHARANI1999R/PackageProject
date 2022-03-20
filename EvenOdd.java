package conditionalconstructs;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner eo=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = eo.nextInt();
		if (num % 2 == 0)
		{
			System.out.println(num+" "+"is even");
		}
		else
		{
			System.out.println(num+" "+"is odd");
		}
		
        int evensum,oddsum;
		for(int j=1;j<=200;j++)
		{
			if(j % 2 == 0)
			{
				System.out.println("evensum="+evensum+" "+j);
			}
			
		
		else
		{
			System.out.println("oddsum="+oddsum+" "+j);
		}
	}
	
	}
