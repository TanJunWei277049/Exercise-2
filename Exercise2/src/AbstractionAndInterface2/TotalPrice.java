package AbstractionAndInterface2;

interface TotalPrice {

	double totalPrice(double quantity);
	double totalPrice(double price, double quantity);
	double totalPrice(double price,double quantity,double discount);
}
