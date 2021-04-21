package PrivatePrinter;

public class Main {

	public static void main(String[] args) {
		
		Printer hp = new Printer();
		
		System.out.println();
		System.out.println("Specification for HP printer");
		System.out.println("Model \t\t\t:" + hp.getModel());
		System.out.println("Color \t\t\t:" + hp.getColor());
		System.out.println("Weight \t\t\t:" + hp.getWeight());
		System.out.println("Maximum pages can print :" + hp.getMaxPage());
		System.out.printf("Total weight \t\t:%.2f%n",hp.totalWeight());

		Printer canon = new Printer("MF3010","Black",100,7.6);
		
		System.out.println();
		System.out.println("Specification for Canon printer");
		System.out.println("Model \t\t\t:" + canon.getModel());
		System.out.println("Color \t\t\t:" + canon.getColor());
		System.out.println("Weight \t\t\t:" + canon.getWeight());
		System.out.println("Maximum pages can print :" + canon.getMaxPage());
		System.out.printf("Total weight \t\t:%.2f%n",canon.totalWeight());
	}

}
