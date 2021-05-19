package AbstractionAndInterface2;

public abstract class Fruit {  //define superclass as abstract class

	private String name;
	
	public Fruit(String name){ //constructor
		this.name = name;
	}
	
	public String toString() {
		return name + " constructor is invoked";
	}
	
	// abstract method that has only the heading with no body
	/*public abstract double totalPrice();
	public abstract double totalPrice(double newP);
	public abstract double totalPrice(double newP, double discount);*/
	
	public abstract String taste();
}
