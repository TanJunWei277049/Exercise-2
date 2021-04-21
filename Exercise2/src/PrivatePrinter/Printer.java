package PrivatePrinter;

import java.util.Scanner;

public class Printer {
	private String model,color;
	private int maxPage;
	private double weight;
	
	Scanner input = new Scanner(System.in);
	
	//default constructor
	Printer(){
		System.out.print("Enter the model of printer :");
		this.model = input.next();
		System.out.print("Enter the weight of printer :");
		this.weight = input.nextDouble();
		System.out.print("Enter the color of printer :");
		this.color = input.next();
		System.out.print("Maximum pages can print :");
		this.maxPage = input.nextInt();
		
	}
	
	//parameterized constructor
	Printer(String m, String c, int p, double w){
		this.model = m;
		this.color = c;
		this.maxPage = p;
		this.weight = w;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getMaxPage() {
		return this.maxPage;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public double totalWeight() {
		return this.weight*3;
	}
}
