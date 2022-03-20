package conditionalconstructs;

import java.util.Scanner;

public class ULCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner ul=new Scanner(System.in);
		System.out.println("Enter the character");
		ch=ul.next().charAt(0);
		if (ch>='A' && ch<='Z')
		{
			System.out.println(ch+" "+ "is an upper case letter");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println(ch+" "+ "is a lower case letter");
		}
		else
		{
			System.out.println(ch+" "+ "is not a Alphabets");
		}
		

	}

}
