package AbstractionAndInterface;

public class Durian extends Fruit{
	
	private double weight;
	private double price;
	public double calory;

	public Durian(String name,double w,double p,double c) {
		super(name);
		this.weight = w;
		this.price = p;
		this.calory = c;
		
		if(weight<=30) {
			totalPrice();
			calory();
			System.out.println("Type\t\t: "+name);
			System.out.println("Weight\t\t: "+weight);
			System.out.println("Unit Price\t: RM "+price);
			System.out.println("Amount of calory:"+calory()+"mg");
			System.out.println("Total Price\t: RM "+totalPrice());
			System.out.println("Do you want a plastic: " + plastic());
		}
		else if(weight>30&&weight<=50) {
			double newP=25;
			totalPrice(newP);
			double newCalory = 51.6;
			calory(newCalory);
			System.out.println("Type\t\t: "+name);
			System.out.println("Weight\t\t: "+weight);
			System.out.println("Unit Price\t: RM "+newP);
			System.out.println("Amount of calory:"+calory(newCalory)+"mg");
			System.out.println("Total Price\t: RM "+totalPrice(newP));
			System.out.println("Do you want a plastic: " + plastic());
		}
		else {
			double newP=21;
			Discount d = new DurianDiscount();
			double discount = d.rateOfDiscount();
			totalPrice(newP,discount);
			double newCalory = 62.3;
			calory(newCalory);
			System.out.println("Type\t\t: "+name);
			System.out.println("Weight\t: "+weight);
			System.out.println("Unit Price\t: RM "+newP);
			System.out.println("Amount of calory:"+calory(newCalory)+"mg");
			System.out.println("Discount\t: "+discount*100+"%");
			System.out.println("Total Price\t: RM "+totalPrice(newP,discount));
			System.out.println("Do you want a plastic: " + plastic());
		}
	}
	
	public double totalPrice() {
		return this.weight*this.price;
	}

	public double totalPrice(double newP) {
		return this.weight*newP;
	}
	
	public double totalPrice(double newP,double discount) {
		return (this.weight*newP)*(1-discount);
	}
	
	public double calory() {
		return this.calory;
	}
	
	public double calory(double newCalory) {
		return newCalory;
	}
	
	public String plastic() { //overriding
		return "No";
	}
}
