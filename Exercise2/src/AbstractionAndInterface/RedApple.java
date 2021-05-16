package AbstractionAndInterface;

public class RedApple extends Apple{
	private String country;
	
	public RedApple(String name, int q, double p, String c) {
		super(name,q,p);
		this.country = c;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public String plastic() {  //overriding
		return "No";
	}
	
}
