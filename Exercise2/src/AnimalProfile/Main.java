package AnimalProfile;

public class Main {

	public static void main(String[] args) {
		Dog bulldog = new Dog();
		Dog poodle = new Dog();
		Dog boxer = new Dog();
		Dog rottweiler = new Dog();
		
		System.out.println("Information for Bulldog");
		bulldog.printInfo("John", "Yellow", 'M', 30.2, 23.3);
		bulldog.instruction("Jump");
		bulldog.food("Blueberries", 2.1);
		bulldog.foodAmount(1.2);
		bulldog.age(2018);
		bulldog.water(3);
		
		System.out.println("\n--------------------------------------------------");
		System.out.println("Information for Poodel");
		poodle.printInfo("Mary", "White", 'F', 41.1, 32.3);
		poodle.instruction("Lay");
		poodle.food("Fish Meat", 3.5);
		poodle.foodAmount(1.5);
		poodle.age(2017);
		poodle.water(4);
		
		System.out.println("\n--------------------------------------------------");
		System.out.println("Information for Boxer");
		boxer.printInfo("Lucky", "Brown", 'M', 55.1, 29.5);
		boxer.instruction("Bark");
		boxer.food("Blackberries", 2.3);
		boxer.foodAmount(2.3);
		boxer.age(2009);
		boxer.water(12);
		
		System.out.println("\n--------------------------------------------------");
		System.out.println("Information for Rottweiler");
		rottweiler.printInfo("May", "Black", 'F', 56.8, 40.7);
		rottweiler.instruction("Sit");
		rottweiler.food("Chicken Meat", 3.9);
		rottweiler.foodAmount(2.9);
		rottweiler.age(2013);
		rottweiler.water(8);

	}

}
