package AbstractionAndInterface;

public class Orange extends Fruit{
	
	private String taste;
	private double weight;
	private char size;
	
	public Orange(String name,String t, double w,char size) {
		super(name);
		this.taste = t;
		this.weight = w;
		this.size = size;
		
		if(size == 'S') {
			totalPrice();  // overloading with no argument
			getVitaminA();  // overloading with no argument
			
			System.out.println("Type\t: "+name);
			System.out.println("Weight\t: "+weight);
			System.out.println("Taste\t: "+taste);
			System.out.println("Size\t: "+size);
			System.out.println("Total Vitamin A\t: "+getVitaminA()+"mg");
			System.out.println("Total Price\t: RM "+totalPrice());
			System.out.println("Do you want a plastic: " + plastic());
		}
		else  {
			double newP = weight*1.8;  //set new price
			Discount o = new OrangeDiscount();
			double discount = o.rateOfDiscount();  //set discount rate
			double vitA = 41.4;  //set new Vitamin A
			
			System.out.println("Type\t: "+name);
			System.out.println("Weight\t: "+weight+"kg");
			System.out.println("Taste\t: "+taste);
			System.out.println("Size\t: "+size);
			System.out.println("Total Vitamin A\t: "+getVitaminA(vitA)+"mg");  //overloading with 1 argument
			System.out.println("Price before discount\t: RM "+totalPrice(newP));  //overloading with 1 argument
			System.out.println("Discount\t: "+discount*100+"%");
			System.out.println("Price after discount\t: RM "+totalPrice(newP,discount));  //overloading with 2 argumeng
			System.out.println("Do you want a plastic: " + plastic());
		}

		
	}
	
	public double totalPrice() {
		return this.weight*1.2;
	}

	public double totalPrice(double newP) {
		return this.weight*newP;
	}
	
	public double totalPrice(double newP,double discount) {
		return (this.weight*newP)*(1-discount);
	}
	
	public double getVitaminA() {
		return this.weight*33.2;
	}
	
	public double getVitaminA(double vitA) {
		return this.weight*vitA;
	}
	
	public String plastic() { //overriding
		return "No";
	}
}
