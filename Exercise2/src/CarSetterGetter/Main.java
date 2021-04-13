package CarSetterGetter;

public class Main {

	public static void main(String[] args) {
		
		Car audi = new Car();
		
		audi.setBrand("A5");
		audi.setColor("Black");
		audi.setHeight(1.38);
		audi.setWeight(1695.32);

		System.out.println("Brand \t\t:" + audi.getBrand());
		System.out.println("Color \t\t:" + audi.getColor());
		System.out.println("Height \t\t:"  + audi.getHeight());
		System.out.println("Weight \t\t:" + audi.getWeight());
	}

}
