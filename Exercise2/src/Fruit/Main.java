package Fruit;

public class Main {

	public static void main(String[] args) {
		
		Fruit f = new Fruit(	"Fruit");		
		System.out.println(f);
		System.out.println();
		
		Orange objO= new Orange("Orange","USA",12);
		System.out.println(objO);
		System.out.println(objO.getName()+" contain "+objO.getVitA()+"% vitamin A \n ");		
		
		Apple objA = new Apple("Apple",5,4);
		System.out.println(objA);
		System.out.println("Total price apple : RM "+objA.totalPrice()+"\n");
		
		greenApple objG = new greenApple("GREEN APPLE",20,2,20);
		System.out.println(objG);
		System.out.println("Total price Green Apple : RM "+objG.totalPrice());
		System.out.println("Total weight Green Apple : "+objG.totalWeight() + "g\n");
		
		redApple objR =new redApple("RED APPLE", 10,5,"RED",'M');
		System.out.println(objR);
		System.out.println("Total price Red Apple : RM "+objR.totalPrice());
		System.out.println("Discount : "+objR.discount()+"%");
		System.out.println("Total Payment : RM "+objR.payment()+"\n");

	}

}
