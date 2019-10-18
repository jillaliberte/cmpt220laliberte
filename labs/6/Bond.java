
public class Bond {
	private double coupon;
	private int payments;
	private double interest;
	private double valueMaturity;
	
	public Bond(){
		coupon = 1;
		payments = 1;
		interest = 1;
		valueMaturity = 1;
	}
	
	public Bond(double coup2, int pay2, double interest2, double value2){
		coupon = coup2;
		payments = pay2;
		interest = interest2;
		valueMaturity = value2;			
	}
	double getPrice() {
		double x = interest+1;
		double y = Math.pow(x, payments);
		return coupon*(1-(1/y))+ valueMaturity * 1/y;
	}
	
}

