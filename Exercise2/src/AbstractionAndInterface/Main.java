package AbstractionAndInterface;


public class Main {

	public static void main(String[] args) {
		System.out.println("-----------------APPLE-----------------");
		Apple a = new Apple("Apple",5,1.5);
		System.out.println(a + "\n");
		
		System.out.println("-----------------RED APPLE-----------------");
		RedApple r = new RedApple("Red Apple",10,1.3,"Japan");
		System.out.println("Red Apple is from: " + r.getCountry());
		System.out.println(r + "\n");
		
		System.out.println("-----------------GREEN APPLE-----------------");
		GreenApple g = new GreenApple("Green Apple",15,1.7,"Green",'B');
		System.out.println("Color\t\t: "+g.getColor());
		System.out.println("Size\t\t: "+g.getSize());
		System.out.println(g + "\n");

		System.out.println("-----------------DURIAN-----------------");
		Durian d = new Durian("Durian",35.8,30,41.2);
		System.out.println(d + "\n");
		
		System.out.println("-----------------ORANGE-----------------");
		Orange o = new Orange("Orange","Sweet", 20.8,'M');
		System.out.println(o + "\n");
	}


}
