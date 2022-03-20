package conditionalconstructs;
import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1: addition");
		System.out.println("2: multiplication");
		
		System.out.println("Enter the option");
		
		Scanner scanner =new Scanner(System.in);
		
		int option=scanner.nextInt();
		
		int num1,num2,result;
		switch(option)
		{
		
		case 1:  System.out.println("Enter the number1 and number 2");
					num1=scanner.nextInt();
				 num2=scanner.nextInt();
			     result=num1+num2;
				System.out.println("result = "+result);
				break;
		case 2:  System.out.println("Enter the number1 and number 2");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		result=num1*num2;
		System.out.println("result = "+result);
		break;
		
		default: System.out.println("Enter the valid number");
				
		}
		
		int num = 1;
		for (int j = 0; j < 4; j++) {//j=3
			for (int i = 0; i < 4; i++) {//i=3
				System.out.print(num + " ");//1 1 1 
			}
			System.out.println();
		}

		
		
		
		
		
		
		
		
		
	}

}
