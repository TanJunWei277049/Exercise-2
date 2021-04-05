package PhoneProfile;

public class Main {

	public static void main(String[] args) {
		Phone vivo = new Phone(); //create new object from class Phone name as vivo
		Phone huawei = new Phone(); // create new object from class Phone name as huawei
		Phone samsung = new Phone();
		Phone oppo = new Phone();
		
		System.out.println("VIVO SPECIFICATION");
		vivo.printSpec("V19","RED",399,55.2,'Y');
		
		System.out.println("HUAWEI SPECIFICATION");
		huawei.printSpec("P40", "BLACK", 799, 50.8,'N');
		
		System.out.println("SAMSUNG SPECIFICATION");
		samsung.printSpec("Galaxy Note 20", "GREY", 1099, 60.9,'Y');
		
		System.out.println("OPPO SPECIFICATION");
		oppo.printSpec("Reno 3", "BLUE", 899, 52.3,'N');
		
		huawei.calcPrice(799, 5);
	}

}
