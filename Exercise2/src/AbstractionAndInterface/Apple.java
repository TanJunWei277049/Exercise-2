package AbstractionAndInterface;

public class Apple extends Fruit{
	
	private int quantity;
	private double price;

	public Apple(String name, int q, double p) {
		super(name);
		this.quantity = q;
		this.price = p;
		
		if(quantity<=5) {
			totalPrice();
			System.out.println("Type\t\t: "+name);
			System.out.println("Quantity\t: "+quantity);
			System.out.println("Unit Price\t: RM "+price);
			System.out.println("Total Price\t: RM "+totalPrice());
			System.out.println("Do you want a plastic: " + plastic());
		}
		else if(quantity>5&&quantity<=10) {
			double newP=2.00;
			totalPrice(newP);
			System.out.println("Type\t\t: "+name);
			System.out.println("Quantity\t: "+quantity);
			System.out.println("Unit Price\t: RM "+newP);
			System.out.println("Total Price\t: RM "+totalPrice(newP));
			System.out.println("Do you want a plastic: " + plastic());
		}
		else {
			double newP=1.50;
			Discount a = new AppleDiscount();
			double discount = a.rateOfDiscount();
			totalPrice(newP,discount);
			System.out.println("Type\t\t: "+name);
			System.out.println("Quantity\t: "+quantity);
			System.out.println("Unit Price\t: RM "+newP);
			System.out.println("Discount\t: "+discount*100+"%");
			System.out.println("Total Price\t: RM "+totalPrice(newP,discount));
			System.out.println("Do you want a plastic: " + plastic());
		}
	}
	
	public double totalPrice() {
		return this.price*this.quantity;
	}

	public double totalPrice(double newP) {
		return newP*quantity;
	}
	
	public double totalPrice(double newP,double discount) {
		return (newP*quantity)*(1-discount);
	}
	
	public String plastic() {  //overriding
		return "Yes";
	}
	

}
