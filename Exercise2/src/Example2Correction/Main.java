package Example2Correction;

public class Main {

	public static void main(String[] args) {
		Dog myDog = new Dog();
		Dog AliDog = new Dog();
		
		myDog.name = "Lucky";
		myDog.color = "Brown";
		myDog.size = 'M';
		
		AliDog.name = "John";
		AliDog.color = "Yellow";
		AliDog.size = 'L';
		
		System.out.println("My dog's name is "+ myDog.name);
		System.out.println("Its color is " + myDog.color);
		System.out.println("Its size is " + myDog.size);
		
		myDog.walk();
		myDog.sleep();
		myDog.bark();
		
		System.out.println("\n");
		System.out.println("Ali's dog's name is " + AliDog.name);
		System.out.println("Its color is " + AliDog.color);
		System.out.println("Its size is " + AliDog.size);
		
		AliDog.walk();
		AliDog.sleep();
		AliDog.bark();

	}

}
