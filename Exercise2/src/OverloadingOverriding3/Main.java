package OverloadingOverriding3;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("-----------------APPLE-----------------");
		Apple a = new Apple("Apple",5,1.5);
		System.out.println("Do you want a plastic: " + a.plastic());
		System.out.println(a);
		System.out.println();
		
		System.out.println("-----------------RED APPLE-----------------");
		RedApple r = new RedApple("Red Apple",10,1.3,"Japan");
		System.out.println("Red Apple is from: " + r.getCountry());
		System.out.println("Do you want a plastic: " + r.plastic());
		System.out.println(r);
		System.out.println();
		
		System.out.println("-----------------GREEN APPLE-----------------");
		GreenApple g = new GreenApple("Green Apple",15,1.7,"Green",'B');
		System.out.println("Color\t\t: "+g.getColor());
		System.out.println("Size\t\t: "+g.getSize());
		System.out.println("Do you want a plastic: " + g.plastic());
		System.out.println(g);
		System.out.println();

		System.out.println("-----------------DURIAN-----------------");
		Durian d = new Durian("Durian",35.8);
		System.out.println("Weight\t\t: "+ d.getWeight());
		System.out.println("Do you want a plastic: " + d.plastic());
		System.out.println();
		
		System.out.println("-----------------ORANGE-----------------");
		Orange o = new Orange("Orange","Sweet", 20.8);
		System.out.println("Taste\t\t: "+ o.getTaste());
		System.out.println("Weight\t\t: "+ o.getWeight());
		System.out.println("Do you want a plastic: " + d.plastic());
		System.out.println();
	}

}
