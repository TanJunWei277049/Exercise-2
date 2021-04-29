package OverloadingOverriding2;

public class Orange extends Fruit{

	protected String country;
	protected int vitA;
	private int box;
	
	public Orange(String name,String c, int vit,int n, int b) {
		super(name);
		country = c;
		vitA = vit;
		
		delicious();
		
		quantity();
		quantity(b);
		quantity(n,b);
	}
	
	public void quantity() {
		System.out.println("I want to buy 72 Orange");
	}
	
	public void quantity(int b) {
		System.out.println("There are " + b + " Orange in a box");
	}
	
	public void quantity(int number, int b) {
		this.box = number/b;
		System.out.println(number + " is equal to " + box + " boxes of Orange");
	}
	
	public void delicious() {  //overriding
		System.out.println(super.getName()+" is delicious");
	}
	
	public int getVitA() {
		return vitA;
	}
	
	
	public String toString() {  //overriding
		return super.getName() + " is come from " + country + 
				"\nIt has " + getVitA() + "% of vitamin A";
	}
}
