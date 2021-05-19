package AbstractionAndInterface2;

public class Durian extends Apple{
	
	private double calory;
	
	public Durian(String name,int q,double p,double c) {
		super(name,q,p);
		this.calory = c;
	}

	public double getCalory() {
		return this.calory;
	}
}
