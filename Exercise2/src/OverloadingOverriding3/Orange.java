package OverloadingOverriding3;

public class Orange extends Fruit{

	private String taste;
	private double weight;
	
	public Orange(String name,String t, double w) {
		super(name);
		this.taste = t;
		this.weight = w;
	}
	
	public String getTaste() {
		return this.taste;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public String plastic() { //overriding
		return "No";
	}
}
