package AbstractionAndInterface2;

public class Orange extends Fruit{

	private double weight;
	private double price;
	private char size;
	
	public Orange(String name, double w,double p,char size) {
		super(name);
		this.weight = w;
		this.price = p;
		this.size = size;
		
		if(size == 'S') {
			TotalPrice o = new OrangeTotalPrice();
			
			System.out.println("Type\t\t: "+name);
			System.out.println("Weight\t\t: "+weight + "kg");
			System.out.println("Taste\t\t: "+taste());
			System.out.println("Size\t\t: "+size);
			System.out.println("Total Price\t: RM "+o.totalPrice(price, weight));
		}
		else if (size == 'M'){
			TotalPrice o = new OrangeTotalPrice();
			
			System.out.println("Type\t\t: "+name);
			System.out.println("Weight\t\t: "+ weight + "kg");
			System.out.println("Taste\t\t: "+taste());
			System.out.println("Size\t\t: "+size);
			System.out.println("Price before discount\t: RM "+ o.totalPrice(weight));
		}
		else {
			TotalPrice o = new OrangeTotalPrice();
			Discount od = new OrangeDiscount();
			double discount = od.rateOfDiscount();
			
			System.out.println("Type\t\t: "+name);
			System.out.println("Weight\t\t: "+ weight + "kg");
			System.out.println("Taste\t\t: "+taste());
			System.out.println("Size\t\t: "+size);
			System.out.println("Price before discount\t: RM "+ o.totalPrice(price, weight, discount));
		}

		
	}
	
	public String taste() {
		return "Sweet and sour";
	}

}
