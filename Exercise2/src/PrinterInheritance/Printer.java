package PrinterInheritance;

import java.util.Scanner;

public class Printer {
	Scanner input = new Scanner(System.in);
	
	private double weight;
	private double num;
	
	public Printer() {
		System.out.println("Enter weight and number of printer :");
		weight = input.nextDouble();
		num = input.nextDouble();
	}
	
	public double getWeight(){
		return weight;
	}
	
	public double getNum() {
		return num;
	}
	
	public double totalWeight() {
		return weight*num;
	}
	
	public String toString() {
		return ("Weight \t\t\t:" + weight + "kg" + "\nNumber of printer \t:" + num);
	}
}
