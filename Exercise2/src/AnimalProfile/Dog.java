package AnimalProfile;

public class Dog {
	double total, foodWeight;
	int age;
	
	void printInfo(String n, String c, char g, double h, double w) {
		System.out.println("Name \t:" + n);
		System.out.println("Color \t:" + c);
		System.out.println("Gender \t:" + g);
		System.out.println("Height \t:" + h +"cm");
		System.out.println("Weight \t:" + w + "kg");
		
	}
	
	void food(String food, double price) {
		total = price*3*31; //price of 1 meal*3times*31 days
		System.out.println("It likes to eat " + food);
		System.out.printf("Cost of food for a month is RM%.2f%n",total);
	}
	
	void foodAmount(double f) {
		foodWeight = f*3*31;//weight of food for 1 meal *3 times*31 days
		System.out.println("It eats " + f +"kg a meal");
		System.out.printf("Therefore it eats %.2fkg a month",foodWeight);
	}
	
	void age(int y) {
		age = 2021-y;
		System.out.println("It was born on year " + y);
		System.out.println("It is " + age + " years old");
	}
	
	
}
