package AbstractionAndInterface2;

public class Main {

	public static void main(String[] args) {
		
		Apple a = new Apple("Apple",10,3);  //name,quantity,price
		System.out.println(a+"\n");
		
		RedApple ra = new RedApple("Red Apple",12,2.8,"Japan"); //name,quantity,price,country
		System.out.println("Country\t\t: "+ra.getCountry());
		System.out.println(ra+"\n");
		
		Durian d = new Durian("Durian",9,3.5,61.5);  //name,quantity,price,calory
		System.out.println("Calory\t\t: " + d.getCalory()+"mg");
		System.out.println(d+"\n");
		
		Orange o = new Orange("Orange",25.3,2.9,'M');  // name,weight,price,size
		System.out.println(o+"\n");
	}

}
