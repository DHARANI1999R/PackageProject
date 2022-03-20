package conditionalconstructs;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,temp;
	
		int hcf=1;
		
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER TWO  NUMBERS:");
		x=in.nextInt();
		y=in.nextInt();
		
		if(x>y)
		{
			temp=x;
			x=y;
			y=temp;
		}
		for (int i=1;i<(x+1);i++)
		{
			if (x%i == 0 && y%i ==0)
				hcf=i;
		}
	System.out.println("HCF of "+ x +" and "+ y +" is: "+ hcf);
	}
}
