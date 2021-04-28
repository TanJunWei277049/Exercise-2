package OverloadingOverriding;

public class greenApple extends Apple{
	
	private double weight;
	
	public greenApple(String name, double p, int q,double w) {
		super(name,p,q);
		this.weight=w;
		
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double totalWeight() {  //overloading method with no parameter
		return super.getQuantity()*getWeight();
	}
	
	public double totalWeight(int q) {  //overloading method with one parameter
		return q*0.35;
	}
	
	public String toString() {  //overriding
		return "Total weight for " + super.getQuantity() + " " + super.getName()+ " is " + totalWeight() + "kg";
	}
}
