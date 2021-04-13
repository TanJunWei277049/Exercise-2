package ProtonSetterGetter;

public class Main {

	public static void main(String[] args) {
		Proton p = new Proton();
		
		p.setBrand("X70");
		p.setColor("RED");
		p.setSpeed(200);
		p.setWeight(965.23);
		p.setBootspace(256.14);
		
		System.out.println("Brand :" + p.getBrand());
		System.out.println(p.getColor());
		System.out.println(p.getSpeed());
		System.out.println(p.getWeight());
		System.out.println("Boot Space :" + p.getBootspace() + "Kg");

		p.fullThrottle();
		
	}

}
