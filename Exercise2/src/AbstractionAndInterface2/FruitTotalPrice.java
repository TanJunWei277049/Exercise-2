package AbstractionAndInterface2;

class AppleTotalPrice implements TotalPrice{
	
	public double totalPrice(double quantity) {
		double price = 2.2;
		return price*quantity;
	}
	
	public double totalPrice(double price,double quantity) {
		return price*quantity;
	}
	
	public double totalPrice(double price,double quantity,double discount) {
		return  (price*quantity)*(1-discount);
	}
	
}

class OrangeTotalPrice implements TotalPrice{
	
	public double totalPrice(double weight) {
		double price = 2.5;
		return price*weight;
	}
	
	public double totalPrice(double price,double weight) {
		return price*weight;
	}
	
	public double totalPrice(double price,double weight,double discount) {
		return  (price*weight)*(1-discount);
	}
}
