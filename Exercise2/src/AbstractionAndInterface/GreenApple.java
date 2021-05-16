package AbstractionAndInterface;

public class GreenApple extends Apple{
	private String color;
	private char size;
	
	public GreenApple(String name, int q,double p, String c, char s) {
		super(name, q, p);
		color = c;
		size = s;
	}

	
	public String getColor() {
		return color;
	}
	
	public char getSize() {
		return size;	
	}
	
	public String plastic() {  //overriding
		return "Yes";
	}
	
}
