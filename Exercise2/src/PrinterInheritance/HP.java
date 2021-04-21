package PrinterInheritance;

public class HP extends Printer{

	private double price;
	
	public HP(double w, double n, double p) {
		
		super(w,n);
		price = p;
		
	}
	
	public double getPrice() {
		return price;
	}
	
	public double totalPrice() {
		return super.totalWeight()*price;
	}
	
	public String toString() {
		return super.toString() + "\nPrice \t\t\t:RM " + price;
	}
}
