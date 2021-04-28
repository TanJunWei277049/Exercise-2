package OverloadingOverriding;

public class Orange extends Fruit{
	
	protected String country;
	protected int vitA;
	
	public Orange(String name,String c, int vit) {
		super(name);
		country = c;
		vitA = vit;
	}
	
	public int getVitA() {
		return vitA;
	}
	
	public String toString() {  //overriding
		return super.getName() + " is come from " + country + 
				"\nIt has " + getVitA() + "% of vitamin A";
	}
}
