package ProtonScanner;

import java.util.*; //import util pakage that including Scanner class

public class Proton {

	Scanner s = new Scanner(System.in);
	
	void speed() {
		System.out.println("Enter Max Speed :");
		int m = s.nextInt();
		System.out.println("The maximum speed is :" + m);
	}
	
	void carColor() {
		System.out.println("Enter Brand and Color");
		s.nextLine();
		String b = s.nextLine();
		String c = s.nextLine();
		
		System.out.println("The car brand is "+b);
		System.out.println("The car color is "+c);
	}
	
}
