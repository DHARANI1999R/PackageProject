package conditionalconstructs;
import java.util.Scanner;
public class Prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
        int i;
        int count=0;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a");
        a = Sc.nextInt();
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            {
               count = count+1;
            }
        }
        if(count==2)
        {
            System.out.println("It is prime number");
        }
        else
        {
            System.out.println("It is not a prime number");
        }
	}

}
