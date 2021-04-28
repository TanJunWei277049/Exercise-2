package OverloadingOverriding;

public class redApple extends Apple{

	protected String size;
	protected int discount;
	
	public redApple(String name, double p,int q,String s) {
		super(name,p,q);
		size=s;
	}
	
	public String getSize() {
		return size;
	}
	
	public double payment() {  //overloading method with no parameter
		if(size.equals("Small")) 
			discount=10;
		else 
			discount=15;
		
		return super.totalPrice()*(100-discount)/100;	
	}
	
	public double payment(int d) {  //overloading method with one parameter
		return super.totalPrice()*(100-d)/100;
	}
	
	public String toString() {  //overriding
		return "Price after discount for " + getSize() + " size " + super.getName() + " is RM" + payment();
	}
}
