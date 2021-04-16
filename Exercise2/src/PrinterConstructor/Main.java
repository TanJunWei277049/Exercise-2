package PrinterConstructor;

public class Main {

	public static void main(String[] args) {
		
		Printer hp = new Printer();
		
		System.out.println();
		System.out.println("Specification for HP printer");
		System.out.println("Model \t\t\t:" + hp.model);
		System.out.println("Color \t\t\t:" + hp.color);
		System.out.println("Weight \t\t\t:" + hp.weight);
		System.out.println("Maximum pages can print :" + hp.maxPage);

		Printer canon = new Printer("MF3010","Black",100,7.6);
		
		System.out.println();
		System.out.println("Specification for Canon printer");
		System.out.println("Model \t\t\t:" + canon.model);
		System.out.println("Color \t\t\t:" + canon.color);
		System.out.println("Weight \t\t\t:" + canon.weight);
		System.out.println("Maximum pages can print :" + canon.maxPage);
	}

}
