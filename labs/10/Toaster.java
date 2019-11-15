
public class Toaster extends Appliance 
	implements Comparable <Appliance>{ 
	private double voltage;
	private String color;
	private String madeIn;
	private double price;

		
	public Toaster (double voltage, String color, String madeIn, double price) {
		super (voltage, color, madeIn, price);
	}
	
	public double getVoltage() {
		return voltage;
	}
	public String getColor(){
		return color;
	}
	public String getMadeIn(){
		return madeIn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price1) {
		price1 = price;
	}
	public int compareTo (Appliance object) {
		if (getPrice()> object.getPrice())
			return 1;
		else if (getPrice()< object.getPrice())
			return -1;
		else 
			return 0;
	}
	public String toString() {
		return super.toString() + " Toaster";
	}
}
