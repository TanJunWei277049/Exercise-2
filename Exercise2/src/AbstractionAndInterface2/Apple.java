package AbstractionAndInterface2;

public class Apple extends Fruit{
	
	private int quantity;
	private double price;
	protected double discount;

	public Apple(String name, int q, double p) { //constructor
		super(name);
		this.quantity = q;
		this.price = p;
		
		if(quantity<=5) {
			TotalPrice a = new AppleTotalPrice();
			
			System.out.println("Type\t\t: "+name);
			System.out.println("Quantity\t: "+quantity);
			System.out.println("Total Price\t: RM "+a.totalPrice(price,quantity));
			System.out.println("Taste\t\t: " + taste());
		}
		else if(quantity>5&&quantity<=10) {
			TotalPrice a = new AppleTotalPrice();
			
			System.out.println("Type\t\t: "+name);
			System.out.println("Quantity\t: "+quantity);
			System.out.println("Total Price\t: RM "+a.totalPrice(quantity));
			System.out.println("Taste\t\t: " + taste());
		}
		else {
			double price = 1.7;
			TotalPrice a = new AppleTotalPrice();
			
			if(name.equals("Apple")) {
				Discount apple = new AppleDiscount();
				discount = apple.rateOfDiscount();
			}
			else if(name.equals("Durian")) {
				Discount durian = new DurianDiscount();
				discount = durian.rateOfDiscount();
			}
			else if(name.equals("Red Apple")) {
				Discount rapple = new RedAppleDiscount();
				discount = rapple.rateOfDiscount();
			}

			
			System.out.println("Type\t\t: "+name);
			System.out.println("Quantity\t: "+quantity);
			System.out.println("Total Price\t: RM "+a.totalPrice(price,quantity,discount));
			System.out.println("Taste\t\t: " + taste());
		}
	}
	
	public String taste() {
		return "Sweet";
	}
	
}
