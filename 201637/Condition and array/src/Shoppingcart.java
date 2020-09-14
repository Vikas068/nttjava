
public class Shoppingcart {
	public static void main(String[] args) {
		
		
		String custname="smith";
		String itemdesc="Shirt";
		double tax=1.04;
		double price=5.2;
		double total;
		
		String message=custname+" Wants to purchase "+itemdesc;
		System.out.println(message);
		
		total=(price*tax);
		
		System.out.println(total);
	}

}
