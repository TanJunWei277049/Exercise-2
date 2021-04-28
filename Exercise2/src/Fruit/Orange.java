package Fruit;

public class Orange extends Fruit{
	private String country;
	private int vitA;

	public Orange(String name,String country,int vitA) {
		super(name);
		this.country = country;
		this.vitA=vitA;

	}
	
	public int getVitA() {
		return vitA;
	}
	
	
	
	public String toString() {
		
		return  super.toString()+"\n"+
				super.getName()+" is come from "+country;
	}
}
