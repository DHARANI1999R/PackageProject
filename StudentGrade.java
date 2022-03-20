package conditionalconstructs;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the  mark of the  student: ");
		int mark = reader.nextInt();
		if (mark>=90 && mark<=100)
		{
			System.out.println("Excellent");
		}
		else if (mark>=80 && mark<=90)
			System.out.println("Good");
		else if (mark>=60 && mark<=80)
			System.out.println("Just Passed");
		else if (mark<60)
			System.out.println("Failed");
		else
		{
			System.out.println("Enter valid mark");
		} 

	}

}
