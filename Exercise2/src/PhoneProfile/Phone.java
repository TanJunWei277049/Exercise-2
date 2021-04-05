package PhoneProfile;

public class Phone {
	//declare all type of variable and variable name
	String brand;
	int price;
	String color;
	double weight;
	char fingerprint;
	
	void printSpec(String b,String c,int p,double w,char f) {
		System.out.println("Brand :"+b);
		System.out.println("Price :" + "RM" + p);
		System.out.println("Color :"+c);
		System.out.println("Weight :" + w + "gram");
		System.out.println("Fingerprint :" + f);
		System.out.println();
		
	}
	
	void calcPrice(int p, int q) {
		int total = p*q;
		System.out.println("Total price = RM" + total);
	}
	
}
