package Example2;

public class Main {

	public static void main(String[] args) {
		
		Phone a = new Phone();
		
		System.out.println("The phone color is " + a.color);
		System.out.println("The phone brand is " + a.brand);
		System.out.println("The phone storage is " + a.storage + "gb");
		
		a.makeCall();
		a.playMusic();
		a.takePicture();
		
		Dog b = new Dog();
		
		System.out.println("Number of eyes for dog is " + b.eyes);
		System.out.println("Number of legs for dog is " + b.legs);
		System.out.println("Size of a dog is " + b.size);
		
		b.walk();
		b.sleep();
		b.bark();
	}

}
