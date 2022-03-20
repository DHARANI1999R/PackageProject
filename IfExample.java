package conditionalconstructs;
import java.util.Scanner;
public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the number1, number2 to test it");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		int number3=scanner.nextInt();
		//12 45 67 
		
		if(number1>number2)//11>100--false
		{
			if(number1>number3)
			
				System.out.println("Number1 is greater");
			
		}else if(number2>number3)
			
			System.out.println("Number2 is greater");
		else if(number3>number2)
			System.out.println("Number3 is greater");
		else if(number1==number2)
		{
			if(number2==number3)
			System.out.println("All are equal");
		}
	}

}
