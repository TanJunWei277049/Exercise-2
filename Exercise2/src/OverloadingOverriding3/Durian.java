package OverloadingOverriding3;

public class Durian extends Fruit{
	
	private double weight;

	public Durian(String name,double w) {
		super(name);
		this.weight = w;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public String plastic() { //overriding
		return "No";
	}

}
