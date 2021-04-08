package DogScanner;

public class Main {

	public static void main(String[] args) {
		Dog bulldog = new Dog();
		Dog poodle = new Dog();
		Dog boxer = new Dog();
		Dog rottweiler = new Dog();
		
		System.out.println("Information for Bulldog");
		bulldog.printInfo();
		bulldog.instruction();
		bulldog.food();
		bulldog.foodAmount();
		bulldog.age();
		bulldog.water();
		
		System.out.println("\n--------------------------------------------------");
		System.out.println("Information for Poodel");
		poodle.printInfo();
		poodle.instruction();
		poodle.food();
		poodle.foodAmount();
		poodle.age();
		poodle.water();
		
		System.out.println("\n--------------------------------------------------");
		System.out.println("Information for Boxer");
		boxer.printInfo();
		boxer.instruction();
		boxer.food();
		boxer.foodAmount();
		boxer.age();
		boxer.water();
		
		System.out.println("\n--------------------------------------------------");
		System.out.println("Information for Rottweiler");
		rottweiler.printInfo();
		rottweiler.instruction();
		rottweiler.food();
		rottweiler.foodAmount();
		rottweiler.age();
		rottweiler.water();

	}

}
