package Quiz1;

public class Main {

	public static void main(String[] args) {
		Bird eagle = new Bird();
		
		eagle.setName();
		eagle.setColor();
		eagle.setSize();
		eagle.setWeight();

		System.out.println("\nCharacteristics for Eagle");
		System.out.println("Name \t:" + eagle.getName());
		System.out.println("Color \t:" + eagle.getColor());
		System.out.println("Size \t:" + eagle.getSize());
		System.out.println("Weight \t:" + eagle.getWeight());
		System.out.println();

		Bird sparrow = new Bird();
		
		sparrow.setName();
		sparrow.setColor();
		sparrow.setSize();
		sparrow.setWeight();

		System.out.println("\nCharacteristics for Sparrow");
		System.out.println("Name \t:" + sparrow.getName());
		System.out.println("Color \t:" + sparrow.getColor());
		System.out.println("Size \t:" + sparrow.getSize());
		System.out.println("Weight \t:" + sparrow.getWeight());
		System.out.println();

	}

}
