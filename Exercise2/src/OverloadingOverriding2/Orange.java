package OverloadingOverriding2;

public class Orange extends Fruit{

	protected String country;
	protected int vitA;
	
	public Orange(String name,String c, int vit) {
		super(name);
		country = c;
		vitA = vit;
		
		delicious();
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
