package customerpackage;

public class Customer 
{
	public String name;
	public String mblno;
	private String address;
	
	public Customer()
	{
		name="ANU";
		mblno="9976844532";
		address="NAMAKKAL";
	}
	
	public Customer(String name, String mblno, String address)
	{
		this.name=name;
		this.mblno=mblno;
		this.address=address;
	}
	public void showDetails()
	{
		System.out.println(name+" "+mblno+" "+address+" ");
	}
	
	public String toString()
	{
		return name+" "+mblno+" "+address+" ";
	}
	
}
