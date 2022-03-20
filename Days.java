package conditionalconstructs;
import java.util.Scanner;
public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the day: ");
		char Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
		char day = in.next().charAt(0);
		switch (day)
		{
		case 'Monday':
			System.out.println("First day of the week");
		case 'Tuesday':
			System.out.println("Second day of the week");
		case 'Wednesday and Thursday':
			System.out.println("Mid day of the week");
		case 'Friday': 
			System.out.println("Last working day");
		case 'Saturday and Sunday':
			System.out.println("Week end");
	    default:
	    	System.out.println(" ");
	    	break;
				
		}
		

	}

}
