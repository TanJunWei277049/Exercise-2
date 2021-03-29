package Example2;

public class Main {

	public static void main(String[] args) {		
		
		MyDog a = new MyDog();
		AliDog b = new AliDog();
		
		System.out.println("Number of eyes for my dog is " + a.eyes);
		System.out.println("Number of legs for my dog is " + a.legs);
		System.out.println("Size of my dog is " + a.size);
		
		a.walk();
		a.sleep();
		a.bark();
		
		System.out.println();
		
		System.out.println("Number of eyes for Ali's dog is " + b.eyes);
		System.out.println("Number of legs for Ali's dog is " + b.legs);
		System.out.println("Size of Ali's dog is " + b.size);
		
		b.walk();
		b.sleep();
		b.bark();
	}

}
