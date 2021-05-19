package AbstractionAndInterface2;

class AppleDiscount implements Discount{
	public double rateOfDiscount() {
		return 0.25;
	}
	
}

class OrangeDiscount implements Discount{
	public double rateOfDiscount() {
		return 0.35;
	}
	
}

class DurianDiscount implements Discount{
	public double rateOfDiscount() {
		return 0.45;
	}
	
}

class RedAppleDiscount implements Discount{
	public double rateOfDiscount() {
		return 0.3;
	}
}
