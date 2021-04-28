package Fruit;

public class greenApple extends Apple{
	private int weight;
	
	public greenApple(String name, int q, int p,int w) {
		super(name,q,p);
		this.weight=w;
		
	}
	
	public int getWeight() {
		return weight;
	}
	
	public int totalWeight() {
		return super.getQuantity()*getWeight();
	}
	
	
	public String toString() {
		return super.toString()+"\n"+
			   super.getName()+" weight : "+getWeight() + "g";
	}
}
