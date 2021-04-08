package DogScanner;

import java.util.*;

public class Dog {
	
	Scanner s = new Scanner(System.in);
	
	double total, foodWeight;
	int age;
	
	void printInfo() {
		
		System.out.println("Enter dog's name, color, gender, height and weight :");
		
		// String input
		String name = s.next();
		String color = s.next();
		
		//char input
		char gender = s.next().charAt(0);
		
		//int input
		int height = s.nextInt();
		int weight = s.nextInt();
		
		System.out.println("Name \t:" + name);
		System.out.println("Color \t:" + color);
		System.out.println("Gender \t:" + gender);
		System.out.println("Height \t:" + height +"cm");
		System.out.println("Weight \t:" + weight + "kg");
		System.out.println();
	}
	
	void instruction() {
		System.out.println("Enter an instruction (Sit,Bark,Lay or Jump) :");
		String i = s.next();
		
		switch(i) {
		case "Sit" : System.out.println("Sitting on the floor.");
						break;
		case "Bark" : System.out.println("Woof woof.");
						break;
		case "Lay" : System.out.println("Laying down.");
						break;
		case "Jump" : System.out.println("Jumping...");
						break;
		
		}
		System.out.println();
	}
	
	void food() {
		System.out.println("Enter type of food :");
		String food = s.next();
		
		System.out.println("Enter price of food :");
		double price = s.nextDouble();
		
		total = price*3*31; //price of 1 meal*3times*31 days
		
		System.out.println("It likes to eat " + food);
		System.out.printf("Cost of food for a month is RM%.2f%n%n",total);
	}
	
	void foodAmount() {
		System.out.print("Enter weight of food :");
		double f = s.nextDouble();
		
		foodWeight = f*3*31;//weight of food for 1 meal *3 times*31 days
		
		System.out.println("It eats " + f +"kg a meal");
		System.out.printf("Therefore it eats %.2fkg a month%n%n",foodWeight);
	}
	
	void age() {
		System.out.print("Enter its year born :");
		int y = s.nextInt();
		
		age = 2021-y;
		
		System.out.println("It was born on year " + y);
		System.out.println("It is " + age + " years old");
		System.out.println();
	}
	
	void water() {
		System.out.println("Enter its age :");
		int a = s.nextInt();
		
		if(a>=5)
			System.out.println("It should drink at least 5 litre of water.");
		else 
			System.out.println("It should drink at least 2 litre of water.");
	}
	
}
