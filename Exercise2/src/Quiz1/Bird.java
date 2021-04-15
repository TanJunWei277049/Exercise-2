package Quiz1;

import java.util.Scanner;

public class Bird {

	Scanner scan = new Scanner(System.in);
	
	String name;
	String color;
	char size;
	double weight;
	
	public void setName() {
		System.out.print("Enter its name :");
		this.name = scan.next();
	}
	
	public void setColor() {
		System.out.print("Enter its color :");
		this.color = scan.next();
	}
	
	public void setSize() {
		System.out.print("Enter its size :");
		this.size = scan.next().charAt(0);
	}
	
	public void setWeight() {
		System.out.print("Enter its weight :");
		this.weight = scan.nextDouble();
	}
	
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public char getSize() {
		return size;
	}
	
	public double getWeight() {
		return weight;
	}
}
