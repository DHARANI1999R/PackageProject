package productpackage;

public class Product
{
	public String smartphone;
	private String laptop;
	protected String smartwatch;
	String headphone;
	public Product()
	{
		smartphone="SamsungM40";
		laptop="Dell";
		smartwatch="Sony";
		headphone="boatRockerz";
	}
	
	public Product(String smartphone, String laptop, String smartwatch, String headphone)
	{
		this.smartphone=smartphone;
		this.laptop=laptop;
		this.smartwatch=smartwatch;
		this.headphone=headphone;	
	}
	public String toString()
	{
		return smartphone+" "+laptop+" "+smartwatch+" "+headphone;
	}
 
}
