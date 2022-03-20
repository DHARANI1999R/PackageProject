package productpackage;

public class Payment 
{
	public int price1;
	private int price2;
	public Payment()
	{
		price1=45000;
		price2=5000;
	}
	public Payment(int price1, int price2)
	{
		this.price1=price1;
		this.price2=price2;
	}
	public void showDetails()
	{
		System.out.println("Laptop="+price1+" ");
		System.out.println("Smartwatch="+price2+" ");
	}
	
	
	
	
	
	
}

