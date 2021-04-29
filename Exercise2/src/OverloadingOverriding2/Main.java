package OverloadingOverriding2;

public class Main {

	public static void main(String[] args) {
		
		Apple a = new Apple("Apple",0.5,10);
		System.out.println(a);
		System.out.println("Total price for 5 apple is RM" + a.totalPrice(5));
		System.out.println();
		
		Orange o = new Orange("Orange","Japan",12,72,12);
		System.out.println(o);
		System.out.println();
		
		greenApple objG = new greenApple("Green Apple",0.7,10,0.35);
		System.out.println(objG);
		System.out.println("Total weight for 5 Green Apple is " + objG.totalWeight(5)+"kg");
		System.out.println();
		
		redApple objR = new redApple("Red Apple",1.1,10,"Small");
		System.out.println(objR);
		System.out.println("Price after discount for Medium size Red Apple is RM" + objR.payment(15));
		

	}

}
