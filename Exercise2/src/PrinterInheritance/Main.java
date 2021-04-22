package PrinterInheritance;

public class Main {

	public static void main(String[] args) {
		double w,n,p;
		
		
		Printer objPrint = new Printer();

		System.out.println(objPrint);
		System.out.println("Total weight \t\t:" + objPrint.totalWeight() + "kg");
		
		
		HP objhp = new HP();
		
		System.out.println(objhp);
		System.out.printf("Total price \t\t:RM %.2f",objhp.totalPrice());
		
	}
}
