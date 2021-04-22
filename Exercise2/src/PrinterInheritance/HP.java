package PrinterInheritance;

import java.util.Scanner;

public class HP extends Printer{

	Scanner input = new Scanner(System.in);
	private double price;
	
	public HP() {
		
		super();
		System.out.println("Enter price :");
		price = input.nextDouble();
		
	}
	
	public double getPrice() {
		return price;
	}
	
	public double totalPrice() {
		return super.totalWeight()*price;
	}
	
	public String toString() {
		return super.toString() + "\nPrice \t\t\t:RM " + price;
	}
}
