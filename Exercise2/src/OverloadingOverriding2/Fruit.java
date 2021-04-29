package OverloadingOverriding2;

public class Fruit {
	private String name;
	
	public Fruit(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {  //overriding
		return name + " is delicious ";
	}
	
}
