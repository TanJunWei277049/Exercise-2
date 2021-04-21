package PrinterInheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double w,n,p;
		
		Scanner in = new Scanner(System.in);
		
		Printer objPrint = new Printer(5.2,5);

		System.out.println(objPrint);
		System.out.println("Total weight \t\t:" + objPrint.totalWeight() + "kg");
		
		System.out.print("Enter weight,number and price :");
		w = in.nextDouble();
		n = in.nextDouble();
		p = in.nextDouble();
		
		HP objhp = new HP(w,n,p);
		
		System.out.println(objhp);
		System.out.printf("Total price \t\t:RM %.2f",objhp.totalPrice());
		
	}
}
