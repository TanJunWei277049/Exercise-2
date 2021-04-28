package OverloadingOverriding;

public class Apple extends Fruit {

	protected double price;
	protected int quantity;
	
	public Apple(String name, double p, int q) {
		super(name);
		price = p;
		quantity = q;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double totalPrice() {  //overloading method with no parameter
		return quantity*price;
	}
	
	public double totalPrice(double q) {  //overloading method with one parameter
		return q*0.5;
	}
	
	public String toString() {  //overriding
		return "Total price for " + quantity + " " + super.getName() + " is RM" + totalPrice();
	}
}
