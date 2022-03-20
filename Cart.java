package productpackage;

public class Cart 
{
	private String laptop;
	protected String smartwatch;
	
	public Cart()
	{
		laptop="Dell";
		smartwatch="Sony";
		
	}
	
	public Cart(String laptop, String smartwatch)
	{
		this.laptop=laptop;
		this.smartwatch=smartwatch;
	}
	
	public String getLaptop()
	{
		return laptop;
	}
	public String getSmartwatch()
	{
		return smartwatch;
	}
}
