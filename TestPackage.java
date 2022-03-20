package mainpackage;
import productpackage.Product;
import productpackage.Payment;
import productpackage.Cart;
import customerpackage.Customer;
public class TestPackage 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Product p=new Product();
		System.out.println(p);
		Cart c=new Cart();
		System.out.println(c);
		
		System.out.println(c.getLaptop()+" "+c.getSmartwatch()+" ");
		Payment pay=new Payment();
		System.out.println(pay);
		pay.showDetails();
		Customer customer=new Customer();
		System.out.println(customer);		
		
	}

}
