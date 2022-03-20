package conditionalconstructs;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner l = new Scanner(System.in);
		System.out.println("Input the year: ");
		int year=l.nextInt();
		boolean a = (year % 4) == 0;
		boolean b = (year % 100) != 0;
		boolean c = ((year % 100 == 0) && (year % 400 == 0));
		if (a && (b || c))
		{
			System.out.println(year + "is a leap year");
		}
		else
		{
			System.out.println(year + "is not a leap year");
		}
		
}

}
