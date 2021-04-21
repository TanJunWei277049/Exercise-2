package PrinterInheritance;

public class Printer {
	
	private double weight;
	private double num;
	
	public Printer(double w, double n) {
		weight = w;
		num = n;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public double getNum() {
		return num;
	}
	
	public double totalWeight() {
		return weight*num;
	}
	
	public String toString() {
		return ("Weight \t\t\t:" + weight + "kg" + "\nNumber of printer \t:" + num);
	}
}
